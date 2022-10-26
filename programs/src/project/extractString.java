package project;

public class extractString {

	public static void main(String[] args) {
		String s="abc def";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				System.out.println(s.substring(4,7));
			}
		}
	}

}
