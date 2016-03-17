package potluck.domain;
/**
 * Ingredient class 
 * Potluck recipe project
 * CST 8288
 * March 7, 2016
 * @author Johan Setyobudi
 *
 */
public class Ingredient {
	
	private int id = 0;
	private String name;
	private String measurement;
	private static int idHelper = 0;
	
	public Ingredient() {
		name = new String();
		measurement = new String();
	}
	
	public Ingredient(String name, String measurement) {
		id = ++idHelper;
		this.name = name;
		this.measurement = measurement;
	}

	public int getIngredientId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	
	@Override
	public String toString() {
		String string = new String();
		string = "Id: " +id + " Name: " +name + " Measurement: " +measurement;
		return string;
	}
}
