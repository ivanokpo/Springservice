package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Primary
public class DogServiceList implements DogService {
	
	
	private List<Dog> dogs = new ArrayList<>();
	
	@Override
	
	public String hello() {
		return "Hello, My Dawgs!";
	}
	
	@Override
	public void createDog(@RequestBody Dog dog) { // less fancy
		// just Java
		dogs.add(dog);
		System.out.println(dog);
	}
	
	@Override
	public Dog getDog() {
		return new Dog("Garfunkle",12, "Red");
	}
	
	@Override
	public Dog getDogId(@PathVariable int id) {
		Dog found = this.dogs.get(id);
		return found;
	}
	
	
	@Override
	
	public List<Dog> listDog() {
		return this.dogs;
		
	}
	
	@Override
	public String deleteDog(@PathVariable int id) {
		dogs.remove(id);
		return "Deleted dog at index: " + id;
			}
		
	
	

	
	@Override
	public Dog updateDog(@PathVariable int id, @RequestBody Dog dog ) { //newDog
		//removes
		this.dogs.remove(id);
		//adds
		this.dogs.add(id,dog);
		//return updated dog
	//	//ORRRRRRRRRRRRRRRRRRRR
	//	this.dogs.set(id, newDog);
		
		return this.dogs.get(id);
		
		
			}
		
	

}
