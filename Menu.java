package com.qa.calculatorex;

import java.util.Scanner;

public class Menu {

	Scanner input=new Scanner(System.in);
	
	public void menu() {
		
		boolean menuFlag= true;
		String menuOption ="";
		int num1;
		int num2;
		
		System.out.println("---".repeat(18));
		System.out.println("Welcome to the Calculator Menu");
		
		
		while(menuFlag) {
			System.out.println("Please select which operator you'd like to perform:");
			System.out.println("---".repeat(18));
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiply");
			System.out.println("4) Divide");
			System.out.println("5) Exit");
			
			menuOption = this.input.nextLine();

			switch (menuOption) {
			case "1":
				System.out.println("Please enter your first number");
				num1=input.nextInt();
				System.out.println("Please enter your second number");
				num2=input.nextInt();
				System.out.println("Your answer is: "+ (CalculatorScanner.addition(num1, num2)));
				break;
				
			case "2":
				System.out.println("Please enter your first number");
				num1=input.nextInt();
				System.out.println("Please enter your second number");
				num2=input.nextInt();
				System.out.println("Your answer is: "+ (CalculatorScanner.minus(num1, num2)));
				break;
				
			case "3":
				System.out.println("Please enter your first number");
				num1=input.nextInt();
				System.out.println("Please enter your second number");
				num2=input.nextInt();
				System.out.println("Your answer is: "+ (CalculatorScanner.multiply(num1, num2)));
				break;
				
			case "4":
				System.out.println("Please enter your first number");
				num1=input.nextInt();
				System.out.println("Please enter your second number");
				num2=input.nextInt();
				System.out.println("Your answer is: "+ (CalculatorScanner.divide(num1, num2)));
				break;
				
			case "5":
				menuFlag=false;
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Try option 1-5\n");
			}
			
		}
		
	}
	
	
}