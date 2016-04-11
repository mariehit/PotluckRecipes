/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.util.List;
import transferobjects.Comments;

/**
 *
 * @author Johan
 */
public interface CommentsDao {
    
    public List<Comments> getAllComments();
    
    public Comments getCommentByMemberId(int memberId);
    
    public Comments getCommentByRecipeId(int recipeId);
   
    
}
