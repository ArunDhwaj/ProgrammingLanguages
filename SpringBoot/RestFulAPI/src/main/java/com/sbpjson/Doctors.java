package com.sbpjson;

import java.util.ArrayList;
import java.util.List;
 
public class Doctors 
{
    private List<Doctor> doctorList;
     
    public List<Doctor> getDoctorList() 
    {
        if(doctorList == null) 
        {
        	doctorList = new ArrayList<>();
        }
        return doctorList;
    }
  
    public void setDoctorList(List<Doctor> doctorList) 
    {
        this.doctorList = doctorList;
    }
}