package com.qa.atm;

import java.util.Scanner;

public class AtmSystem {

	public static void main(String[] args) {
		// ATM System
		System.out.println("Welcome to ABC atm machine");
		int balance = 50000 , withdraw, deposite, num;
		Scanner obj = new Scanner(System.in);
		 
		
		
		while(true)
		{
			System.out.println("1. Withdraw");
			System.out.println("2. Deposite");
			System.out.println("3. check balance");
			
			System.out.println("Choose a number!! ");
			
			num = obj.nextInt();
			
			switch(num) 
			{
			case 1 :
				System.out.println("Enter Amount to withdraw:  ");
				withdraw = obj.nextInt();
				if (balance >= withdraw)
				{
				balance = balance - withdraw;
				System.out.println("Total Available Balance is:  "+ balance);
				
				}
				else
				{
					System.out.println("You do not have enough balance");	
				}
				break;
				
			case 2:
				System.out.println("Enter Amount :  ");
				deposite = obj.nextInt();
				balance = balance + deposite;
				System.out.println("Tatal avalable balance:  "+ balance);
				
				break;
				
			case 3:
				System.out.println("Available Balance:  "+balance);
				break;
			case 4:
				System.out.println("Thank you for using the System");
				System.exit(0);
			}
		
		}

	}

}
