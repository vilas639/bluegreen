package com.example.bluegreen.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@RestController
public class BlueController {

	
	@GetMapping("test1")
    public String hi()
    {
        return  "Welcome Blue Deployment";
    }
	
	
	 @PostMapping("test2")
	    public ResponseEntity<Object> fetchPerson() throws JsonProcessingException {
	       

	       

	        // Return the response with the JSON body
	        return ResponseEntity.status(HttpStatus.OK)
	                .body(("welcome Back Blue"));
	    }
}
