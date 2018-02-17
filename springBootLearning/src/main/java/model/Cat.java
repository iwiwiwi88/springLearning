package model;

import java.util.UUID;

public class Cat {

	private final UUID id;
	private final String name;
	private final String favouriteFood;
	private final int yearOfBorn;
	private final String trainingCourse;
	
	public Cat(UUID id, String name, String favouriteFood, int yearOfBorn, String trainingCourse) {
		this.id = id;
		this.name = name;
		this.favouriteFood = favouriteFood;
		this.yearOfBorn = yearOfBorn;
		this.trainingCourse = trainingCourse;
	}

	public UUID getId() {
		return id;
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
