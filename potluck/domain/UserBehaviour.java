package potluck.domain;

import java.util.ArrayList;

public interface UserBehaviour {

	void createRecipe(RecipeBuilder builder);
	void viewRecipe(int index);
	void comment(Comment comment, int index);
	void deleteComment(int index);
	void deleteRecipe(int index);
	//public void viewComment();
	String userBehaviour();
	void createRecipePrepare(RecipeBuilder builder);
	void addDirections(RecipeBuilder builder, String directions);
	void addAttribution(RecipeBuilder builder, String attribution);
	void addCategory(RecipeBuilder builder, Category category);
	void addIngredients(RecipeBuilder builder, ArrayList<Ingredient> ingredients);
	void addTags(RecipeBuilder builder, ArrayList<Tag> tags);
}
