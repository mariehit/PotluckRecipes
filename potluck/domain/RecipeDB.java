package potluck.domain;

import java.util.ArrayList;

public enum RecipeDB{
	RECIPE_DB;
	
	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	
	public final void addRecipe(Recipe recipe) {
		recipeList.add(recipe);
	}
	
	public final ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}
	
	public final void deleteRecipe(int index) {
		recipeList.remove(index);
	}
}
