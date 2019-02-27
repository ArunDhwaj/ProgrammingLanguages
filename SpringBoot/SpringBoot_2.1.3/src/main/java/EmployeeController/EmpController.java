
/*
@author: Arun Dhwaj
@date: 27th Feb, 2019
@purpose: A bean returning json as REST API response
*/

package EmployeeController;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmpController
{
    private final AtomicLong uuid = new AtomicLong();

    @RequestMapping("/employee")
    public Employee myEmployee( @RequestParam(value="name", defaultValue="SBP") String name1, @RequestParam(value="age", defaultValue="10") String age1)  
    {
        Employee emp = new Employee( uuid.incrementAndGet(), name1);
        emp.setAge(Integer.parseInt(age1));

        return emp;
    }
}
