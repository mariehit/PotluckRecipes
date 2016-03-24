package potluck.domain;

/**
 * Comment.java
 * CST8288
 * @author jacob
 * March 11/2016
 */

/*
 * holds all the data for the comment system
 */
public class Comment {

	private int commentId;
	private short rank;
	private String dateCreated;
	private String comment;
	private static int idHelper = 0;
	
	/*
	 * default constructor
	 */
	public Comment(){
		comment =  new String();
		dateCreated =  new String();
	}
	
	/*
	 * overloaded constructor
	 */
	public Comment(String comment, short rank, String dateCreated){
		this.commentId = ++idHelper;
		this.comment = comment;
		this.rank = rank;
		this.dateCreated = dateCreated;
	}
	
	/*
	 * returns commentID
	 */
	public int getCommentId(){
		return commentId;	
	}
	
	/*
	 * sets the dateCreated
	 */
	public void setDateCreated(String dateCreated){
		this.dateCreated = dateCreated;
	}
	
	/*
	 * returns the dateCreated
	 */
	public String getDateCreated(){
		return dateCreated;
	}
	
	/*
	 * sets the rank
	 */
	public void setRank(short rank){
		this.rank = rank;
	}
	
	/*
	 * returns the rank
	 */
	public float getRank(){
		return rank;
	}
	
	/*
	 * sets the comment
	 */
	public void setComment(String comment){
		this.comment = comment;
	}
	
	/*
	 * returns the comment
	 */
	public String getComment(){
		return comment;
	}
	
	/*
	 * returns the string built using the information
	 * stored in this class
	 */
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(commentId);
		sb.append(" ");
		sb.append(comment);
		sb.append(" ");
		sb.append(rank);
		sb.append(" ");
		sb.append(dateCreated);
		sb.append(" ");
		return sb.toString();
		
	}
	
	/*
	 * displays the information stored in this class
	 */
	public void display()
	{
		System.out.println(toString());
	}
}
