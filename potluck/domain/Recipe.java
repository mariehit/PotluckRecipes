package potluck.domain;

import java.util.ArrayList;

public class Recipe {
	private int recipe_id;
	private String directions;
	private String attribution;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Category category;
	private static int idHelper = 0;
	
	public void display() {
		System.out.println("test");
		System.out.println(recipe_id);
		if (directions != null) { System.out.println(directions); }
		if (attribution != null) { System.out.println(attribution); }
		if (ingredients != null) { System.out.println(ingredients); }	
		if (comments != null) { System.out.println(comments); }
		if (tags != null) { System.out.println(tags); }
		if (category != null) { System.out.println(category); }
	}
	
	public Recipe(RecipeBuilder builder) {
		recipe_id = ++idHelper;
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
	
	public void setComment(Comment comment) {
		comments.add(comment);
	}

}
