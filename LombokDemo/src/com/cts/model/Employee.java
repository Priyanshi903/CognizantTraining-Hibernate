package com.cts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Data
public class Employee {
	private int empid;
	private String name;
	private String email;
//	private @Getter @Setter String address;
}