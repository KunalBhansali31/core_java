package basic_Java_Codes;

import java.math.BigDecimal;

public class SICalculator {
	private BigDecimal principal;
	private BigDecimal interest;

	public SICalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
				BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
				return totalValue;
	}


}
