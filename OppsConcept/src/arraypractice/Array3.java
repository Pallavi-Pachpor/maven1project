package arraypractice;

public class Array3 {
	public static void main(String[] args) {
		int[] numbers= {1,-2,3,-4,5,6,7,8,9};
		double sum=0;
		double average;
		System.out.println("length of array is:"+numbers.length);
		for(int number:numbers) {
			sum=sum+number;  // 0=0+1; 1=1+-2 
		}int arraylength=numbers.length;
		average=sum/arraylength;
		System.out.println(sum);
		System.out.println(average);
		}
}
 