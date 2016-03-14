import java.util.ArrayList;

public class NormalUser implements MemberInfo
{
	public void comment(int index, String comment)
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
		System.out.println("You do not have the proper rights to do this");
	}
	
	public void deleteRecipe(int index)
	{
		System.out.println("You do not have the proper rights to do this");
	}
	
	public void viewComment(int index, int commentIndex)
	{
		recipes.get(index - 1).getComments().get(commentIndex).toString();
	}
	
	public void viewRecipe(int index)
	{
		recipes.get(index- 1).toString();
	}
	
	public String accountBehaviour()
	{
		return "NormalUser";
	}
}
