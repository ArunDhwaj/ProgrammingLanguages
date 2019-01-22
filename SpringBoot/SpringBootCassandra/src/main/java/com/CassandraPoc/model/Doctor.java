package com.CassandraPoc.model;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Doctor 
{
	@PrimaryKey
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	
	public Doctor(){}
	
	public Doctor(int id, String firstname, String lastname, int age)
	{
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getFirstname()
	{
		return this.firstname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	public String getLastname()
	{
		return this.lastname;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	@Override
	public String toString() 
	{
		return String.format("Doctor[id=%d, firstName='%s', lastName='%s', age=%d]", this.id,
				this.firstname, this.lastname, this.age);
	}

}
