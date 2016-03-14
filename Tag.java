/**
 * Tag class 
 * Potluck recipe project
 * CST 8288
 * March 7, 2016
 * @author Johan Setyobudi
 *
 */
public class Tag {
	
	private static int id = 0;
	private String text;
	
	public Tag() {
		text = new String();
	}
	
	public Tag(String text) {
		id = id++;
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