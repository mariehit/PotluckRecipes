/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslayer;

import dataaccesslayer.CommentsDaoImpl;
import java.util.List;
import transferobjects.Comments;

/**
 *
 * @author Johan
 */
public class CommentsBusinessLogic {
    private CommentsDaoImpl commentsDao;
    
    public CommentsBusinessLogic() {
        commentsDao = new CommentsDaoImpl();
    }
    
    public Comments getCommentsByMemberId(int memberId) {
        return commentsDao.getCommentByMemberId(memberId);
    }
    
    public Comments getCommentsByRecipeId(int recipeId) {
        return commentsDao.getCommentByRecipeId(recipeId);
    }
    
    public List<Comments> getAllComments() {
        return commentsDao.getAllComments();
    }
}