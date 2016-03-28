/**
 * 
 */
package potluck.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import potluck.domain.LoginUser;
import potluck.domain.UserDB;

/**
 * @author Johan
 *
 */
public class UserDBTest {
	UserDB test;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link potluck.domain.UserDB#getUserList()}.
	 */
	@Test
	public final void testGetUserList() {
		ArrayList<LoginUser> userList = new ArrayList<LoginUser>();
		userList.add(new LoginUser("Johan", "123456", true));//
		userList.add(new LoginUser("Jacob", "456789", false));
		userList.add(new LoginUser("Robert", "789123",true));
		userList.add(new LoginUser("Marie", "000000", true));	
		assertEquals(userList,test.getUserList());
	}

}
