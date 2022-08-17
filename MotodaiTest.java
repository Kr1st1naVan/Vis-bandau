import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MotodaiTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
	}
	@Test
	void smallestNumberTest() {
		
		Metodai metodai = new Metodai();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,6,8,9,6,4,5,8,9,13,15));
		Integer smallestNumber = metodai.smallestNumber(numbers);
		assertEquals(4, smallestNumber);
	}
	
	@Test
	void averageTest() {
		Metodai metodai = new Metodai();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(25,45,65));
		Double average = metodai.average(numbers);
		assertEquals(45.00, average);
		
}
}
