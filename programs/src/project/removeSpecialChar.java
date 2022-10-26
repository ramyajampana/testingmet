package project;

public class removeSpecialChar {

	public static void main(String[] args) {
//		String s="!@python#$java^&&ruby&";
//		String s1=s.replaceAll("[^a-zA-Z0-9]","");
//		System.out.println(s1);
		
		String s="         python     java     ruby  ";
		String s1=s.replaceAll("\\s","");
		System.out.println(s1);
	}

}
