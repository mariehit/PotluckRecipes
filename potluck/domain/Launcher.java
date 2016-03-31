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
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * displays the menus the user will see
 */
public class Launcher {

	//	static ArrayList<Recipe> recipes = RecipeList.recipeList.getInstance().recipes;

	/**
	 * creates a singleton of the launcher
	 */
	enum Launch {
		INSTANCE;		
		Controller controller;

		/*
		 * displays the menu that first appears on screen
		 */
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
				controller = new Controller();
				if (controller.loginController(username, password)) {
					System.out.println("Login successfully");
					secondMenu();
				}
				else {
					System.out.println("Wrong usename or password");
				}
				break;
			case 2:
				controller = null;
				mainMenu();
				break;
			case 3:
				System.out.println("Quitting program...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please choose again\n");
				break;
			}
		}

		/**
		 * displays a second menu that is navigated to
		 * by the user
		 */
		public void secondMenu() {
			Scanner input = new Scanner(System.in);
			int choice = 0;
			do {
				System.out.println("1. Add recipe" + "\n2. View recipe" + "\n3. Delete recipe" + "\n4. Add comment to recipe" +"\n5. Logout");
				choice = input.nextInt();
				input.nextLine();
				String directions;
				String attribution;
				String ingredientName;
				String ingredientAmount;
				String comment;
				int index = 0;
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

					System.out.println("Would you like to add attribution? Y/N");
					prompt = input.nextLine();
					if (!prompt.equalsIgnoreCase("n")) {
						System.out.println("Enter the attribution");
						attribution = input.nextLine();
						controller.addAttribution(attribution);
					}
					do {
						System.out.println("Enter a tag");
						String tag = input.nextLine();
						tags.add(new Tag(tag));
						controller.addTags(tags);
						System.out.println("Add more tags? Y/N");
						prompt = input.nextLine();
					} while (!prompt.equalsIgnoreCase("n"));
					int categoryChoice = 0;
					do{
						System.out.println("Choose a category: ");
						System.out.println("1. Meat");
						System.out.println("2. Veggie");
						System.out.println("3. Bakery");
						categoryChoice = input.nextInt();
						switch(categoryChoice) {
						case 1:
							controller.addCategory(new Category(CategoryName.MEAT));
							break;
						case 2:
							controller.addCategory(new Category(CategoryName.VEGGIE));
							break;
						case 3:
							controller.addCategory(new Category(CategoryName.BAKERY));
							break;
						default:
							System.out.println("Invalid choice. Please choose again");
							categoryChoice = 0;
							break;
						}

					}while(categoryChoice == 0);
					controller.createRecipe();
					break;
				case 2:
					try {
						System.out.print("Enter recipe index: ");
						index = input.nextInt();
						controller.viewRecipe(index); 
					} catch(NullPointerException e) {
						System.out.println("Recipe list is currently empty.");
					}
					break;
				case 3:
					System.out.println("Enter recipe index to delete: ");
					index = input.nextInt();
					controller.deleteRecipe(index);
					break;
				case 4:
					boolean addMore = false;
					float stars = 0;
					do{
						System.out.println("Enter recipe index: ");
						index = input.nextInt();
						System.out.println("Enter a comment: ");
						input.nextLine();
						comment = input.nextLine();
						System.out.println("Enter a rating: ");					
						stars = input.nextFloat();
						controller.comment(new Comment(comment,(short)stars,java.time.LocalDate.now().toString()), index);
						System.out.println("Add more comments? Y/N");
						input.nextLine();
						prompt = input.nextLine();
					} while (!prompt.equalsIgnoreCase("n"));
					break;
				case 5:
					System.out.println("Logging out...");
					controller = null;
					mainMenu();					
					break;
				default:

					break;
				}
			} while (true);
		}

		/*
		 * returns an instance of the singleton
		 */
		public static Launch getInstance()
		{
			return INSTANCE;
		}

	}

	/**
	 * the entry point to the program
	 */
	public static void main(String args[])
	{
		do{
			try {
				Launch launcher = Launch.getInstance();
				launcher.mainMenu();
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter only an integer for the menu.\n");
			}
		}		while(true);

	}
}
