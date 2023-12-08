package miniProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMOperation implements Interface{
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();
    String Username;
    
    // Method to login for multiple Users
    @Override
	public void login() {	
    	Map<String, String> ID = new HashMap<>();
    	String Username;
    	String Password;
    	Scanner  S = new Scanner(System.in);
    		ID.put("Lixon Mandro", "pwd1");
    		ID.put("Stebin", "1234");
    		ID.put("Anand", "pwd2");
    		ID.put("Sandy", "pwd3");
    		ID.put("Austine", "pwd4");
    		ID.put("Johnson", "pwd5");
    		ID.put("Michel", "pwd9");
    		ID.put("Navin", "pwd10");
    		ID.put("lionel", "pwd6");
    		ID.put("Antony", "pwd7");
    	//	ID.put(null, 0);
    		System.out.print("Enter your Username : ");
    		Username = S.next();
    		System.out.print("Enter your Password : ");
    		Password = S.next();
    		
    		if (ID.containsKey(Username) && ID.containsValue(Password)){
    				System.out.println("You are sucessfully logged in.");
    		}else {
    				System.out.println("Login failed\nIncorrect Username or Password");
    				System.exit(0);
    			}
        }
	
    //Method to View Balance
    @Override
    public void viewBalance() {
        System.out.println("Your Current Balance is : "+atm.getBalance());
        	System.out.println();
    }

    //Method to Withdraw Amount
    @Override
    public void withdrawAmount(double withdrawAmount) {
    	Scanner sc=new Scanner(System.in);
    	
        if(withdrawAmount%100==0) {
            if (withdrawAmount <= atm.getBalance()) {
            	System.out.print("Confirm? Y/N  : ");
            	String confirm=sc.next();
            	if(confirm.equalsIgnoreCase("Y")) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
                System.out.print("Do you wish to continue your transaction?\n Confirm Y/N  : ");
            	String confirm1=sc.next();
            	if(confirm1.equalsIgnoreCase("Y")) {
            		System.out.println("");
            	} else {
            		System.out.println("Thank you for banking with us...");
            		System.exit(0);
            	}
            	}
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else {
            System.out.println("Please enter the amount in multiple of 100");
        }   
    }

    //Method to deposit Amount
    @Override
    public void depositAmount(double depositAmount) {
    	System.out.print("Confirm? Y/N : ");
    	Scanner sc=new Scanner(System.in);
    	String confirm=sc.next();
	    if(confirm.equalsIgnoreCase("Y")) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
        System.out.print("Do you wish to continue your transaction?\n Confirm Y/N : ");
    	String confirm1=sc.next();
    	if(confirm1.equalsIgnoreCase("Y")) {
    		System.out.println("");
    	} else {
    		System.out.println("Thank you for banking with us...");
    		System.exit(0);
    	}
	    }
        
	    }
     

    //Method to View Mini Statement
    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getValue()+"\t"+m.getKey());
        }
    }

	
}  
    