package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company_Table")
public class Company {
	
	@Id
	@GeneratedValue
	private Integer companyId;
	private String companyName;
	private Integer companySize;
    
	

}
