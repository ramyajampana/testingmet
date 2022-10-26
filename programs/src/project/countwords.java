package project;

public class countwords {
	public static void main(String[] args) {
//		int count=0;
//			String str="ramya jampana";
//			String s1=str.replaceAll("\\s","");
//			for(int i=0;i<s1.length();i++) {
//				count+=1;	
//			}
//			System.out.println(count);
//	}
	
	
	int c=0;
	String str="Ramya";
char c1[]=str.toCharArray();
for(char i:c1) {
	c=c+1;
}
System.out.println(c);
}
}