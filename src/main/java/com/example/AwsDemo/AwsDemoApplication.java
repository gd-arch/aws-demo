package com.example.AwsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class AwsDemoApplication {
	@Autowired
	PersonRepository repository;
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
		return repository.save(person);
	}

	@GetMapping("/persons")
	public List<Person> getPersons() {
		return repository.findAll();
	}
	@GetMapping
	public String hi(){
		return "AWS app working";
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}

}
