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
import potluck.domain.Comment;
import potluck.domain.Ingredient;
import potluck.domain.Recipe;
import potluck.domain.RecipeBuilder;
import potluck.domain.Tag;

/**
 * @author Johan
 *
 */
public class RecipeTest {
	private RecipeBuilder builder;
	private Recipe recipe;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Ingredient ingredient;
	private Tag tag;
	private Comment comment;
	Category category;



	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ingredients = new ArrayList<Ingredient>();
		comments = new ArrayList<Comment>();
		tags = new ArrayList<Tag>();	
		ingredient = new Ingredient("Water","2 cups");
		comment = new Comment("Test Comment", 5.0f, "2016-03-27");
		tag = new Tag("Test tag");
		category = new Category(CategoryName.BAKERY);
		ingredients.add(ingredient);
		comments.add(comment);
		tags.add(tag);
		builder =  RecipeBuilder.create();
		builder.setAttribution("Test");
		builder.setDirections("Pour water");
		builder.setIngredients(ingredients);
		builder.setComments(comments);
		builder.setTags(tags);
		builder.setCategory(category);
		recipe = new Recipe(builder);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		builder = null;
		recipe = null;
	}

	//	/**
	//	 * Test method for {@link potluck.domain.Recipe#display()}.
	//	 */
	//	@Test
	//	public final void testDisplay() {
	//		final String test = "";
	//		final String display = String.forrecipe.display();
	//		
	//		assertEquals(test,recipe.display());
	//	}

	//	/**
	//	 * Test method for {@link potluck.domain.Recipe#Recipe(potluck.domain.RecipeBuilder)}.
	//	 */
	//	@Test
	//	public final void testRecipe() {
	//		fail("Not yet implemented"); // TODO
	//	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getRecipe_id()}.
	 */
	@Test
	public final void testGetRecipe_id() {
		final int id = 0;
		assertEquals(id,builder.getRecipeID());
	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getDirections()}.
	 */
	@Test
	public final void testGetDirections() {
		final String directions = "Pour water";
		assertEquals(directions,builder.getDirections());
	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getAttribution()}.
	 */
	@Test
	public final void testGetAttribution() {
		final String attribution = "Test";
		assertEquals(attribution,builder.getAttribution());	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getIngredients()}.
	 */
	@Test
	public final void testGetIngredients() {
		ArrayList<Ingredient> ingredientsTest = new ArrayList<Ingredient>();
		ingredientsTest.add(ingredient);
		assertEquals(ingredientsTest,builder.getIngredients());
	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getComments()}.
	 */
	@Test
	public final void testGetComments() {
		ArrayList<Comment> commentsTest = new ArrayList<Comment>();
		commentsTest.add(comment);
		assertEquals(commentsTest,builder.getComments());
	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getTags()}.
	 */
	@Test
	public final void testGetTags() {
		ArrayList<Tag> tagTest = new ArrayList<Tag>();
		tagTest.add(tag);
		assertEquals(tagTest,builder.getTags());	
	}

	/**
	 * Test method for {@link potluck.domain.Recipe#getCategory()}.
	 */
	@Test
	public final void testGetCategory() {
		assertEquals(category,builder.getCategory());
	}

	/**
	 * Test method for {@link potluck.domain.Recipe#setComment(potluck.domain.Comment)}.
	 */
	@Test
	public final void testSetComment() {
		ArrayList<Comment> commentsTest = new ArrayList<Comment>();
		commentsTest.add(comment);
		assertEquals(commentsTest,builder.getComments());
	}

}
