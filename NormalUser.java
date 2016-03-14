import java.util.ArrayList;

public class NormalUser implements MemberInfo
{
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
		System.out.println("You do not have the proper rights to do this");
	}
	
	public void deleteRecipe(int index)
	{
		System.out.println("You do not have the proper rights to do this");
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
		return "NormalUser";
	}
}
