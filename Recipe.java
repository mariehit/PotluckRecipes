package potluck.domain;

import java.util.ArrayList;

/*
 * holds information for recipes
 */
public class Recipe {
	private int recipe_id;
	private String directions;
	private String attribution;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Category category;
	private static int idHelper = 0;
	
	/*
	 * displays the information in recipe
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
	
	/*
	 * constructor for recipe
	 */
	public Recipe(RecipeBuilder builder) {
		recipe_id = ++idHelper;
		directions = builder.getDirections();
		attribution = builder.getAttribution();
		ingredients = builder.getIngredients();
		comments = builder.getComments();
		tags = builder.getTags();
		category = builder.getCategory();
	}
	/*
	 * returns the recipeID
	 */
	public int getRecipe_id() {
		return recipe_id;
	}

	/*
	 * reutnrs the directions
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
	 * returns the arrayList of comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/*
	 * returns the arrayList of tags
	 */
	public ArrayList<Tag> getTags() {
		return tags;
	}

	/*
	 * returns the category
	 */
	public Category getCategory() {
		return category;
	}
	
	/*
	 * adds comments to the comments arrayList
	 */
	public void setComment(Comment comment) {
		comments.add(comment);
	}

}
