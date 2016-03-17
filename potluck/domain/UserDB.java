package potluck.domain;

import java.util.ArrayList;

public enum UserDB {
	USER_DB;

	private ArrayList<LoginUser> userList = new ArrayList<LoginUser>(); 
	
	private UserDB() {
		userList.add(new LoginUser("Johan", "123456", false));//
		userList.add(new LoginUser("Jacob", "456789", false));
		userList.add(new LoginUser("Robert", "789123",false));
		userList.add(new LoginUser("Marie", "000000", true));	
	}

	public ArrayList<LoginUser> getUserList() {
		return userList;
	}

}
