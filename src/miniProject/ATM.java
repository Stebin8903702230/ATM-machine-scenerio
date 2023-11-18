package miniProject;

public class ATM {
	
	  	public double balance = 10000;
	    public double depositAmount;
	    public double withdrawAmount;


	    public double getBalance() {
	    //	ft = new DecimalFormat("$###,###.##");
	    //	System.out.println(ft.format(income));
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public double getDepositAmount() {
	        return depositAmount;
	    }

	    public void setDepositAmount(double depositAmount) {
	        this.depositAmount = depositAmount;
	    }
	    
	    public double getWithdrawAmount() {
	        return withdrawAmount;
	    }

	    public void setWithdrawAmount(double withdrawAmount) {
	        this.withdrawAmount = withdrawAmount;
	    }
	}



