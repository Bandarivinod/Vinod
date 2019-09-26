package com.arrayprograms.app;

import java.util.Scanner;

public class Practice 
{

public static void main(String[] args) 
{
	

	{
		Scanner scanner=new Scanner(System.in);
	System.out.println("ENTER PINODE");
		   int pincode=scanner.nextInt();
		   switch (pincode) 
		   {
		case 505529:
			     System.out.println("THIPPANNAPET");
			     break;
		case 505530:
		     System.out.println("JAGTIAL");
		     break;
		case 505531:
		     System.out.println("KARIMNAGAR");
		     break;
		case 505532:
		     System.out.println("HYDERABAD");
		     break;

		case 505533:
		     System.out.println("TELANGANA");
		     break;

		case 505534:
		     System.out.println("INDIA");
            break;

		default:
			System.out.println("INVALID PINCODE");
			break;
		}
			}
	
	
}


}
