package pl.iwiwiwi.spring.fruitbasket;

import java.util.List;

public class FruitBasket {

	private String name;
	private List<String> fruits;
	
	public FruitBasket(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+" składa się z:\n");
		for (String f : fruits) {
			sb.append(f+"\n");
		}
		return sb.toString();
	}
}
