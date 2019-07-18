package com.nissandigital.voice.feedback.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nissandigital.voice.feedback.model.Feedback;


public interface FeedBackRepository extends MongoRepository<Feedback, String> {

	
	
}
