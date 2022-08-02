package cardGameWar;

import java.util.*;

public class Card {
	

	private int value;
	private String name;
	
	
	
	
	
	public Card(String name, int value) {
		
	}
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println(value);
		System.out.println(name);
	}
}	

	
