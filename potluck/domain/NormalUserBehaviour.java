package potluck.domain;

import java.util.ArrayList;

public class NormalUserBehaviour implements UserBehaviour{
	@Override
	public void createRecipePrepare(RecipeBuilder builder) {
		builder = RecipeBuilder.create();
	}
	@Override
	public void addDirections(RecipeBuilder builder, String directions) {
		builder.setDirections(directions);
	}
	@Override
	public void addAttribution(RecipeBuilder builder, String attribution) {
		builder.setAttribution(attribution);
	}
	@Override
	public void addCategory(RecipeBuilder builder, Category category) {
		builder.setCategory(category);
	}
	@Override
	public void addIngredients(RecipeBuilder builder, ArrayList<Ingredient> ingredients) {
		builder.setIngredients(ingredients);
	}
	@Override
	public void addTags(RecipeBuilder builder, ArrayList<Tag> tags) {
		builder.setTags(tags);
	}
	
	@Override
	public void createRecipe(RecipeBuilder builder) {
		RecipeDB.RECIPE_DB.addRecipe(builder.build());
		
	}


	@Override
	public void viewRecipe(int index) {
		RecipeDB.RECIPE_DB.getRecipeList().get(index).display();;
		
	}

	@Override
	public void comment(Comment comment, int index) {
		RecipeDB.RECIPE_DB.getRecipeList().get(index).setComment(comment);
		
	}

	@Override
	public void deleteComment(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecipe(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String userBehaviour() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
