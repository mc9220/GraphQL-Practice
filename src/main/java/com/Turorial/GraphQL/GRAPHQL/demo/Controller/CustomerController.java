package com.Turorial.GraphQL.GRAPHQL.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Turorial.GraphQL.GRAPHQL.demo.Service.CustomerProfileService;
import com.Turorial.GraphQL.GRAPHQL.demo.model.CustomerProfile;

@RestController
public class CustomerController {

	@Autowired
	private CustomerProfileService customerProfileService;
	
	@PostMapping("/addNewCustomer")
	public ResponseEntity<?> addNewCustomer(@RequestBody CustomerProfile profile)
	{
	return new ResponseEntity<>(customerProfileService.addnewCustomer(profile), HttpStatus.OK)	;
	}
}
