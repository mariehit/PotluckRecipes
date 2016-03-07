/**
 * Launcher class 
 * Potluck recipe project
 * CST 8288
 * March 7, 2016
 * @author Johan Setyobudi
 *
 */
import java.util.Scanner;

public enum Launcher {
	INSTANCE;

	public void mainMenu() {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		System.out.println("1. Login"
				+ "\n2. Logout"
				+ "\n3. Quit program");
		choice = input.nextInt();
		switch(choice) {
		case 1:
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
		System.out.println("1.Add recipe"
				+ "\n2.View recipe"
				+ "\n3. Delete recipe"
				+ "\n4. Search recipe");
		choice = input.nextInt();
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
}
