package com.nissandigital.voice.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedBackController {
	@Autowired
	FeedBackRepository feedBackRepository;
	
}
