package potluck.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Category;
import potluck.domain.CategoryName;
import potluck.domain.Ingredient;
import potluck.domain.LoginUser;
import potluck.domain.RecipeDB;
import potluck.domain.Tag;

public class TestLoginUser {
	private LoginUser user;

	@Before
	public void setUp() throws Exception {
		user = new LoginUser("marie", "000000", true);
	}

	@After
	public void tearDown() throws Exception {
		user = null;
	}

	@Test
	public void testConstructorName() {
		assertEquals("marie", user.getUsername());
	}
	
	@Test
	public void testConstructorPassword() {
		assertEquals("000000", user.getPassword());
	}
	
	@Test
	public void testConstructorIsAdmin() {
		assertEquals(true, user.getIs_admin());
	}
	
	@Test
	public void testCreateRecipePrepare() {
		user.createRecipePrepare();
		assertNotNull(user.getRecipeBuilder());
	}
	
	@Test
	public void testAddDirections() {
		user.addDirections("directions");
		assertEquals("directions", user.getRecipeBuilder().getDirections());
		
	}
	@Test
	public void testAddCategory() {
		user.addCategory(new Category(CategoryName.BAKERY));
		assertEquals(CategoryName.BAKERY, user.getRecipeBuilder().getCategory().getCategoryName());
	}
	
	@Test
	public void testAddIngredients() {
		Ingredient ingredient = new Ingredient();
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(ingredient);
		user.addIngredients(ingredients);
		assertNotNull(user.getRecipeBuilder().getIngredients());
	}
	
	@Test
	public void testAddTags() {
		Tag tag = new Tag();
		ArrayList<Tag> tags = new ArrayList<>();
		tags.add(tag);
		user.addTags(tags);
		assertNotNull(user.getRecipeBuilder().getTags());
	}
	
	public void testCreateRecipe() {
		user.createRecipe();
		assertEquals(1, RecipeDB.RECIPE_DB.getRecipeList().size());
	}


}
