package application;

import java.util.ArrayList;

public class BuildYourOwn extends Pizza {

	
	public BuildYourOwn(String style, String size) {
		super(style, size);
		// TODO Auto-generated constructor stub
	}
	public BuildYourOwn(String style, String size, ArrayList<String> toppings) { 
		super(style, size, toppings);
	}
	
	@Override
	public int pizzaPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}