package potluck.domain;

public class Tag {
	private int id = 0;
	private String text;
	private static int idHelper = 0;
	
	public Tag() {
		text = new String();
	}
	
	public Tag(String text) {
		id = ++idHelper;
		this.text = text;
	}
	
	public int getTagId() {
		return id;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		String string = new String();
		string = "Id: " +id +" Tag: "+ text;
		return string;
	}
}
