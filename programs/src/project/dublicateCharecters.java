package project;

public class dublicateCharecters {
	public static void main(String[] args) {
	
		String str = "Ramya  Jampana";
	    char[] c = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {
	       for (int j = i + 1; j < str.length(); j++) {
	          if (c[i] == c[j] & c[i]!='0' & c[i]!=' ') {
	              c[j]='0';
	             System.out.print(c[i]);
	             break;
	          }
	       }
	    }
}
	}