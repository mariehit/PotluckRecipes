package potluck.domain;

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
	
//	static ArrayList<Recipe> recipes = RecipeList.recipeList.getInstance().recipes;
	
	enum Launch {
		INSTANCE;		
		
//		int id = 0;
//		String directions;
//		String attribution;
//		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
//		ArrayList<Tag> tags = new ArrayList<Tag>();
		//Category category = null;
		Controller controller;
//		User user = new User();

		public void mainMenu() 
		{
			Scanner input = new Scanner(System.in);
			Scanner keyboard = new Scanner(System.in);
			int choice = 0;
			String username;
			String password;
			System.out.println("1. Login" + "\n2. Logout" + "\n3. Quit program");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Username: ");
				username = input.next();
				System.out.print("Password: ");
				password = keyboard.next();
				controller = new Controller(username, password);
				System.out.println("Login successful!");
				secondMenu();
				break;
			case 2:
				controller = new Controller(null,null);
				System.out.println("Logged out successfully.");
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
				System.out.println("1. Add recipe" + "\n2. View recipe" + "\n3. Delete recipe" + "\n4. Search recipe");
				choice = input.nextInt();
				input.nextLine();
				String directions;
				String attribution;
				String ingredientName;
				String ingredientAmount;
				ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>(10);
				ArrayList<Tag> tags = new ArrayList<Tag>(10);
				switch (choice) {
				case 1:
					String prompt = null;

					do {
						System.out.println("Enter an ingredient");
						ingredientName = input.nextLine();
						System.out.println("Enter the amount");
						ingredientAmount = input.nextLine();
						ingredients.add(new Ingredient(ingredientName,ingredientAmount));
						controller.addIngredients(ingredients);
						System.out.println("Add more ingredients? Y/N");
						prompt = input.nextLine();
					} while (!prompt.equalsIgnoreCase("n"));

					System.out.println("Enter the directions");
					directions = input.nextLine();
					controller.addDirections(directions);

					System.out.println("Enter the attribution");
					attribution = input.nextLine();
					controller.addAttribution(attribution);

					do {
						System.out.println("Enter a tag");
						String tag = input.nextLine();
						tags.add(new Tag(tag));
						controller.addTags(tags);
						System.out.println("Add more tags? Y/N");
						prompt = input.nextLine();
					} while (!prompt.equalsIgnoreCase("n"));

//					recipes.add(user.createRecipe(directions, attribution, ingredients, tags));
					controller.createRecipePrepare();
					controller.createRecipe();
					break;
				case 2:
					int index = 0;
					System.out.print("Enter recipe index: ");
					index = input.nextInt();
					controller.viewRecipe(index);
					break;
				case 3:
					
					break;
				case 4:
					break;
				default:
					break;
				}
			} while (true);
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
