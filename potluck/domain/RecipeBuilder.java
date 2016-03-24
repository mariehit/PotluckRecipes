package potluck.domain;

import java.util.ArrayList;

/*
 * the builder to create a recipe
 */
public class RecipeBuilder {
	private int recipe_id;
	private String directions;
	private String attribution;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Category category;
	
	/*
	 * default constructor
	 */
	private RecipeBuilder(){}
	
	/*
	 * returns a new recipeBuilder
	 */
	public static RecipeBuilder create() {
		return new RecipeBuilder();
	}
	
	/*
	 * adds directions to the recipe being created
	 */
	public RecipeBuilder setDirections(String directions) {
		this.directions = directions;
		return this;
	}
	
	/*
	 * adds an attribution to the recipe being created
	 */
	public RecipeBuilder setAttribution(String attribution) {
		this.attribution = attribution;
		return this;
	}
	
	/*
	 * adds ingredients to the recipe being created
	 */
	public RecipeBuilder setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
		return this;
	}
	
	/*
	 * adds comments to the recipe being created
	 */
	public RecipeBuilder setComments(ArrayList<Comment> comments) {
		this.comments = comments;
		return this;
	}
	
	/*
	 * adds tags to the recipe being created
	 */
	public RecipeBuilder setTags(ArrayList<Tag> tags) {
		this.tags = tags;
		return this;
	}
	
	/*
	 * sets the category of the recipe being created
	 */
	public RecipeBuilder setCategory(Category category) {
		this.category = category;
		return this;
	}
	
	/*
	 * builds the recipe being created
	 */
	public Recipe build(){
		return new Recipe(this);
	}
	
	/*
	 * returns the recipeID
	 */
	public int getRecipeID() {
		return recipe_id;
	}

	/*
	 * reutnrs an arrayList of comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/*
	 * reutnrs an arrayList of tags
	 */
	public ArrayList<Tag> getTags() {
		return tags;
	}

	/*
	 * returns the directions
	 */
	public String getDirections() {
		return directions;
	}

	/*
	 * returns the attribution
	 */
	public String getAttribution() {
		return attribution;
	}

	/*
	 * returns an arrayList of ingredients
	 */
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	/*
	 * returns the category
	 */
	public Category getCategory() {
		return category;
	}
}
