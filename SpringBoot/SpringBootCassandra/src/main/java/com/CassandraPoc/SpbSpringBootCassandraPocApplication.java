package com.CassandraPoc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CassandraPoc.model.Doctor;
import com.CassandraPoc.repository.DoctorRepository;

@SpringBootApplication
public class SpbSpringBootCassandraPocApplication implements CommandLineRunner
{
	@Autowired
	DoctorRepository doctorRepository;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpbSpringBootCassandraPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		clearData();
		saveData();
		lookup();
	}
	
	public void clearData()
	{
		doctorRepository.deleteAll();
	}
	
	public void saveData()
	{
		System.out.println("******************Save Doctors to Cassandra*******************");
		Doctor doc_1 = new Doctor(1, "Sinha", "Singh", 20);
        Doctor doc_2 = new Doctor(2, "Rina", "Mishra", 25);
        Doctor doc_3 = new Doctor(3, "Mina", "Sarita", 30);
        Doctor doc_4 = new Doctor(4, "Pushpa", "Lata", 20);
        Doctor doc_5 = new Doctor(5, "Kamla", "Disuja", 45);
        Doctor doc_6 = new Doctor(6, "Aarush", "Dhwaj", 11);
        Doctor doc_7 = new Doctor(7, "Aarul", "Dhwaj", 7);
 
        // save doctors to ElasticSearch
        doctorRepository.save(doc_1);
        doctorRepository.save(doc_2);
        doctorRepository.save(doc_3);
        doctorRepository.save(doc_4);
        doctorRepository.save(doc_5);
        doctorRepository.save(doc_6);
        doctorRepository.save(doc_7);
	}
	
	public void lookup()
	{
		System.out.println("********************Lookup Doctors from Cassandra by Firstname******************");
		List<Doctor> peters = doctorRepository.findByFirstname("Aarush");
		peters.forEach(System.out::println);

		System.out.println("************************Lookup Doctors from Cassandra by Age***************************");
		List<Doctor> docsAgeGreaterThan25 = doctorRepository.findDoctorHasAgeGreaterThan(25);
		docsAgeGreaterThan25.forEach(System.out::println);
		
		System.out.println("************************Lookup All Doctors from Cassandra ***************************");
		List<Doctor> alldocs = doctorRepository.findAllDoctors();
		alldocs.forEach(System.out::println);
	}

}

