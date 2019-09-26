package com.arrayprograms.app;

import java.util.Scanner;

public class Firstprogram
{
    public static void main(String[] args)
    {
		 
    	/*int[] number=new int[] {7,89,1,0,12};
    	int sum=0;
    	double average=0;
    	for (int i = 0; i < number.length; i++)  
    	{
			sum=sum+number[i];   
			
		}
    	System.out.println("Sum of the given number is "+sum);
    	average=sum/number.length;
    	System.out.println("Average of given numbers is "+average);
    	*/
    	
    	int length,sum=0;
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("enter the lenth of array");
    	 length=scanner.nextInt();
    	int[] num=new int[length];
    	System.out.println("Enter numbers");
    	for (int i = 0; i < num.length; i++) 
    	{
			num[i]=scanner.nextInt();
			
			sum+=num[i];
			
		}
    	System.out.println("sum of the given numbers "+sum);
    	
    	
    	
    	
    	
    	
    	
	}
    
}
