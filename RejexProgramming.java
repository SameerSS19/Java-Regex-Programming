package com.rejexprogram;
import java.util.Scanner;
public class RejexProgramming 
{
	public static void pincode()
	{
		System.out.println("Welcome to Java Patterns or Regular Expressions");
		System.out.println("Enter the Pincode");
		Scanner scan = new Scanner(System.in);
		String pincode = scan.nextLine();
		scan.nextLine();
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		System.out.println("The zip code is: " + pincode);
	    System.out.println("Check Indian post the Pin code is correct ? " + pincode.matches(regex)); 
	}
	public static void main(String[] args) 
	{
	pincode();
	}

}

