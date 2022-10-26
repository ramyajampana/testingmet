package project;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		int evenc=0;
		int oddc=0;
		int num=12345623;
	while(num>0)
	{
		int rem=num%10;        //remainder   
		if(rem%2==0) {
			evenc++;
		}
		else {
			oddc++;
		}
 num=num/10;
}
System.out.println(evenc);
System.out.println(oddc);
	}
	}