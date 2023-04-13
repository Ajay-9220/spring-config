package in.ajayit.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ajayit.binding.PassangerInfo;
import in.ajayit.binding.TicketInfo;

public class TicketController {

	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<TicketInfo> getTicket(@RequestBody PassangerInfo requst) {
		System.out.println(requst);
		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(1234);
		tinfo.setPnr("JLJL6868");
		tinfo.setTicketStatus("CONFIRMED");

		return new ResponseEntity<TicketInfo>(tinfo, HttpStatusCode.CREATED);

	}

}
