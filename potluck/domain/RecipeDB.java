package potluck.domain;

import java.util.ArrayList;

/*
 * a singleton of an array holding all the recipes
 */
public enum RecipeDB{
	RECIPE_DB;
	
	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	
	/*
	 * adds the arrayList of recipes
	 */
	public final void addRecipe(Recipe recipe) {
		recipeList.add(recipe);
	}
	
	/*
	 * returns the recipeList
	 */
	public final ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}
	
	/*
	 * removes entires in the arrayList based on an index
	 */
	public final void deleteRecipe(int index) {
		recipeList.remove(index);
	}
	
	public final void setRecipeList(ArrayList<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
}
