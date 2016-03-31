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
import potluck.domain.NormalUserBehaviour;
import potluck.domain.RecipeBuilder;
import potluck.domain.Tag;

/**
 * J unit test for NormalUserBehaviour class
 * @author Johan Setyobudi
 *
 */
public class TestNormalUserBehaviour {
	private NormalUserBehaviour normalBehaviour;
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
	 * Set up method
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		normalBehaviour = new NormalUserBehaviour();
		ingredients = new ArrayList<Ingredient>();
		comments = new ArrayList<Comment>();
		tags = new ArrayList<Tag>();	
		ingredient = new Ingredient("Water","2 cups");
		comment = new Comment("Test Comment", (short)5, "2016-03-27");
		tag = new Tag("Test tag");
		category = new Category(CategoryName.BAKERY);
		ingredients.add(ingredient);
		comments.add(comment);
		tags.add(tag);
		directions = "Test directions";
		attribution = "Test attribution";
		builder = RecipeBuilder.create();
		builder.setAttribution("test");
		builder.setCategory(category);
		builder.setComments(comments);
		builder.setTags(tags);
		normalBehaviour.createRecipe(builder);
	}

	/**
	 * Tear down method
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		normalBehaviour = null;
	}

	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#addDirections(potluck.domain.RecipeBuilder, java.lang.String)}.
	 */
	@Test
	public final void testAddDirections() {
		normalBehaviour.addDirections(builder, directions);
		assertEquals(directions,builder.getDirections());
	}

	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#addAttribution(potluck.domain.RecipeBuilder, java.lang.String)}.
	 */
	@Test
	public final void testAddAttribution() {
		normalBehaviour.addAttribution(builder, attribution);
		assertEquals(attribution,builder.getAttribution());	}

	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#addCategory(potluck.domain.RecipeBuilder, potluck.domain.Category)}.
	 */
	@Test
	public final void testAddCategory() {
		normalBehaviour.addCategory(builder, category);
		assertEquals(category,builder.getCategory());	
	}	

	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#addIngredients(potluck.domain.RecipeBuilder, java.util.ArrayList)}.
	 */
	@Test
	public final void testAddIngredients() {
		normalBehaviour.addIngredients(builder, ingredients);
		assertEquals(ingredients,builder.getIngredients());	
	}

	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#addTags(potluck.domain.RecipeBuilder, java.util.ArrayList)}.
	 */
	@Test
	public final void testAddTags() {
		normalBehaviour.addTags(builder, tags);
		assertEquals(tags,builder.getTags());	
	}
	
	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#viewRecipe(int)}.
	 */
	@Test
	public final void testViewRecipe() {
		final int id = 0;
		normalBehaviour.viewRecipe(id);
		assertEquals(id,builder.getRecipeID());	
	}

	/**
	 * Test method for {@link potluck.domain.NormalUserBehaviour#comment(potluck.domain.Comment, int)}.
	 */
	@Test
	public final void testComment() {
		normalBehaviour.comment(comment, 0);
		System.out.println(builder.getComments());
		assertEquals(comments,builder.getComments());	
	}
}
