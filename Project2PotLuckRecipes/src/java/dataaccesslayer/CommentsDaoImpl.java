/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import transferobjects.Comments;

/**
 *
 * @author Johan
 */
public class CommentsDaoImpl implements CommentsDao{

    @Override
    public List<Comments> getAllComments() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Comments> comments = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT MemberId, RecipeId, DateCreated, Ranking, "
                    + "CommentText FROM Comments ORDER BY MemberId");
            rs = pstmt.executeQuery();
            comments = new ArrayList<Comments>();
            while (rs.next()) {
                Comments comment = new Comments();
                comment.setMemberId(rs.getInt("MemberId"));
                comment.setRecipeId(rs.getInt("RecipeId"));
                comment.setDateCreated(rs.getDate("DateCreated"));
                comment.setRanking(rs.getInt("Ranking"));
                comment.setCommentText(rs.getString("CommentText"));
                comments.add(comment);
            }
        }
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(rs != null){ rs.close(); } }
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
		return comments;
    }

    @Override
    public Comments getCommentByMemberId(int memberId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Comments comment = null;
		try{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"SELECT MemberId, RecipeId, DateCreated, Ranking, "
                                        + "CommentText FROM Comments WHERE MemberId = ?"); //statement used to get task by id
			pstmt.setInt(1, memberId); //getting task by specific task id
			rs = pstmt.executeQuery();
			while(rs.next()){ //setting variables
		            comment = new Comments();
                            comment.setMemberId(rs.getInt("MemberId"));
                            comment.setRecipeId(rs.getInt("RecipeId"));
                            comment.setDateCreated(rs.getDate("DateCreated"));
                            comment.setRanking(rs.getInt("Ranking"));
                            comment.setCommentText(rs.getString("CommentText"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(rs != null){ rs.close(); } }
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
		return comment;
    }
    
    @Override
    public Comments getCommentByRecipeId(int recipeId) {
       Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Comments comment = null;
		try{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"SELECT MemberId, RecipeId, DateCreated, Ranking, "
                                        + "CommentText FROM Comments WHERE RecipeId = ?"); //statement used to get task by id
			pstmt.setInt(1, recipeId); //getting task by specific task id
			rs = pstmt.executeQuery();
			while(rs.next()){ //setting variables
		            comment = new Comments();
                            comment.setMemberId(rs.getInt("MemberId"));
                            comment.setRecipeId(rs.getInt("RecipeId"));
                            comment.setDateCreated(rs.getDate("DateCreated"));
                            comment.setRanking(rs.getInt("Ranking"));
                            comment.setCommentText(rs.getString("CommentText"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(rs != null){ rs.close(); } }
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
		return comment;
    }
    
    
}