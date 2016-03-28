/**
 * 
 */
package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import potluck.domain.Tag;

/**
 * @author Johan
 *
 */
public class TagTest {
	
	private Tag tag;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tag = new Tag("Test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tag = null;
	}

	/**
	 * Test method for {@link potluck.domain.Tag#Tag(java.lang.String)}.
	 */
	@Test
	public final void testTagString() {
		final String test = "Test!";
		tag.setText("Test!");
		assertEquals(test,tag.getText());
	}

	/**
	 * Test method for {@link potluck.domain.Tag#getTagId()}.
	 */
	@Test
	public final void testGetTagId() {
		final int id = 3;
		assertEquals(id,tag.getTagId());
	}

	/**
	 * Test method for {@link potluck.domain.Tag#getText()}.
	 */
	@Test
	public final void testGetText() {
		final String text = "Test";
		assertEquals(text,tag.getText());
	}

	/**
	 * Test method for {@link potluck.domain.Tag#setText(java.lang.String)}.
	 */
	@Test
	public final void testSetText() {
		final String text = "Test1";
		tag.setText("Test1");
		assertEquals(text,tag.getText());
	}

	/**
	 * Test method for {@link potluck.domain.Tag#toString()}.
	 */
	@Test
	public final void testToString() {
		final int id = 4;
		final String text = "Test";
		final String string = "Id: " +id +" Tag: "+ text;
		assertEquals(string,tag.toString());
	}

}
