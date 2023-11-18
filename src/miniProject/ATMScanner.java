package miniProject;

import java.util.Scanner;

public class ATMScanner extends ATMOperation{
	  public static void main(String[] args)  {
	        Interface op = new ATMOperation();
	        int atmpin=1234;
	        Scanner in=new Scanner(System.in);
	        System.out.println("Welcome to SDI bank !!!\n");
	        System.out.println("Plese Login to your account...");
	        op.login();
	            while(true){
	                System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Logout\n");
	                System.out.print("Enter your choice : ");
	                int ch=in.nextInt();
	                
	                if(ch==1){
	                	System.out.print("Enter ATM Pin: ");
	                    int pin=in.nextInt();
	                	if(atmpin == pin){
	                		 System.out.println();
	                		 op.viewBalance();
	                	    }
	                	else{
	                        System.out.println("Incorrect ATM pin");
	                    }
	                }
	                
	                else if(ch == 2){
	                	System.out.print("Enter ATM Pin: ");
	                    int pin=in.nextInt();
	                	if(atmpin == pin){
	                	    System.out.println();
	                		System.out.print("Enter amount to withdraw : ");
	                		 	double withdrawAmount=in.nextDouble();
	                		 	op.withdrawAmount(withdrawAmount);
	                	 }
	                	else{
	                        System.out.println("Incorrect Atm pin");
	                    }
	                	
	                }
	                
	                else if(ch == 3){
	                	System.out.print("Enter ATM Pin: ");
	                    int pin=in.nextInt();
	                	if(atmpin==pin){
	                		System.out.println();
	                        System.out.println("Enter Amount to Deposit :");
	                        double depositAmount=in.nextDouble();
	                        op.depositAmount(depositAmount);
	                	}
	                    	else{
	                            System.out.println("Incorrect Atm Number or pin");
	                       }
	                   }
	                   
	                   else if(ch == 4){
	                   	System.out.print("Enter ATM Pin: ");
	                       int pin=in.nextInt();
	                   	if(atmpin==pin){
	                   		 System.out.println();
	                   		 System .out.println("Mini Statement");
	                   		 System.out.println("************************");
	                            op.viewMiniStatement();
		                   		 System.out.println("****End of statement****");

	                   	 }
	                   }
	                   
	                   else if(ch == 5){
	                       System.out.println("You are successfully logged out.\n Thank you for using our services!!");
	                       System.exit(0);
	                   }
	                   
	                   else
	                   {
	                       System.out.println("Please enter valid choice");
	                   }
	               }
	           }
	       }



