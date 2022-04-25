package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PracticeAssessmentTests {

	@Test
	void prependValueLengthIncreased() {
		LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(5.2,8.1,9.4));
		int originalLength = numbers.size();
		PracticeAssessment.prependValue(numbers, 3.2);
		assertEquals(originalLength + 1, numbers.size());
	}
	@Test
	void prependValueNewValueTest() {
		LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(5.2,8.1,9.4));
		PracticeAssessment.prependValue(numbers, 3.2);
		assertEquals(3.2, numbers.get(0));
	}

	@Test
	void isBlahCaught() {
		assertEquals(PracticeAssessment.catchThis("3", "blah", "2"), 0);
	}
	@Test
	void threeNineTwoFourteen() {
		assertEquals(PracticeAssessment.catchThis("3", "9", "2"), 14);
	}
	@Test
	void allMinusTwoFourSevenThirteen() {
		assertEquals(PracticeAssessment.catchThis("-2", "-4", "-7"), -13);
	}
	@Test
	void minusfiveElevenMinusTwoFour() {
		assertEquals(PracticeAssessment.catchThis("-5", "11", "-2"), 4);
	}
}
