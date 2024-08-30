package com.as6;

public class Security {
	public void authorization(Account account,Customer customer)
			throws UnAuthorizedWithdrawTransactionException{
		

			if(account.getCustomer().getCustomerId()!=
			customer.getCustomerId()){
			/* Throwing an exception if the customer Id's doesn't
			* match
			*/
			throw new UnAuthorizedWithdrawTransactionException();
			}
			}


}
