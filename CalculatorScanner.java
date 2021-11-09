package com.qa.calculatorex;

public class CalculatorScanner {
	
	public static double result;
	
	
	public static double addition(double num1, double num2) {
		
		result=num1+num2;
		return result;
	}
	
	public static double minus(double num1, double num2) {
	
		result=num1-num2;
		return result;
	}
	
	public static double multiply(double num1, double num2) {
		
		result=num1*num2;
		return result;
	}
	
	public static double divide(double num1, double num2) {
		
		result=num1/num2;
		return result;
	}
}
