/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferobjects;

import java.sql.Date;

/**
 *
 * @author Johan
 */
public class Comments {
    
    private int memberId;
    private int recipeId;
    private Date dateCreated;
    private int ranking;
    private String commentText;

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    
     public int getMemberId() {
        return memberId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }
    
      public int getRecipeId() {
        return recipeId;
    }


    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    public int getRanking() {
        return ranking;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
   
    public String getCommentText() {
        return commentText;
    }   
}