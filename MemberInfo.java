import java.util.ArrayList;

public interface MemberInfo 
{
	static ArrayList<Recipe> recipes = RecipeList.recipeList.getInstance().recipes;
	
	public void comment(int index, String Comment);
	public Recipe createRecipe(String directions, String attribution, ArrayList<Ingredient> ingredients, ArrayList<Tag> tags);
	public void deleteComment(int index, int commentIndex);
	public void deleteRecipe(int index);
	public void viewComment(int index, int commentIndex);
	public void viewRecipe(int index);
	public String accountBehaviour();
}
