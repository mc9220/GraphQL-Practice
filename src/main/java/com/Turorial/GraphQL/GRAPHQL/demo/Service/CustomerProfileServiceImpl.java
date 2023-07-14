package com.Turorial.GraphQL.GRAPHQL.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Turorial.GraphQL.GRAPHQL.demo.Repository.CustomerProfileRepo;
import com.Turorial.GraphQL.GRAPHQL.demo.model.CustomerProfile;

@Service
public class CustomerProfileServiceImpl implements CustomerProfileService {

	@Autowired 
	private CustomerProfileRepo customerProfileRepo;

	@Override
	public CustomerProfile addnewCustomer(CustomerProfile customerProfile) {
		// TODO Auto-generated method stub
		return customerProfileRepo.save(customerProfile);
	}
	
	
}
