import java.util.ArrayList;

public class Admin implements MemberInfo {
	public void comment(int index, String Comment) 
	{
		//recipes.get(index - 1).addComment(comment);
	}

	public Recipe createRecipe(String directions, String attribution, ArrayList<Ingredient> ingredients, ArrayList<Tag> tags)
	{		
		return RecipeBuilder.create().setRecipeID(1).setDirections(directions).setAttribution(attribution)
				.setIngredients(ingredients).setTags(tags).setCategory(null).build();
	}

	public void deleteComment(int index, int commentIndex) 
	{
		recipes.get(index).getComments().remove(commentIndex);
	}

	public void deleteRecipe(int index) 
	{
		recipes.remove(index - 1);
	}

	public void viewComment(int index, int commentIndex) 
	{
		recipes.get(index - 1).getComments().get(commentIndex).toString();
	}

	public void viewRecipe(int index) 
	{
		recipes.get(index - 1).toString();
	}

	public String accountBehaviour() 
	{
		return "Admin";
	}
}
