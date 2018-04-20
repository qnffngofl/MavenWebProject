package kr.co.gudi;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator c;
	int a = 4;
	int b = 2;
	
	@Before
	public void before() {
		System.out.println("before()");
		c = new Calculator();
	}
	
	@Test
	public void test() {
		System.out.println("test()");
		int result1 = c.add(a, b);
		assertEquals(a + b, result1);
		int result2 = c.subtract(a, b);
		assertEquals(a - b, result2);
		int result3 = c.multiply(a, b);
		assertEquals(a * b, result3);
		int result4 = c.divide(a, b);
		assertEquals(a / b, result4);
		System.out.println("add = " + result1 + "\n" + "substract = "  + result2 +
							"\n" + "multiply = " + result3 + "\n" + "divide = " + result4);
		
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}

}
