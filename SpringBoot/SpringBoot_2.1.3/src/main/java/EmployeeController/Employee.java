
/*
@author: Arun Dhwaj
@date: 27th Feb, 2019
@purpose: A bean returning json as REST API response
*/

package EmployeeController;

public class Employee
{
    private final long id;
    private final String name;
    private Integer age;
    
    public Employee(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return age;
    }
}
