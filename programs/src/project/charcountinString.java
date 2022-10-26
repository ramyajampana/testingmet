package project;

import java.util.Scanner;

public class charcountinString {
	public static void main(String[] args) {
		int count = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		System.out.println("enter the search char");
		char ch=s.next().charAt(0);
		for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)==ch)
		count+=1;
		}
		System.out.println("the saerch charecter count"+ch+" "+count);
		}
	}


