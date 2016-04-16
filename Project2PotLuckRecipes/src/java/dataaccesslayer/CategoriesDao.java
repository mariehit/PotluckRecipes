/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.util.List;
import transferobjects.Category;

/**
 *
 * @author Jacob
 */
public interface CategoriesDao {
    
    public Category getCategoriesByCategoryId(int categoryId);
    public List<Category> getAllCategories();
    
}
