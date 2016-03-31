package potluck.domain;

import java.util.ArrayList;
/**
 * The interface used to define all the functions
 * that must be implemented
 * @author Robert Lin
 *
 */
/*

 */
public interface UserBehaviour {

	/**
	 * Create recipe method to be overridden
	 * @param builder
	 */
	void createRecipe(RecipeBuilder builder);
	/**
	 * View recipe method to be overridden
	 * @param index
	 */
	void viewRecipe(int index);
	/**
	 * Create comment method to be overridden
	 * @param comment
	 * @param index
	 */
	void comment(Comment comment, int index);
	/**
	 * Delete comment method to be overridden
	 * @param index
	 */
	void deleteComment(int index);
	/**
	 * Delete recipe method to be overridden
	 * @param index
	 */
	void deleteRecipe(int index);
	
	/**
	 * User behavior method to be overridden
	 * @return
	 */
	String userBehaviour();

	/**
	 * Prepare recipe method to be overridden
	 * @param builder
	 */
	void createRecipePrepare(RecipeBuilder builder);
	/**
	 * Add directions method to be overridden
	 * @param builder
	 * @param directions
	 */
	void addDirections(RecipeBuilder builder, String directions);
	/**
	 * Add attribution method to be overridden
	 * @param builder
	 * @param attribution
	 */
	void addAttribution(RecipeBuilder builder, String attribution);
	/**
	 * Add category method to be overridden
	 * @param builder
	 * @param category
	 */
	void addCategory(RecipeBuilder builder, Category category);
	/**
	 * Add ingredients method to be overridden
	 * @param builder
	 * @param ingredients
	 */
	void addIngredients(RecipeBuilder builder, ArrayList<Ingredient> ingredients);
	/**
	 * Add tags method to be overridden
	 * @param builder
	 * @param tags
	 */
	void addTags(RecipeBuilder builder, ArrayList<Tag> tags);
}
