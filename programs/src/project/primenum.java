package project;

import java.util.Scanner;

public class primenum
{
	public static void main(String[] args)
	{
		int num=5;
		int c=0;
		if(num>0) 
		{
			for(int i=1;i<=num;i++)
            {
				if(num%i==0) 
				{
					c++;
			    }
            }
		if(c==2) 
		{
			System.out.println("prime");
		
		}
		else {
			System.out.println("not a prime num");
		}
	}
		else {
			System.out.println("not val num");
		}
}
}	
