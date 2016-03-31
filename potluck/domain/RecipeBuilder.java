package potluck.domain;

import java.util.ArrayList;

/**
 * This class is a builder to create a recipe
 * @author Marie Zhang
 *
 */

public class RecipeBuilder {
	/**
	 * Recipe ID
	 */
	private int recipe_id;
	/**
	 * Direction
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
	private ArrayList<Comment> comments;
	/**
	 * Tags
	 */
	private ArrayList<Tag> tags;
	/**
	 * Category
	 */
	private Category category;
	
	
	/**
	 * Default constructor(Empty)
	 */
	private RecipeBuilder(){}
	
	
	/**
	 * Returns a new recipeBuilder
	 * @return RecipeBuilder
	 */
	public static RecipeBuilder create() {
		return new RecipeBuilder();
	}
	
	
	/**
	 * adds directions to the recipe being created
	 * @param directions
	 * @return directions
	 */
	public RecipeBuilder setDirections(String directions) {
		this.directions = directions;
		return this;
	}
	
	
	/**
	 * Adds an attribution to the recipe being created
	 * @param attribution
	 * @return attribution
	 */
	public RecipeBuilder setAttribution(String attribution) {
		this.attribution = attribution;
		return this;
	}
	
	
	/**
	 * Adds ingredients to the recipe being created
	 * @param ingredients
	 * @return ingredients
	 */
	public RecipeBuilder setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
		return this;
	}
	
	
	/**
	 * Adds comments to the recipe being created
	 * @param comments
	 * @return comments
	 */
	public RecipeBuilder setComments(ArrayList<Comment> comments) {
		this.comments = comments;
		return this;
	}
	
	/*
	 */
	/**
	 * Adds tags to the recipe being created
	 * @param tags
	 * @return tags
	 */
	public RecipeBuilder setTags(ArrayList<Tag> tags) {
		this.tags = tags;
		return this;
	}
	
	
	/**
	 * Sets the category of the recipe being created
	 * @param category
	 * @return category
	 */
	public RecipeBuilder setCategory(Category category) {
		this.category = category;
		return this;
	}
	
	/*
	 */
	/**
	 * Builds the recipe being created
	 * @return Recipe
	 */
	public Recipe build(){
		return new Recipe(this);
	}
	
	
	/**
	 * Returns the recipeID
	 * @return recipe_id
	 */
	public int getRecipeID() {
		return recipe_id;
	}

	
	/**
	 * Returns an arrayList of comments
	 * @return comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	
	/**
	 * Returns an arrayList of tags
	 * @return tags
	 */
	public ArrayList<Tag> getTags() {
		return tags;
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
	 * Returns the category
	 * @return category
	 */
	public Category getCategory() {
		return category;
	}
}
