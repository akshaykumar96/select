package com.example.SelectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	private TicketRepo repo;

	public Ticket create(String noOfTickets, String classs, String daate, String screen,String shows) {
		
		return repo.save(new Ticket(noOfTickets, classs ,daate,screen, shows));
		
		
	}
	

}
