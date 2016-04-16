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
import transferobjects.Category;

/**
 *
 * @author Jacob
 */
public class CategoriesDaoImpl implements CategoriesDao {
    
    @Override
    public Category getCategoriesByCategoryId(int categoryId){
                Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Category category = null;
		try {
			DataSource dataSource = new DataSource();
			connection = dataSource.createConnection();
			// SQL statement to get a row based on its TaskId
			preparedStatement = connection.prepareStatement(
					"SELECT CategoryId, CategoryText FROM Categories WHERE CategoryId = ?");
			preparedStatement.setInt(1, categoryId);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				category = new Category();
				category.setCategoryId(resultSet.getInt("CategoryId"));
				category.setCategoryText(resultSet.getString("CategoryText"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			// close connections if they are still open
			try { if (resultSet != null) { resultSet.close(); } }
			catch(SQLException ex) { System.out.println(ex.getMessage()); }
			try { if (preparedStatement != null) { preparedStatement.close(); } }
			catch(SQLException ex) { System.out.println(ex.getMessage()); }
			try { if (connection != null) { connection.close(); } }
			catch(SQLException ex) { System.out.println(ex.getMessage()); }
		}
		return category;
	} 
    
    @Override
	public List<Category> getAllCategories() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		
		ArrayList<Category> categories = null;
		try {
			DataSource dataSource = new DataSource();
			connection = dataSource.createConnection();
			// SQL statement to retrieve all columns from the database
			preparedStatement = connection.prepareStatement(
					"SELECT CategoryId, CategoryText FROM Categories ORDER BY CategoryId");
			resultSet = preparedStatement.executeQuery();
			categories = new ArrayList<Category>();
			// iterate through the database and add to the ArrayList of titles
			while (resultSet.next()) {
				Category category = new Category();
				category.setCategoryId(resultSet.getInt("CategoryId"));
                                category.setCategoryText(resultSet.getString("CategoryText"));
				categories.add(category);
			}	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			// close connections if they are still open
			try { if (resultSet != null) { resultSet.close(); } }
			catch(SQLException ex) { System.out.println(ex.getMessage()); }
			try { if (preparedStatement != null) { preparedStatement.close(); } }
			catch(SQLException ex) { System.out.println(ex.getMessage()); }
			try { if (connection != null) { connection.close(); } }
			catch(SQLException ex) { System.out.println(ex.getMessage()); }
		}
		return categories;
	} 
    
}
