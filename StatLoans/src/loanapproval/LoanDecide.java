package loanapproval;

import javax.swing.JOptionPane;

	public class LoanDecide {

		
		// variables
	private double Loan;
	   private double Mortgage;
	   private double Income;
	   static double sum;
	  
	   // needed getters and setters are declared below
	public double getLoan() {
		return Loan;
	}

	public void setLoan(double loan) {
		Loan = loan;
	}

	public double getMortgage() {
		return Mortgage;
	}

	public void setMortgage(double mortgage) {
		Mortgage = mortgage;
	}

	public double getIncome() {
		return Income;
	}

	public void setIncome(double income) {
		Income = income;
	}


	public double getLoanIncomePercent()	{
		return (Income / Loan) * 100;
	}

 
	public double getMortgageIncomePercent()	{
		return (Income / Mortgage) * 100;
	}
	
	public static void main(String[] args) {
		
		// object and variables 
	 	LoanDecide check = new LoanDecide();
	 	
	 	double number;        // this is a number holding variable
	 	double scores;    // The sum of statistics
	 	String input;        // this will hold inputs by users
 
	 	// the amount of requested loan is gotten and stored here
	 	input = JOptionPane.showInputDialog("What is the " + "Loan?");
	 		number = Double.parseDouble(input);
	 			check.setLoan(number);
	 			
	 	// the amount of total mortgages is gotten and stored here
	 	input = JOptionPane.showInputDialog("What is the " + "Mortgage?");
	 		number = Double.parseDouble(input);
	 			check.setMortgage(number);

	 	// the amount of annual income is gotten and stored here
	 	input = JOptionPane.showInputDialog("What is the " + "Income?");
	 		number = Double.parseDouble(input);
	 			check.setIncome(number);
 
	 	// display sum of loan/mortgage persent on console
	 	sum = check.getLoanIncomePercent() + check.getMortgageIncomePercent();
	 		System.out.println(sum);
	
 
	 	// adds different persentages
	 	scores = check.getLoanIncomePercent() + check.getMortgageIncomePercent();
 
	 	// this is where the decisionid made and displayed
	 	if (scores > 40) {
	  JOptionPane.showMessageDialog(null, 
			  "CONGRATS! Your loan request is APPROVED");
	 	} 
	 	else {
	  JOptionPane.showMessageDialog(null, 
			  "SORRY! Your loan request is DENIED");
	 		}
 		}
	}
