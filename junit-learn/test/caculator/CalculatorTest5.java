package caculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest5 {		
	private Calculator cal;
	
	@BeforeClass
	public static void suiteSetup() {
		System.out.println("beforeClass");
	}
	
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("before");
	}
	
	@Test
	public void add() {		
		assertEquals(7, cal.add(3, 4));
		System.out.println("add");
	}
	
	@Test
	public void subtract() {
		assertEquals(-1, cal.subtract(3, 4));
		System.out.println("subtract");
	}
	
	@Test
	public void multiply() {
		assertEquals(12, cal.multiply(3, 4));
		System.out.println("multiply");
	}
	
	@Test
	public void divide() {
		assertEquals(0, cal.divide(3, 4));
		System.out.println("divide");
	}
	
	@After
	public void teardown() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void suiteFinished() {
		System.out.println("afterClass");
	}	
}
