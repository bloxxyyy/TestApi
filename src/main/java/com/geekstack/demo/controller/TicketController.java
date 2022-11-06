package com.geekstack.demo.controller;

import com.geekstack.demo.model.Tickets;
import com.geekstack.demo.service.JiraTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

	private JiraTicketService jiraTicketService;

	@Autowired
	public TicketController(JiraTicketService jiraTicketService) {
		this.jiraTicketService = jiraTicketService;
	}

	// https://test1app2koko3.atlassian.net/rest/api/2/search?jql=ORDER%20BY%20Created&maxResults=50&startAt=0
	// https://[yoursitename].atlassian.net/rest/api/2/search?jql=ORDER%20BY%20Created&maxResults=50&startAt=50

	@GetMapping("/tickets.get")
	public ResponseEntity<String> loadJiraTickets() {
		try {

			String response = jiraTicketService.getJiraTickets();
			response = jiraTicketService.alterTest();

			return new ResponseEntity<String>(response, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Unable to process your request", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
