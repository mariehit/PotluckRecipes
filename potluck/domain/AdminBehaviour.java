package potluck.domain;

import java.util.ArrayList;

/*/
 * The part of the delegate that defines
 * the functionality of an admin
 */
public class AdminBehaviour extends NormalUserBehaviour implements UserBehaviour{

	/*
	 * deletes a comment based on the index recieved
	 */
	@Override
	public void deleteComment(int index) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * deletes a recipe based on the index recieved
	 */
	@Override
	public void deleteRecipe(int index) {
		RecipeDB.RECIPE_DB.deleteRecipe(index);
		
	}

	/*
	 * returns what kind of user is currently logged in
	 */
	@Override
	public String userBehaviour() {
		// TODO Auto-generated method stub
		return "admin";
	}

}
