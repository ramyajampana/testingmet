package project;

import java.util.Scanner;

public class sumOfarray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the size of an Array");
	int n=scan.nextInt();
	
	int arr[]=new int[n];
	System.out.println("Enter the values to Array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}

	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		}	
	System.out.println(sum);
	}
}