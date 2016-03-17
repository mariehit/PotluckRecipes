package potluck.domain;

import java.util.ArrayList;

public class AdminBehaviour extends NormalUserBehaviour implements UserBehaviour{


	@Override
	public void deleteComment(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecipe(int index) {
		RecipeDB.RECIPE_DB.deleteRecipe(index);
		
	}

	@Override
	public String userBehaviour() {
		// TODO Auto-generated method stub
		return "admin";
	}

}
