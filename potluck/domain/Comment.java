package potluck.domain;

/**
 * Comment.java
 * CST8288
 * @author jacob
 * March 11/2016
 */
public class Comment {

	private int commentId;
	private short rank;
	private String dateCreated;
	private String comment;
	private static int idHelper = 0;
	
	public Comment(){
		comment =  new String();
		dateCreated =  new String();
	}
	
	public Comment(String comment, short rank, String dateCreated){
		this.commentId = ++idHelper;
		this.comment = comment;
		this.rank = rank;
		this.dateCreated = dateCreated;
	}
	
	public int getCommentId(){
		return commentId;	
	}
	
	public void setDateCreated(String dateCreated){
		this.dateCreated = dateCreated;
	}
	
	public String getDateCreated(){
		return dateCreated;
	}
	
	public void setRank(short rank){
		this.rank = rank;
	}
	
	public float getRank(){
		return rank;
	}
	
	public void setComment(String comment){
		this.comment = comment;
	}
	
	public String getComment(){
		return comment;
	}
	
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
	
	public void display()
	{
		System.out.println(toString());
	}
}
