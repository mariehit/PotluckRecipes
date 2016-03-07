import java.util.ArrayList;


public class Recipe {
	private int recipe_id;
	private String directions;
	private String attribution;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Category category;
	
	public Recipe(RecipeBuilder builder) {
		recipe_id = builder.getRecipeID();
		directions = builder.getDirections();
		attribution = builder.getAttribution();
		ingredients = builder.getIngredients();
		comments = builder.getComments();
		tags = builder.getTags();
		category = builder.getCategory();
	}
	
	public int getRecipe_id() {
		return recipe_id;
	}

	public String getDirections() {
		return directions;
	}

	public String getAttribution() {
		return attribution;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public Category getCategory() {
		return category;
	}

	
	
}
