package project;

public class lengthwithoutLENGHTmethod {

	public static void main(String[] args) {
		String s1="ramya jam";
	String s=	s1.replaceAll("\\s","");
		int count=0;
		char c[]=s.toCharArray();
		for(char ch:c) {
			count=	count+1;	
		}
		
		System.out.println(count);

	}

}
