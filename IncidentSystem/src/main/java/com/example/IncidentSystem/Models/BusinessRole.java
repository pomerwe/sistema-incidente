package com.example.IncidentSystem.Models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "business_role")
public class BusinessRole {
	
	@Id
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private String description;
	
	@ManyToMany(mappedBy = "approver_roles")
	private Set<Service> services;
}