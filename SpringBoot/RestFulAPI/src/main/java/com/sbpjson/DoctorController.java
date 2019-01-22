package com.sbpjson;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


//import com.sbpjson.Doctor;
//import com.sbpjson.Doctors;
//import com.sbpjson.DoctorDAO;

@RestController
@RequestMapping(path = "/doctors")
public class DoctorController 
{
    @Autowired
    private DoctorDAO doctorDao;
     
    @GetMapping(path="/", produces = "application/json")
    public Doctors getDoctors()
    {
        return doctorDao.getAllDoctors();
    }
     
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addDoctor(@RequestBody Doctor doctor)
    {
        Integer id = doctorDao.getAllDoctors().getDoctorList().size() + 1;
        doctor.setId(id);
         
        doctorDao.addDoctor(doctor);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(doctor.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }
}