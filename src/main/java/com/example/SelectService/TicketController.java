package com.example.SelectService;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class TicketController {
	@Autowired
	private TicketService service;
	
	@PostMapping("/create")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Ticket create(@RequestBody Ticket tic) {
		service.create(tic.getNoOfTickets(),tic.getClasss(), tic.getDaate(),tic.getScreen(), tic.getShows());
		return tic;
	}
	
	

}
