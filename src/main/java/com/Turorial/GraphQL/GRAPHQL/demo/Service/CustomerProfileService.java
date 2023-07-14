package com.Turorial.GraphQL.GRAPHQL.demo.Service;

import org.springframework.stereotype.Service;

import com.Turorial.GraphQL.GRAPHQL.demo.model.CustomerProfile;

@Service
public interface CustomerProfileService {

	CustomerProfile addnewCustomer(CustomerProfile customerProfile);

}
