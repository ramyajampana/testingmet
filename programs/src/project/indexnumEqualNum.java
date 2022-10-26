package project;

public class indexnumEqualNum {
	public static int index() {
	int[] arr= {-4,-2,2,4,6,9};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==i) {
			return arr[i];
			}
		}
	return 0;
	}
	public static void main(String[] args) {
	System.out.println(index());
	}

}