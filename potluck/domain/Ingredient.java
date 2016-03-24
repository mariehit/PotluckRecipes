package potluck.domain;
/**
 * Ingredient class 
 * Potluck recipe project
 * CST 8288
 * March 7, 2016
 * @author Johan Setyobudi
 *
 */

/*
 * holds all the information for ingredients
 */
public class Ingredient {
	
	private int id = 0;
	private String name;
	private String measurement;
	private static int idHelper = 0;
	
	/*
	 * default constructor
	 */
	public Ingredient() {
		name = new String();
		measurement = new String();
	}
	
	/*
	 * overloaded constructor
	 */
	public Ingredient(String name, String measurement) {
		id = ++idHelper;
		this.name = name;
		this.measurement = measurement;
	}

	/*
	 * returns the id
	 */
	public int getIngredientId() {
		return id;
	}

	/*
	 * returns the name
	 */
	public String getName() {
		return name;
	}

	/*
	 * set the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * gets the measurement
	 */
	public String getMeasurement() {
		return measurement;
	}

	/*
	 * sets the measurement
	 */
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	
	/*
	 * retuns a string built using the information
	 * in this class
	 */
	@Override
	public String toString() {
		String string = new String();
		string = "Id: " +id + " Name: " +name + " Measurement: " +measurement + "\n";
		return string;
	}
	
	/*
	 * displays the information in this clas
	 */
	public void display()
	{
		System.out.println(toString());
	}
}
