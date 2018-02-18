package pl.iwiwiwi88.springBootLearning.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {

	private UUID id;
	private final String name;
	private final String favouriteFood;
	private final int yearOfBorn;
	private final String trainingCourse;
	
	public Cat(
			@JsonProperty("id") UUID id, 
			@JsonProperty("name") String name, 
			@JsonProperty("favouriteFood") String favouriteFood, 
			@JsonProperty("yearOfBorn") int yearOfBorn, 
			@JsonProperty("trainingCourse") String trainingCourse
			) {
		this.id = id;
		this.name = name;
		this.favouriteFood = favouriteFood;
		this.yearOfBorn = yearOfBorn;
		this.trainingCourse = trainingCourse;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public int getYearOfBorn() {
		return yearOfBorn;
	}

	public String getTrainingCourse() {
		return trainingCourse;
	}
	
	
}
