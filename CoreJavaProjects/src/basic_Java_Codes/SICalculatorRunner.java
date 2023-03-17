package basic_Java_Codes;

import java.math.BigDecimal;

public class SICalculatorRunner {

	public static void main(String[] args) {
		SICalculator calculator = new SICalculator("4500", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
