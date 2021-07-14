package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PatchMapping;



@RestController
public class DogController {
	
	// dependency
	
	private DogService service;
	
	//spring injecting it into my class
	
	public DogController(DogService service) {
		super();
		this.service = service;
	}
	

	
	@GetMapping("/") // MAPS a GET request to "/" to this method
public String hello() {
		return "Hello, My Dawgs!";
	}
	
	@PostMapping("/createDog") // fancy
	public void createDog(@RequestBody Dog dog) { // less fancy
	// just Java
		this.service.createDog(dog);
	}
	
	@GetMapping("/getDog")
	public Dog getDog() {
		return this.service.getDog();
	}
	
	@GetMapping("/getDogId/{id}")
	public Dog getDogId(@PathVariable int id) {
		return this.service.getDogId(id);
	}
	
	
	@GetMapping("/listDogs")
	public List<Dog> listDog() {
		return this.service.listDog();
		
	}
	
	@DeleteMapping("/deleteDog/{id}")
	public String deleteDog(@PathVariable int id) {
		return this.service.deleteDog(id);
			}
		



	
@PutMapping("/updateDog/{id}")
public Dog updateDog(@PathVariable int id, @RequestBody Dog dog ) { //newDog
	return this.service.updateDog(id, dog);
		
		}
}
//	
//
//	
//	@DeleteMapping("/deleteDog/{id}")
//	public String deleteDog(@PathVariable int id) {
//		
//		for (i = 0 ; i < dogs.size() ; i ++)
//		return "Deleted dog at index: " + id;
////////	}
////////	
//	
//
//
