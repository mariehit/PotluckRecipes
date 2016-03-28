package potluck.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import potluck.domain.Ingredient;

public class TestIngredient {
	private Ingredient ingredient;

	@Before
	public void setUp() throws Exception {
		ingredient = new Ingredient("name", "measurement");
	}

	@After
	public void tearDown() throws Exception {
		ingredient = null;
	}

	@Test
	public void testConstructorName() {
		assertEquals("name", ingredient.getName());
	}
	
	@Test
	public void testConstructorMeasurement() {
		assertEquals("measurement", ingredient.getMeasurement());
	}

}
