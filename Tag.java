package potluck.domain;

/*
 * holds all the information for tags
 */
public class Tag {
	private int id = 0;
	private String text;
	private static int idHelper = 0;
	
	/*
	 * default constructor
	 */
	public Tag() {
		text = new String();
	}
	
	/*
	 * overloaded constructor
	 */
	public Tag(String text) {
		id = ++idHelper;
		this.text = text;
	}
	
	/*
	 * returns the id
	 */
	public int getTagId() {
		return id;
	}
	
	/*
	 * returns the text
	 */
	public String getText() {
		return text;
	}
	/*
	 * sets the text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/*
	 * creates a string using the information in
	 * the class
	 */
	@Override
	public String toString() {
		String string = new String();
		string = "Id: " +id +" Tag: "+ text;
		return string;
	}
	
	/*
	 * displays the information in the class
	 */
	public void display()
	{
		System.out.println(toString());
	}
}
