package potluck.domain;

/**
 * This class holds all the information for tags
 * @author Johan Setyobudi
 *
 */
/*
 */
public class Tag {
	private int id = 0;
	private String text;
	private static int idHelper = 0;

	
	/**
	 * default constructor
	 */
	public Tag() {
		text = new String();
	}

	
	/**
	 * Overloaded constructor
	 * @param text
	 */
	public Tag(String text) {
		id = ++idHelper;
		this.text = text;
	}

	/*
	 */
	/**
	 * Returns the id
	 * @return id
	 */
	public int getTagId() {
		return id;
	}

	/*
	 */
	/**
	 * Returns the text
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}


	/** 
	 * creates a string using the information in
	 * the class	 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String string = new String();
		string = " Tag: "+ text;
		return string;
	}


	/**
	 * Displays the information in the class
	 */
	public void display()
	{
		System.out.println(toString());
	}
}
