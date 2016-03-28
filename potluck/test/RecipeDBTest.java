/**
 * 
 */
package potluck.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import potluck.domain.Category;
import potluck.domain.CategoryName;
import potluck.domain.Controller;
import potluck.domain.Ingredient;
import potluck.domain.Recipe;
import potluck.domain.RecipeBuilder;
import potluck.domain.RecipeDB;
import potluck.domain.Tag;

/**
 * @author Johan
 *
 */
public class RecipeDBTest {
	private RecipeDB test;
	private Recipe recipe;
	private RecipeBuilder builder;
	private Controller controller;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Controller controller = new Controller("johan","123456");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link potluck.domain.RecipeDB#addRecipe(potluck.domain.Recipe)}.
	 */
	@Test
	public final void testAddRecipe() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link potluck.domain.RecipeDB#getRecipeList()}.
	 */
	@Test
	public final void testGetRecipeList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link potluck.domain.RecipeDB#deleteRecipe(int)}.
	 */
	@Test
	public final void testDeleteRecipe() {
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
		ArrayList<Tag> tags = new ArrayList<Tag>();
		tags.add(new Tag("Test"));
		ingredients.add(new Ingredient("Test","1 Scoop"));
		builder.setAttribution("test");
		builder.setCategory(new Category(CategoryName.MEAT));
		builder.setDirections("test");
		builder.setIngredients(ingredients);
		builder.setTags(tags);
		//recipe = new Recipe(builder);
		test.addRecipe(recipe);
		ArrayList<Recipe> test1 = new ArrayList<Recipe>();
		test1.add(new Recipe(builder));
		test1 = test.getRecipeList();
		assertEquals(test.getRecipeList(),test1.get(0));
	}

}
