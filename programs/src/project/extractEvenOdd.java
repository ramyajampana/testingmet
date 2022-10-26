package project;

import java.util.ArrayList;
import java.util.List;

public class extractEvenOdd {
	
	public static void main(String[] args) {

int evenc=0;
int oddc=0;
List<Integer> e= new ArrayList<>();
List<Integer> o= new ArrayList<>();
	int a[]= {10,3,20,5,30,7,40};
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			e.add(a[i]);
			evenc++;	
		}
		else {
			o.add(a[i]);
				oddc++;   
			}
	}
	System.out.println(oddc+""+o);
	System.out.println("even num:"+evenc+""+e);
}
}