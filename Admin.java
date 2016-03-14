import java.util.ArrayList;

public class Admin implements MemberInfo {
	public void comment() 
	{
		
	}

	public Recipe createRecipe(String directions, String attribution, ArrayList<Ingredient> ingredients, ArrayList<Tag> tags)
	{		
		return RecipeBuilder.create().setRecipeID(1).setDirections(directions).setAttribution(attribution)
				.setIngredients(ingredients).setTags(tags).setCategory(null).build();
	}

	public void deleteComment() 
	{
		
	}

	public void deleteRecipe(int index) 
	{
		recipes.remove(index - 1);
	}

	public void viewComment() 
	{
		//recipe.getComment();
	}

	public void viewRecipe() 
	{
		//recipe.toString();
	}

	public String accountBehaviour() 
	{
		return "Admin";
	}
}
