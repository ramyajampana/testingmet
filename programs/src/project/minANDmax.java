package project;

public class minANDmax {

	public static void main(String[] args) {
		int a[]= {10,20,5,1,3};
		int min=a[0];
		int max=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(min>a[i]) {
//				min=a[i];
//			}
//		}
//		System.out.println(min);
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
