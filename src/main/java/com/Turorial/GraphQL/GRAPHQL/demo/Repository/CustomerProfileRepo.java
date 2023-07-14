package com.Turorial.GraphQL.GRAPHQL.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Turorial.GraphQL.GRAPHQL.demo.model.CustomerProfile;
@Repository
public interface CustomerProfileRepo extends JpaRepository<CustomerProfile, String> {

}
