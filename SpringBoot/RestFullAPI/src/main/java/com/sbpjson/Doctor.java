package com.sbpjson;

public class Doctor 
{
	public Doctor() 
	{
		 
    }
 
    public Doctor(Integer id, String firstName, String lastName, String email) 
    {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
  
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
 
    //Getters and setters
 
    
    @Override
    public String toString() 
    {
        return "Doctor [id=" + id + ", firstName=" + firstName + 
        		", lastName=" + lastName + ", email=" + email + "]";
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    

}
