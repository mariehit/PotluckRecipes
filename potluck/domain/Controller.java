package potluck.domain;

import java.util.ArrayList;

public class Controller {
	
	private LoginUser user;

	
	public Controller(String username, String password) {
		for (LoginUser x: UserDB.USER_DB.getUserList()) {
			if (x.getUsername().equalsIgnoreCase(username) 
					&& x.getPassword().equalsIgnoreCase(password)) {
				user = x;
				break;
			}
		}
	}
	
	public void createRecipePrepare() {
		user.createRecipePrepare();
	}
	public void addDirections(String directions) {
		user.addDirections(directions);
	}
	public void addAttribution(String attribution) {
		user.addAttribution(attribution);
	}
	public void addCategory(Category category) {
		user.addCategory(category);
	}
	public void addIngredients(ArrayList<Ingredient> ingredients) {
		user.addIngredients(ingredients);
	}
	public void addTags(ArrayList<Tag> tags) {
		user.addTags(tags);
	}

	public void createRecipe() {
		user.createRecipe();

	}
	
	public void viewRecipe(int index) {
		if(index > RecipeDB.RECIPE_DB.getRecipeList().size() || index < 0)
		{
			System.out.println("Error! Error! Error! Err!");
		}
		else
		{
			user.viewRecipe(index);
		}
	}
	
	public void comment(Comment comment, int index) {
		user.comment(comment, index);
	}
	
	public void deleteRecipe(int index) {
		if(user.getIs_admin()) {
			user.changeBehaviour(new AdminBehaviour());
			user.deleteRecipe(index);
			user.changeBehaviour(new NormalUserBehaviour());
		}
	}
	
	public LoginUser getUser() {
		return user;
	}
	
	
}
