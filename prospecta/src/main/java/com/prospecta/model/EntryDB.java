package com.prospecta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EntryDB {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String api;
	
	private String desciption;
	
	private String auth;

	private boolean hTTPS;

	private String cors;

	private String category;
}
