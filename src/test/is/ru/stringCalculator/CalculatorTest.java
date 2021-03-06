package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("is.ru.stringCalculator");
	}
	
	@Test
	public void testEmtyString(){
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testThreeNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testSplitNewLine(){
		assertEquals(6, Calculator.add("3\n3"));
	}
	@Test
	public void testNegatineNumber(){
		assertEquals("Negatives not allowed: -1", Calculator.add("1\n-1"));
	}
	
}