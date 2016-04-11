/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferobjects;

/**
 *
 * @author Johan
 */
public class Category {
    
    private int categoryId;
    private String categoryText;
    
    public void setCategoryId(int categoryId){
        this.categoryId = categoryId;
    }
    
    public void setCategoryText(String categoryText){
        this.categoryText = categoryText;
    }
    
    public int getCategoryId(){
        return categoryId;
    }
    
    public String getCategoryText(){
        return categoryText;
    }
}
