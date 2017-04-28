package caculator;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	@Test
	public void add() {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3, 4));
	}
	
	@Test
	public void subtract() {
		Calculator cal = new Calculator();
		System.out.println(cal.subtract(3, 4));
	}
	
	@Test
	public void multiply() {
		Calculator cal = new Calculator();
		System.out.println(cal.multiply(3, 4));
	}
	
	@Test
	public void divide() {
		Calculator cal = new Calculator();
		System.out.println(cal.divide(3, 4));
	}
}
