package com.example.demo;

import java.util.List;

public interface DogService {
	

		public void createDog(Dog dog);

		public List<Dog> listDog();

		public Dog getDog();
		
		public Dog getDogId(int id);

		public Dog updateDog(int id, Dog dog);

		public String deleteDog(int id);

		public String hello();

		
		
		

	

}
