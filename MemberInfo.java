import java.util.ArrayList;

public interface MemberInfo 
{
	static ArrayList<Recipe> recipes = RecipeList.recipeList.getInstance().recipes;
	
	public void comment();
	public Recipe createRecipe(String directions, String attribution, ArrayList<Ingredient> ingredients, ArrayList<Tag> tags);
	public void deleteComment();
	public void deleteRecipe(int index);
	public void viewComment();
	public void viewRecipe();
	public String accountBehaviour();
}
