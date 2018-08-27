package com.example.SelectService;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ticket")
public class Ticket {
	
	
	private String noOfTickets;
	private String classs;
	private String daate;
	private String screen;
	private String shows;
	
	
	
	
	
	public Ticket() {
		super();
	}
	
	public Ticket( String noOfTickets, String classs, String daate, String screen, String shows) {
		super();
		
		this.noOfTickets = noOfTickets;
		this.classs = classs;
		this.daate = daate;
		this.screen = screen;
		this.shows = shows;
	}

	

	public String getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(String noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public String getShows() {
		return shows;
	}
	public void setShows(String price) {
		this.shows = price;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getDaate() {
		return daate;
	}
	public void setDaate(String daate) {
		this.daate = daate;
	}
	
	
	
	
	
	

}

