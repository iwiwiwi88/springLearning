package pl.iwiwiwi.spring.animals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {

	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("foods:\n");
		for (Map.Entry<String, String> entry : foods.entrySet()) {
			sb.append(entry.getKey()+" : "+entry.getValue()+"\n");
		}
		sb.append("\nanimals:\n");
		for (Map.Entry<String, Animal> entry : animals.entrySet()) {
			sb.append(entry.getKey()+" : "+entry.getValue()+"\n");
		}
		return sb.toString();
	}

//	private Animal largest;
//	private List<Animal> animals;
//	public Animal getLargest() {
//		return largest;
//	}
//	public void setLargest(Animal largest) {
//		this.largest = largest;
//	}
//	public List<Animal> getAnimals() {
//		return animals;
//	}
//	public void setAnimals(List<Animal> animals) {
//		this.animals = animals;
//	}
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("largest animal: "+largest);
//		sb.append("\nIn jungle we have:\n");
//		for (Animal a : animals) {
//			sb.append(a+"\n");
//		}
//		return sb.toString();
//	}
//	
	
}
