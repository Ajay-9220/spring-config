package in.ajayit.rest;

import java.awt.PageAttributes.MediaType;
import java.time.Duration;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ajayit.binding.CustomerEvent;
import lombok.Data;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/event", produces = "application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent() {

		CustomerEvent event = new CustomerEvent("Ajay", new Data());

		Mono<CustomerEvent> customerMono = Mono.just(event);

		return new ResponseEntity<>(customerMono, HttpStatus.OK);

	}

	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvent() {
		CustomerEvent event = new CustomerEvent("Ajay", new Data());
		Stream<CustomerEvent> customerStream = Stream.generate(() -> event);
		Flux<CustomerEvent> cflux = Flux.fromStream(customerStream);
		Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(5));
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(intervalFlux, cflux);
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		return new ResponseEntity<>(fluxMap, HttpStatus.OK);

	}

}
