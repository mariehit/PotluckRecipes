import java.util.ArrayList;
import java.util.Locale.Category;


public class RecipeBuilder {
	private int recipe_id;
	private String directions;
	private String attribution;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Comment> comments;
	private ArrayList<Tag> tags;
	private Category category;
	
	private RecipeBuilder(){}
	
	public static RecipeBuilder create() {
		return new RecipeBuilder();
	}
	
	public RecipeBuilder setRecipeID(int id) {
		recipe_id = id;
		return this;
	}
	
	public RecipeBuilder setDirections(String directions) {
		this.directions = directions;
		return this;
	}
	
	public RecipeBuilder setAttribution(String attribution) {
		this.attribution = attribution;
		return this;
	}
	
	public RecipeBuilder setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
		return this;
	}
	
	public RecipeBuilder setComments(ArrayList<Comments> comments) {
		this.comments = comments;
		return this;
	}
	
	public RecipeBuilder setTags(ArrayList<Tags> tags) {
		this.tags = tags;
		return this;
	}
	
	public RecipeBuilder setCategory(Category category) {
		this.category = category;
		return this;
	}
	
	public Recipe build(){
		return new Recipe(this);
	}
	
	public int getRecipeID() {
		return recipe_id;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public ArrayList<Tag> getTags() {
		return tags;
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

	public Category getCategory() {
		return category;
	}
}
