package caculator;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest3 {
	private Calculator cal = new Calculator();
	
	@Test
	public void add() {		
		assertEquals(7, cal.add(3, 4));
	}
	
	@Test
	public void subtract() {
		assertEquals(-1, cal.subtract(3, 4));
	}
	
	@Test
	public void multiply() {
		assertEquals(12, cal.multiply(3, 4));
	}
	
	@Test
	public void divide() {
		assertEquals(0, cal.divide(3, 4));
	}
}
