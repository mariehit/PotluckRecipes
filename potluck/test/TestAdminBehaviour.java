package potluck.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.AdminBehaviour;
import potluck.domain.NormalUserBehaviour;
import potluck.domain.Recipe;
import potluck.domain.RecipeBuilder;
import potluck.domain.RecipeDB;

public class TestAdminBehaviour {
	private AdminBehaviour admin;

	@Before
	public void setUp() throws Exception {
		admin = new AdminBehaviour();
	}

	@After
	public void tearDown() throws Exception {
		admin = null;
	}

	@Test
	public void testDeleteRecipe() {
		RecipeBuilder builder = RecipeBuilder.create().setAttribution("attribution");
		NormalUserBehaviour user = new NormalUserBehaviour();
		RecipeDB.RECIPE_DB.setRecipeList(new ArrayList<Recipe>());
		user.createRecipe(builder);
		admin.deleteRecipe(0);
		System.out.println(RecipeDB.RECIPE_DB.getRecipeList());
		assertEquals(0,RecipeDB.RECIPE_DB.getRecipeList().size());

	}

}
