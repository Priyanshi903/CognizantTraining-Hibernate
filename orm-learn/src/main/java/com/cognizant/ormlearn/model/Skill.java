package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sk_id")
	private int id;
	
	@Column(name = "sk_name")
	private String name;
	
	@ManyToMany(mappedBy = "skillList", fetch = FetchType.EAGER)
	private Set<Employee> employeeList;

	public Skill() {
		
	}
	public Skill(String name) {
		super();
	
		this.name = name;
	}
	
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	


}
