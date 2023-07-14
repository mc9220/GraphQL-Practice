package com.Turorial.GraphQL.GRAPHQL.demo.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
public class CustomerProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "customer_Id")
	private Long id;
	private String firstName;
	private String lastName;
	private Long mobile;
	private String email;
	private Timestamp creationTime;
	private Timestamp updateTime;
}
