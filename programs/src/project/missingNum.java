package project;

public class missingNum {

	public static void main(String[] args) {
	int sumofArray=0;
	int totalrangeSum=0;
int arr[]= {1,4,6,3,2};
for(int i=0;i<arr.length;i++) {
	sumofArray=sumofArray+arr[i];
}
System.out.println(sumofArray);
for(int i=1;i<=6;i++) {
	totalrangeSum=totalrangeSum+i;
}
System.out.println(totalrangeSum);
System.out.println("missing num is:" +(totalrangeSum-sumofArray));
	}

}
