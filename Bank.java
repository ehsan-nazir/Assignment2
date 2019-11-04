/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account;

import java.util.Scanner;

/**
 *
 * @author sp17-bse-033
 */
public class Bank {
    
    
	private String accnount;
	private String name;
	private long balance;

	Scanner SC=new Scanner(System.in);
        void openAccount()
	{ 
	System.out.print("Enter Account No: ");
	 accnount=SC.next();
	  System.out.print("Enter Name: ");
	   name=SC.next();
	    System.out.print("Enter Balance: ");
	     balance=SC.nextLong();
}
  // to display account details
	void showAccount()
	{ 
          System.out.println(accnount+","+name+","+balance);
	}

        void deposit()
	{
	  long amount;
	   System.out.println("Enter Amount to Deposit : ");
	    amount=SC.nextLong();
	     balance=balance+amount;
	}
// to withdraw money
	void withdrawal()
	{
		long amount;
		System.out.println("Enter Amount to withdraw : ");
		amount=SC.nextLong();
		if(balance>=amount)
		{ 
			balance=balance-amount;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}
        //method to search an account number
	boolean search(String acn)
	{ 
		if(accnount.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}

}
