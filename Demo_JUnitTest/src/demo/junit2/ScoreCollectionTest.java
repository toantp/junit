package demo.junit2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import demo.junit.dataccess.ScoreCollection;


public class ScoreCollectionTest {

	/*@Test
	public void testAdd() {
		fail("Not yet implemented");
	}*/

	@Test
	public void answerArithmeticMeanOfTwoNumbers() {		
		//arrange
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		
		//Act
		int actualResult = collection.arithmeticMean();
		
		//Assert
		assertThat(actualResult, equalTo(6));
		//fail(String.format("Ket qua %d khong dung", actualResult));
	}

}
