package com.rabbitpoc.test.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

	@Autowired
	private MessageSenderService messageSenderService;
	@GetMapping("/send")
	public void sendMessage() {
		messageSenderService.sendMessage();
	}
}
