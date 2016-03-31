package potluck.domain;

import java.util.ArrayList;
/**
 * An enumerator class holding an arrayList of the possible users
 * @author Marie
 *
 */

public enum UserDB {
	/**
	 * USER_DB
	 */
	USER_DB;

	/**
	 * User list
	 */
	private ArrayList<LoginUser> userList = new ArrayList<LoginUser>(); 


	/**
	 * Default constructor
	 */
	private UserDB() {
		userList.add(new LoginUser("Johan", "123456", false));//
		userList.add(new LoginUser("Jacob", "456789", false));
		userList.add(new LoginUser("Robert", "789123",false));
		userList.add(new LoginUser("Marie", "000000", true));	
	}

	/*
	 */
	/**
	 * Returns the arrayList of possible users
	 * @return userList
	 */
	public ArrayList<LoginUser> getUserList() {
		return userList;
	}

}
