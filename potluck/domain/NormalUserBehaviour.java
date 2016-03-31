package potluck.domain;

import java.util.ArrayList;

/**
 * This class is part of the delegate that defines the
 * functionality of a normal user
 * @author Robert Lin
 */


public class NormalUserBehaviour implements UserBehaviour{

	/** 
	 * @see potluck.domain.UserBehaviour#createRecipePrepare(potluck.domain.RecipeBuilder)
	 */
	@Override
	public void createRecipePrepare(RecipeBuilder builder) {
		builder = RecipeBuilder.create();
	}

	/** 
	 * @see potluck.domain.UserBehaviour#addDirections(potluck.domain.RecipeBuilder, java.lang.String)
	 */
	@Override
	public void addDirections(RecipeBuilder builder, String directions) {
		builder.setDirections(directions);
	}

	/**
	 * @see potluck.domain.UserBehaviour#addAttribution(potluck.domain.RecipeBuilder, java.lang.String)
	 */
	@Override
	public void addAttribution(RecipeBuilder builder, String attribution) {
		builder.setAttribution(attribution);
	}

	/**
	 * @see potluck.domain.UserBehaviour#addCategory(potluck.domain.RecipeBuilder, potluck.domain.Category)
	 */
	@Override
	public void addCategory(RecipeBuilder builder, Category category) {
		builder.setCategory(category);
	}

	/**
	 * 	 * @see potluck.domain.UserBehaviour#addIngredients(potluck.domain.RecipeBuilder, java.util.ArrayList)
	 */
	@Override
	public void addIngredients(RecipeBuilder builder, ArrayList<Ingredient> ingredients) {
		builder.setIngredients(ingredients);
	}

	/**
	 * @see potluck.domain.UserBehaviour#addTags(potluck.domain.RecipeBuilder, java.util.ArrayList)
	 */
	@Override
	public void addTags(RecipeBuilder builder, ArrayList<Tag> tags) {
		builder.setTags(tags);
	}

	/**
	 * @see potluck.domain.UserBehaviour#createRecipe(potluck.domain.RecipeBuilder)
	 */
	@Override
	public void createRecipe(RecipeBuilder builder) {
		RecipeDB.RECIPE_DB.addRecipe(builder.build());

	}


	/**
	 *  @see potluck.domain.UserBehaviour#viewRecipe(int)
	 */
	@Override
	public void viewRecipe(int index) {
		RecipeDB.RECIPE_DB.getRecipeList().get(index).display();;

	}

	/**
	 *  @see potluck.domain.UserBehaviour#comment(potluck.domain.Comment, int)
	 */
	@Override
	public void comment(Comment comment, int index) {
		RecipeDB.RECIPE_DB.getRecipeList().get(index).setComment(comment);

	}

	/**
	 * @see potluck.domain.UserBehaviour#deleteComment(int)
	 */
	@Override
	public void deleteComment(int index) {
		System.out.println("You do not have the proper rights to do this");		
	}

	/**
	 * @see potluck.domain.UserBehaviour#deleteRecipe(int)
	 */
	@Override
	public void deleteRecipe(int index) {
		System.out.println("You do not have the proper rights to do this");		
	}

	/**
	 * @see potluck.domain.UserBehaviour#userBehaviour()
	 */
	@Override
	public String userBehaviour() {
		// TODO Auto-generated method stub
		return "normal user";
	}


}
