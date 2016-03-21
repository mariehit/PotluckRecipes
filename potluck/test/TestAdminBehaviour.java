package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.AdminBehaviour;
import potluck.domain.NormalUserBehaviour;
import potluck.domain.RecipeBuilder;
import potluck.domain.RecipeDB;

public class TestAdminBehaviour {
	AdminBehaviour admin;

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
		user.createRecipe(builder);
		admin.deleteRecipe(0);
		assertEquals(0,RecipeDB.RECIPE_DB.getRecipeList().size());

	}

}
