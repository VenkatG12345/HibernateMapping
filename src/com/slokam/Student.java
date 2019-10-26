package com.slokam;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="student")
public class Student {
	@Id
	
	private int id;
	private String name;
	private int age;
	

}
