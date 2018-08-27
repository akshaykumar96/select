package com.example.SelectService;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends MongoRepository<Ticket, Integer> {
	
	//public Ticket findByMovieName(String movieName);

	
	

}
