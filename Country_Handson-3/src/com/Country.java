package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CountryTable2")
public class Country {
	
	@Id
	@Column(name="Country_Code")
	private String code;
	
	@Column(name="Country_Name")
	private String name;
	
	public Country() {
		
	}
	
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}


}
