package com.CassandraPoc.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.CassandraPoc.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, String> 
{
	
	@Query(value="SELECT * FROM doctor WHERE firstname=?0")
	public List<Doctor> findByFirstname(String firstname);

	@Query("SELECT * FROM doctor WHERE age > ?0 ALLOW FILTERING")
	public List<Doctor> findDoctorHasAgeGreaterThan(int age);
	
	@Query("SELECT * FROM doctor")
	public List<Doctor> findAllDoctors();
}
