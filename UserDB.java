package potluck.domain;

import java.util.ArrayList;
/*
 * an enum holding an arrayList of the possible users
 */
public enum UserDB {
	USER_DB;

	private ArrayList<LoginUser> userList = new ArrayList<LoginUser>(); 
	
	/*
	 * default constructor
	 */
	private UserDB() {
		userList.add(new LoginUser("Johan", "123456", false));//
		userList.add(new LoginUser("Jacob", "456789", false));
		userList.add(new LoginUser("Robert", "789123",false));
		userList.add(new LoginUser("Marie", "000000", true));	
	}

	/*
	 * returns the arrayList of possible users
	 */
	public ArrayList<LoginUser> getUserList() {
		return userList;
	}

}
