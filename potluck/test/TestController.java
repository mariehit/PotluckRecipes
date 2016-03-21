package potluck.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Category;
import potluck.domain.CategoryName;
import potluck.domain.Controller;
import potluck.domain.Ingredient;
import potluck.domain.RecipeDB;
import potluck.domain.Tag;

public class TestController {
	Controller controller;

	@Before
	public void setUp() throws Exception {
		controller = new Controller("marie", "000000");
	}

	@After
	public void tearDown() throws Exception {
		controller = null;
	}
	
	@Test
	public void testConstructorName() {
		assertEquals("Marie", controller.getUser().getUsername());
	}
	
	@Test
	public void testConstructorPassword() {
		assertEquals("000000", controller.getUser().getPassword());
	}

	@Test
	public void testCreateRecipePrepare() {
		controller.createRecipePrepare();
		assertNotNull(controller.getUser().getRecipeBuilder());
	}
	
	@Test
	public void testAddDirections() {
		controller.addDirections("directions");
		assertEquals("directions", controller.getUser().getRecipeBuilder().getDirections());
		
	}
	@Test
	public void testAddCategory() {
		controller.addCategory(new Category(CategoryName.BAKERY));
		assertEquals(CategoryName.BAKERY, controller.getUser().getRecipeBuilder().getCategory().getCategoryName());
	}
	
	@Test
	public void testAddIngredients() {
		Ingredient ingredient = new Ingredient();
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(ingredient);
		controller.addIngredients(ingredients);
		assertNotNull(controller.getUser().getRecipeBuilder().getIngredients());
	}
	
	@Test
	public void testAddTags() {
		Tag tag = new Tag();
		ArrayList<Tag> tags = new ArrayList<>();
		tags.add(tag);
		controller.addTags(tags);
		assertNotNull(controller.getUser().getRecipeBuilder().getTags());
	}
	
	public void testCreateRecipe() {
		controller.createRecipe();
		assertEquals(1, RecipeDB.RECIPE_DB.getRecipeList().size());
	}

	
}
