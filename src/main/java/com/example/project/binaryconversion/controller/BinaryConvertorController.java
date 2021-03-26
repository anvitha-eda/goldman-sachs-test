package com.example.project.binaryconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.binaryconversion.service.BinaryConvertorService;

@RestController
@RequestMapping("/binary")
public class BinaryConvertorController {
	
	@Autowired
	private BinaryConvertorService binaryConvertorService;
	
	@GetMapping(value = "/{decimalNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String reverseBinaryNumber(@PathVariable("decimalNumber") String decimalNumber) {
		
		return binaryConvertorService.binaryConversion(decimalNumber);
		
	}
	

}
