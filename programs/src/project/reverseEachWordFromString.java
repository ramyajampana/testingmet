package project;

public class reverseEachWordFromString {

	public static void main(String[] args) {
		String completedrev="";
	String s1="welcome to java";
	String[] str=s1.split(" ");
	for(String s:str) 
	{
		String revstring = "";
		for(int i=s.length()-1;i>=0;i-- ) {
			revstring=revstring+s.charAt(i);
		}
		completedrev=completedrev+revstring+" ";	
		System.out.print(completedrev);
	
	}
	
	}

}
