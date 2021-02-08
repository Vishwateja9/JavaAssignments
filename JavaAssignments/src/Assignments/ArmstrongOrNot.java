package Assignments;

import java.util.Scanner;

public class ArmstrongOrNot {
	
	 public void armstrongCheck(int num) {
	    	
		 int number=num;
	    	int rem,result=0,count=0,num1=num;
	    	while (num1 != 0) {
	    	      num1 /= 10;
	    	      ++count;
	    	    }
	    	while(num!=0)
	    	{
	    		rem=num%10;
	    		result+=Math.pow(rem, count);
	    		num/=10;
	    	}
	    	if(number==result)
	    		System.out.println("armstrong");
	    	else
	    		System.out.println("Not armstrong");
			
	    }

	}
        class Assignment1Q1 {

           public static void main(String[] args) {
	        
        	   // TODO Auto-generated method stub
	           Scanner scan=new Scanner(System.in);
	           System.out.println("Enter Number : ");
	           int number=scan.nextInt();
	           ArmstrongOrNot a=new ArmstrongOrNot();
	           a.armstrongCheck(number);
               scan.close();
}
}
