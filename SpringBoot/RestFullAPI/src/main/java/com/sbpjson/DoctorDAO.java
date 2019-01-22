package com.sbpjson;

import org.springframework.stereotype.Repository;

@Repository
public class DoctorDAO 
{
    private static Doctors list = new Doctors();
     
    static
    {
        list.getDoctorList().add(new Doctor(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getDoctorList().add(new Doctor(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getDoctorList().add(new Doctor(3, "David", "Kameron", "titanic@gmail.com"));
    }
     
    public Doctors getAllDoctors()
    {
        return list;
    }
     
    public void addDoctor(Doctor doctor) 
    {
        list.getDoctorList().add(doctor);
    }
}