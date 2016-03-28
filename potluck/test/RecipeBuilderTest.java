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
import potluck.domain.RecipeBuilder;
import potluck.domain.Tag;

/**
 * @author Johan
 *
 */
public class RecipeBuilderTest {

	private RecipeBuilder builder;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Ingredient ingredient;
	private Tag tag;
	private String directions;
	private Comment comment;
	private String attribution;
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
		directions = "Test directions";
		attribution = "Test attribution";
		builder = RecipeBuilder.create();
		//		builder.setAttribution("test");
		//		builder.setCategory(category);
		//		builder.setComments(comments);
		//		builder.setTags(tags);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		builder = null;
		//		test = null;
	}

	//	/**
	//	 * Test method for {@link potluck.domain.RecipeBuilder#create()}.
	//	 */
	//	@Test
	//	public final void testCreate() {
	//		test = RecipeBuilder.create();
	////		builder = RecipeBuilder.create();
	//		assertEquals(RecipeBuilder.create(),RecipeBuilder.create());	
	//	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#setDirections(java.lang.String)}.
	 */
	@Test
	public final void testSetDirections() {
		final String directions = "Test Directions";
		builder.setDirections(directions);
		assertEquals(directions,builder.getDirections());	
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#setAttribution(java.lang.String)}.
	 */
	@Test
	public final void testSetAttribution() {
		final String attribution = "Test attribution";
		builder.setAttribution(attribution);
		assertEquals(attribution,builder.getAttribution());	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#setIngredients(java.util.ArrayList)}.
	 */
	@Test
	public final void testSetIngredients() {
		builder.setIngredients(ingredients);
		assertEquals(ingredients,builder.getIngredients());	
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#setComments(java.util.ArrayList)}.
	 */
	@Test
	public final void testSetComments() {
		builder.setComments(comments);
		assertEquals(comments,builder.getComments());	
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#setTags(java.util.ArrayList)}.
	 */
	@Test
	public final void testSetTags() {
		builder.setTags(tags);
		assertEquals(tags,builder.getTags());	
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#setCategory(potluck.domain.Category)}.
	 */
	@Test
	public final void testSetCategory() {
		builder.setCategory(category);
		assertEquals(category,builder.getCategory());	
	}

	//	/**
	//	 * Test method for {@link potluck.domain.RecipeBuilder#build()}.
	//	 */
	//	@Test
	//	public final void testBuild() {
	//		fail("Not yet implemented"); // TODO
	//	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getRecipeID()}.
	 */
	@Test
	public final void testGetRecipeID() {
		final int id = 0;
		assertEquals(0,builder.getRecipeID());
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getComments()}.
	 */
	@Test
	public final void testGetComments() {
		builder.setComments(comments);
		assertEquals(comments,builder.getComments());
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getTags()}.
	 */
	@Test
	public final void testGetTags() {
		builder.setTags(tags);
		assertEquals(tags,builder.getTags());
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getDirections()}.
	 */
	@Test
	public final void testGetDirections() {
		builder.setDirections(directions);
		assertEquals(directions,builder.getDirections());
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getAttribution()}.
	 */
	@Test
	public final void testGetAttribution() {
		builder.setAttribution(attribution);
		assertEquals(attribution,builder.getAttribution());
	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getIngredients()}.
	 */
	@Test
	public final void testGetIngredients() {
		builder.setIngredients(ingredients);
		assertEquals(ingredients,builder.getIngredients());	}

	/**
	 * Test method for {@link potluck.domain.RecipeBuilder#getCategory()}.
	 */
	@Test
	public final void testGetCategory() {
		builder.setCategory(category);
		assertEquals(category,builder.getCategory());
	}

}
