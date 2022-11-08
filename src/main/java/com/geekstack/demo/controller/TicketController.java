package com.geekstack.demo.controller;

import com.geekstack.demo.model.Tickets;
import com.geekstack.demo.service.JiraTicketService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

@RestController
public class TicketController {

	private JiraTicketService jiraTicketService;

	@Autowired
	public TicketController(JiraTicketService jiraTicketService, RestTemplate restTemplate) {
		this.jiraTicketService = jiraTicketService;
		this.restTemplate = restTemplate;
	}

	// https://test1app2koko3.atlassian.net/rest/api/2/search?jql=ORDER%20BY%20Created&maxResults=50&startAt=0
	// https://[yoursitename].atlassian.net/rest/api/2/search?jql=ORDER%20BY%20Created&maxResults=50&startAt=50


	private RestTemplate restTemplate;



	@Value("${jira.tempo-secret}")
	private String tempo_secret;

	public HttpHeaders getHeaders() {
		String auth = tempo_secret;
		//byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Bearer " + auth;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);
		return headers;
	}

	@GetMapping("/tickets.get")
	public ResponseEntity<String> loadJiraTickets() {

		var header = getHeaders();

		var accountId = "5a7f9c24857e333eafe7973c";

		ResponseEntity<String> response = restTemplate.exchange(
				"https://api.tempo.io/4/worklogs/user/" + accountId, HttpMethod.GET, new HttpEntity(header), String.class);

		return new ResponseEntity<String>(response.getBody(), HttpStatus.ACCEPTED);

		/*

		try {

			String response = jiraTicketService.getJiraTickets();
			response = jiraTicketService.alterTest();

			return new ResponseEntity<String>(response, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Unable to process your request", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		*/

	}

}
