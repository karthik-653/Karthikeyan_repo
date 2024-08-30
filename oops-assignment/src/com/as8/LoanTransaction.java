package com.as8;

public class LoanTransaction implements Runnable{

	private BankFund bankFund;
	
	private int customerId;
	
	private double loanAmount;
	
	public LoanTransaction(BankFund bankFund,int customerId, double loanAmount){
		//setting the bankFund this.bankFund=bankFund;
		//setting the customer ID
		this.customerId=customerId;
		//setting the amount this.loanAmount=loanAmount;
		}


	@Override
	public void run() {
		//document verification delay
		try {
			Thread.sleep((long)(2000*Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//disbursing the loan
		double fundAvailable=bankFund.debitFund(loanAmount);

		//displaying the success message
		System.out.println(customerId+"The loan is disbursed."
		+"Please collect the cash from the Teller"); System.out.println("Fund left in the bank "+
		fundAvailable);
		}


}
