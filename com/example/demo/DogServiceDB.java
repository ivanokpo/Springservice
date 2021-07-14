package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service //for FUTURE implementation
public class DogServiceDB implements DogService {
	
	@Override
	public void createDog(Dog dog) {
		
	}

	@Override
	public List<Dog> listDog(){
		return null;
	}

	@Override
	public Dog getDog() {
		return null;
	}
	
	@Override
	public Dog getDogId(int id) {
		return null;
	}

	@Override
	public Dog updateDog(int id, Dog dog) {
		return null;
	}

	@Override
	public String deleteDog(int id) {
		return null;
	}

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return null;
	}



}
