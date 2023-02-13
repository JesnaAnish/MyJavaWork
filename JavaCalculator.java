package com.simplilearn.project;

import java.util.Scanner;

public class JavaCalculator {

	public static void main(String[] args) {
		//arithmetic calculator in java
		
		Scanner Input = new Scanner(System.in);
		JavaCalculator javaCal = new JavaCalculator();
		
		System.out.println("\t\t===========================\n");
		
		System.out.println("\t\tThis is a calculator\n");
		
		System.out.println("\t\t===========================");
		
		System.out.print("Please enter the first number  : ");
		double firstNumber = Input.nextDouble();
		
        System.out.print("Please enter the second number : ");
        double secondNumber =Input.nextDouble();
        
        System.out.print("Please enter the operation to perform (+,-,/, or  *) : ");
        char operator =Input.next().charAt(0);
        
        if (operator =='+')
        	
        { 
        	double result = javaCal.addNumbers(firstNumber, secondNumber);
        	System.out.println("The sum of two numbers is  : " +result);
        	
        }
        else if (operator =='-')
        {
        	double result = javaCal.diffNumbers(firstNumber, secondNumber);
        	System.out.println("The difference of two numbers is  : " +result);
        	
        }
        else if (operator == '*')
        {
        	double result = javaCal.multiplyNumbers(firstNumber, secondNumber);
        	System.out.println("The multiplication of two numbers is  : " +result);
        	        	
        }
        else if (operator =='/')
        {
        	
        	if (secondNumber == 0)
        	{
            	System.out.println("The Divisor should not be zero,,,,,");
        	}
        	else
        	{
        		double result = javaCal.divNumbers(firstNumber, secondNumber);
        	
        		System.out.println("The division of two numbers is  : " +result);
        	
        }
        }
        else
        {
        	System.out.println("Please enter a valid operator,,,,,,");
        }
        
        
       
	}
	public double addNumbers(double num1, double num2 )
	{
		double result = num1+num2;
		return(result);
	}
	public double diffNumbers(double num1, double num2 )
	{
		double result = num1-num2;
		return(result);
	}
	public double multiplyNumbers(double num1, double num2 )
	{
		double result = num1*num2;
		return(result);
	}
	public double divNumbers(double num1, double num2 )
	{
		
		double result = num1/num2;
		return(result);
    			
	}




}

