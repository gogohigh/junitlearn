package caculator;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest2 {
	@Test
	public void add() {
		Calculator cal = new Calculator();		
		assertEquals(7, cal.add(3, 4));
	}
	
	@Test
	public void subtract() {
		Calculator cal = new Calculator();
		assertEquals(-1, cal.subtract(3, 4));
	}
	
	@Test
	public void multiply() {
		Calculator cal = new Calculator();
		assertEquals(12, cal.multiply(3, 4));
	}
	
	@Test
	public void divide() {
		Calculator cal = new Calculator();
		assertEquals(0, cal.divide(3, 4));
	}
}
