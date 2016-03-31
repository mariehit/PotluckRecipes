package potluck.domain;

import java.util.ArrayList;

/**
 * This class is a singleton of an array holding all the recipes
 * @author Marie Zhang
 *
 */

public enum RecipeDB{
	/**
	 * Recipe_DB 
	 */
	RECIPE_DB;
	
	/**
	 * Recipe List
	 */
	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	
	
	/**
	 * adds the arrayList of recipes
	 * @param recipe
	 */
	public final void addRecipe(Recipe recipe) {
		recipeList.add(recipe);
	}
	
	
	/**
	 * returns the recipeList
	 * @return recipeList
	 */
	public final ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}
	
	
	/**
	 * removes entires in the arrayList based on an index
	 * @param index
	 */
	public final void deleteRecipe(int index) {
		recipeList.remove(index);
	}
	
	/**
	 * @param recipeList
	 */
	public final void setRecipeList(ArrayList<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
}
