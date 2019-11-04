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
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner SC=new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customer U Want to Input : ");
		int n=SC.nextInt();
		Bank  B[]=new Bank[n];
		for(int i=0;i<B.length;i++)
		{   
			B[i]=new Bank();
			B[i].openAccount();
		}
		
		//run loop until 5 is not pressed
		int ch;
		do
		{
		System.out.println("Main Menu\n"
		+"1.Display All\n"
		+"2.Search By Account\n"
		+"3.Deposit\n"
		+"4.Withdrawal\n"
		+"5.Exit");
                System.out.println("Choose operator you want to perform :");
		System.out.println("Ur Choice :");
		ch=SC.nextInt();
		switch(ch)
			{ 
	case 1:
		for(int i=0;i<B.length;i++)
		{
	          B[i].showAccount();
		}
		 break;

	case 2:
		System.out.print("Enter Account No to Search...: ");
		String account=SC.next();
		boolean found=false;
		for(int i=0;i<B.length;i++)
                {  
		found=B[i].search(account);
		if(found)
		{
		break;
	        }
		}
		if(!found)
		{
		System.out.println("Search Failed..Account Not Exist..");
		}
		break;

	case 3:
		System.out.print("Enter Account No : ");
		account=SC.next();
		found=false;
		for(int i=0;i<B.length;i++)
		{  
		found=B[i].search(account);
		if(found)
		{
		B[i].deposit();
		break;
		}
		}
		if(!found)
		{
		System.out.println("Search Failed .......\n Account Not Exist..");
		}
		break;

		case 4:
		System.out.print("Enter Account No : ");
		account=SC.next();
		found=false;
		for(int i=0;i<B.length;i++)
		{  
		found=B[i].search(account);
		if(found)
		{
		B[i].withdrawal();
			break;
		}
		}
		if(!found)
		{
		System.out.println("Search Failed..Account Not Exist..");
		}
		break;

	case 5:
		System.out.println("Thank You For Banking With1 Us..");
		break;
		}
		}
		while(ch!=5);
	}
}
    
    

