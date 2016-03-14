
/**
 * Launcher class 
 * Potluck recipe project
 * CST 8288
 * March 7, 2016
 * @author Johan Setyobudi
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
	
	static ArrayList<Recipe> recipes = RecipeList.recipeList.getInstance().recipes;
	
	enum Launch {
		INSTANCE;		
		
		int id = 0;
		String directions;
		String attribution;
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
		ArrayList<Tag> tags = new ArrayList<Tag>();
		//Category category = null;
		
		User user = new User();

		public void mainMenu() 
		{
			Scanner input = new Scanner(System.in);
			int choice = 0;
			System.out.println("1. Login" + "\n2. Logout" + "\n3. Quit program");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				secondMenu();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			}
		}

		public void secondMenu() {
			Scanner input = new Scanner(System.in);
			int choice = 0;

			do {
				System.out.println("1.Add recipe" + "\n2.View recipe" + "\n3. Delete recipe" + "\n4. Search recipe");
				choice = input.nextInt();
				input.nextLine();
				switch (choice) {
				case 1:
					String prompt = null;

					do {
						System.out.println("Enter an ingredient");
						String ingredientName = input.nextLine();
						System.out.println("Enter the amount");
						String ingredientAmount = input.nextLine();
						ingredients.add(new Ingredient(ingredientName, ingredientAmount));
						System.out.println("Add more ingredients? Y/N");
						prompt = input.nextLine();
					} while (!prompt.equalsIgnoreCase("n"));

					System.out.println("Enter the directions");
					directions = input.nextLine();

					System.out.println("Enter the attribution");
					attribution = input.nextLine();

					do {
						System.out.println("Enter a tag");
						String tag = input.nextLine();
						tags.add(new Tag(tag));
						System.out.println("Add more tags? Y/N");
						prompt = input.nextLine();
					} while (!prompt.equalsIgnoreCase("n"));

					recipes.add(user.createRecipe(directions, attribution, ingredients, tags));

					break;
				case 2:
					break;
				case 3:
					if (recipes.size() == 0) {
						System.out.println("No recipes to delete");
					} else {
						System.out.println("Which recipe to delete?");
						for (int i = 0; i < recipes.size(); i++) {
							System.out.print(i + 1);
						}
						System.out.print("\n");
						user.deleteRecipe(input.nextInt());
						input.nextLine();
					}
					break;
				case 4:
					break;
				default:
					break;
				}
			} while (recipes.size() < 5);
		}
		
		public static Launch getInstance()
		{
			return INSTANCE;
		}

	}
	
	public static void main(String args[])
	{
		Launch launcher = Launch.getInstance();
		launcher.mainMenu();
	}
}