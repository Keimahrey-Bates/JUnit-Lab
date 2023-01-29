import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook g1, g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(85);
		g1.addScore(90);
		g2.addScore(63);
		g2.addScore(99);
		g2.addScore(49);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("85.0 90.0 "));
		assertTrue(g2.toString().equals("63.0 99.0 49.0 "));
	}

	@Test
	void testSum() {
		assertEquals(175, g1.sum(), .0001);
		assertEquals(211, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(85, g1.minimum(), .001);
		assertEquals(49, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(90.0, g1.finalScore());
		assertEquals(162, g2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(3, g2.getScoreSize());
		
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().equals("85.0 90.0 "));
		assertTrue(g2.toString().equals("63.0 99.0 49.0 "));
	}

}
