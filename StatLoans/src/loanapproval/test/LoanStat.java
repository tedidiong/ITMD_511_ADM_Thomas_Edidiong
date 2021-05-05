package loanapproval.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loanapproval.LoanDecide;

class LoanStat {
	
	LoanDecide l;
	double income;
	double loan;
	double mortgage;
	
	
	@BeforeEach
	void setUp() throws Exception {
		l = new LoanDecide();
	}

	@Test
	void test() {

		assertEquals(l.getLoanIncomePercent(),l.getMortgageIncomePercent());
	}

}
