package com.geekstack.demo.controller;

import com.geekstack.demo.model.tempo.Worklog;
import com.geekstack.demo.service.JiraTicketService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	@Value("${jira.user-name}")
	private String username;
	@Value("${jira.secret}")
	private String secret;
	@Value("${jira.base-url}")
	private String baseUrl;
	@Value("${jira.ticket-url}")
	private String ticketCreationUrl;
	@Value("${jira.tickets-url}")
	private String ticketsLoadingUrl;
	public HttpHeaders jiraGetHeaders() {
		String auth = username + ":" + secret;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);
		return headers;
	}

	@GetMapping("/tickets.getIssue")
	public ResponseEntity<String> getIssue() {
		ResponseEntity<String> response = restTemplate.exchange(
				"https://test1app2koko3.atlassian.net/rest/api/2/issue/10001", HttpMethod.GET, new HttpEntity(jiraGetHeaders()), String.class);

		return new ResponseEntity<String>(response.getBody(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/field")
	public ResponseEntity<String> getField() {
		ResponseEntity<String> response = restTemplate.exchange(
				"https://test1app2koko3.atlassian.net/rest/api/3/field", HttpMethod.GET, new HttpEntity(jiraGetHeaders()), String.class);

		return new ResponseEntity<String>(response.getBody(), HttpStatus.ACCEPTED);
	}



	/*
	query Parameters
	from
	string

	Retrieve results starting with this date
	to
	string

	Retrieve results up to and including this date
	updatedFrom
	string

	Retrieve results that have been updated from this date
	offset
	integer <int32>
	Default: 0

	Skip over a number of elements by specifying an offset value for the query
	limit
	integer <int32>
	Default: 50

	Limit the number of elements on the response

	 */

	@GetMapping("/tickets.get")
	public ResponseEntity<String> loadJiraTickets() {

		var header = getHeaders();

		var accountId = "5a7f9c24857e333eafe7973c";

		ResponseEntity<String> response = restTemplate.exchange(
				"https://api.tempo.io/4/worklogs/user/" + accountId, HttpMethod.GET, new HttpEntity<Worklog>(header), String.class);

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
