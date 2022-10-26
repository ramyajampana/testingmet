package project;

import java.util.Scanner;

public class minArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=scan.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the values to Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
			min=arr[i];
			}	
		}
		System.out.println(min);
		}
}
