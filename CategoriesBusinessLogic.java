/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslayer;

import dataaccesslayer.CategoriesDao;
import dataaccesslayer.CategoriesDaoImpl;
import java.util.List;
import transferobjects.Category;

/**
 *
 * @author Johan
 */
public class CategoriesBusinessLogic {
    
    private CategoriesDao categoriesDao = null;
    
    public CategoriesBusinessLogic(){
        categoriesDao = new CategoriesDaoImpl();
    }
    
    public Category getCategoriesByCategoryId(int categoryId){
        return categoriesDao.getCategoriesByCategoryId(categoryId);
    }
    
    public List<Category> getAllCategories(){
        return categoriesDao.getAllCategories();
    }
    
}
