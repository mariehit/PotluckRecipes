package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Category;
import potluck.domain.CategoryName;

public class TestCategory {
	private Category category;
	@Before
	public void setUp() throws Exception {
		category = new Category(CategoryName.BAKERY);
	}

	@After
	public void tearDown() throws Exception {
		category = null;
	}

	@Test
	public void test() {
		assertEquals(CategoryName.BAKERY, category.getCategoryName());
	}

}
