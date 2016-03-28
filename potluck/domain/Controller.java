package potluck.domain;

import java.util.ArrayList;

/*
 * the controller to do what the user selects to do
 */
public class Controller {
	
	private LoginUser user;

	/*
	 * constructor to set up the user
	 */
	public boolean loginController(String username, String password) {
		for (LoginUser x: UserDB.USER_DB.getUserList()) {
			if (x.getUsername().equalsIgnoreCase(username) 
					&& x.getPassword().equalsIgnoreCase(password)) {
				user = x;
				return true;
			}
		}
		return false;
	}
	
	/*
	 * calls the createRecipePrepare function in the user
	 */
	public void createRecipePrepare() {
		user.createRecipePrepare();
	}
	
	/*
	 * passes the directions to the addDirections function
	 * in the user
	 */
	public void addDirections(String directions) {
		user.addDirections(directions);
	}
	/*
	 * passes the attribution to the addAttribution function
	 * in the user
	 */
	public void addAttribution(String attribution) {
		user.addAttribution(attribution);
	}
	/*
	 * passes the category to the addCategory function
	 * in the user
	 */
	public void addCategory(Category category) {
		user.addCategory(category);
	}
	/*
	 * passes an arrayList of ingredients 
	 * to the addIngredients function in the user
	 */
	public void addIngredients(ArrayList<Ingredient> ingredients) {
		user.addIngredients(ingredients);
	}
	/*
	 * passes an arrayList of tags to the 
	 * addTags function in the user
	 */
	public void addTags(ArrayList<Tag> tags) {
		user.addTags(tags);
	}

	/*
	 * calls the user's create recipe function
	 */
	public void createRecipe() {
		user.createRecipe();

	}
	
	/*
	 * views recipe based on the index if the index
	 * is not out of bounds
	 */
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
	
	/*
	 * sends the comment and an index to the user's 
	 * comment function
	 */
	public void comment(Comment comment, int index) {
		user.comment(comment, index);
	}
	
	/*
	 * passes an index to the deleteRecipe function
	 * in the user after checking to see if they are 
	 * an admin
	 */
	public void deleteRecipe(int index) {
		if(user.getIs_admin()) {
			user.changeBehaviour(new AdminBehaviour());
			user.deleteRecipe(index);
			user.changeBehaviour(new NormalUserBehaviour());
		}
	}
	
	/*
	 * returns what type of user is logged in
	 */
	public LoginUser getUser() {
		return user;
	}
	
	
}