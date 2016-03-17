package potluck.domain;

/**
 * Comment.java
 * CST8288
 * @author jacob
 * March 11/2016
 */
public class Comment {

	private int commentId;
	private float rank;
	private String dateCreated;
	private String comment;
	private static int idHelper = 0;
	
	public Comment(){
		comment =  new String();
		dateCreated =  new String();
	}
	
	public Comment(String comment, float rank, String dateCreated){
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
	
	public void setRank(float rank){
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
		sb.append(comment);
		sb.append(rank);
		sb.append(dateCreated);
		return sb.toString();
		
	}
}
