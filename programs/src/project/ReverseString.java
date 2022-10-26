package project;

public class ReverseString {

	public static void main(String[] args) {
		String s="ramya";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//		rev=rev+s.charAt(i)	;	
//		}
//		if(s.equals(rev)) {
//			System.out.println("palandrome");
//		}
//		else {
//			System.out.println("not pal");
//		}
//          System.out.println(rev);
		
//////////////////2ND WAY /////////////////////////////////
		
//StringBuilder str =new StringBuilder(s);
//System.out.println(str.reverse());
		StringBuffer b=new StringBuffer("Ramya");
		System.out.println(b.reverse());
		
}
}
