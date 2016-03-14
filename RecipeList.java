import java.util.ArrayList;

public class RecipeList 
{
	enum recipeList
	{
		INSTANCE;
		
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
		
		public static recipeList getInstance()
		{
			return INSTANCE;
		}
	}
}
