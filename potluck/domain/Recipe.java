package potluck.domain;

import java.util.ArrayList;
/**
 * This class holds information for recipes
 * @author Marie Zhang
 *
 */
public class Recipe {
	/**
	 * Recipe id
	 */
	private int recipe_id;
	/**
	 * Directions
	 */
	private String directions;
	/**
	 * Attribution
	 */
	private String attribution;
	/**
	 * Ingredients
	 */
	private ArrayList<Ingredient> ingredients;
	/**
	 * Comments
	 */
	private ArrayList<Comment> comments = new ArrayList<>();
	/**
	 * Tags
	 */
	private ArrayList<Tag> tags;
	/**
	 * Category
	 */
	private Category category;
	/**
	 * Recipe ID Helper
	 */
	private static int idHelper = 0;

	/**
	 * Displays the information in recipe
	 */
	public void display() 
	{
		System.out.println(recipe_id);
		if (ingredients != null) 
		{ 
			for(int i = 0; i < ingredients.size(); i++)
			{
				ingredients.get(i).display();
			} 
		}	
		if (directions != null) { System.out.println("directions: " + directions); }
		if (attribution != null) { System.out.println("attribution: " + attribution); }		
		if (comments != null)
		{ 
			for(int i = 0; i < comments.size(); i++)
			{
				comments.get(i).display();
			} 
		}
		if (tags != null)
		{ 
			for(int i = 0; i < tags.size(); i++)
			{
				tags.get(i).display();
			} 
		}
		if (category != null) { category.display(); }
	}

	/**
	 * Constructor for recipe
	 * @param builder
	 */
	public Recipe(RecipeBuilder builder) {
		recipe_id = ++idHelper;
		directions = builder.getDirections();
		attribution = builder.getAttribution();
		ingredients = builder.getIngredients();
		tags = builder.getTags();
		category = builder.getCategory();
	}

	/**
	 * Returns the recipeID
	 * @return recipe_ID
	 */
	public int getRecipe_id() {
		return recipe_id;
	}


	/**
	 * Returns the directions
	 * @return directions
	 */
	public String getDirections() {
		return directions;
	}


	/**
	 * Returns the attribution
	 * @return attribution
	 */
	public String getAttribution() {
		return attribution;
	}


	/**
	 * Returns an arrayList of ingredients
	 * @return ingredients
	 */
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	
	/**
	 * returns the arrayList of comments
	 * @return comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	
	/**
	 * Returns the arrayList of tags
	 * @return tags
	 */
	public ArrayList<Tag> getTags() {
		return tags;
	}


	/**
	 * Returns the category
	 * @return category
	 */
	public Category getCategory() {
		return category;
	}


	/**
	 * Adds comments to the comments arrayList
	 * @param comment
	 */
	public void setComment(Comment comment) {
		comments.add(comment);
	}

}
