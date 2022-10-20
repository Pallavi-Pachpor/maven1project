package arraypractice;
     class Array5{
    	static void arr(int arr[]) {
    		int num[]= {12,23,4,6,9,1};
    		int min = num[0];
    		for(int i=1;i<num.length;i++) {
    			if(min>num[i]) {
    				min=num[i];
    			}
    		}System.out.println("mimimum number is:"+min);
    	}static void max(int arr[]) {
    		int max = arr[0];
    		for (int i = 1; i < arr.length; i++) {
    			if (max < arr[i]) {// 
    				max = arr[i];
    			}
    		}
    		System.out.println("Max number in array is: "+max);
    	}
    }
     
public class Array4 {
	public static void main(String[] args) {
		int a[] = {1,2,30,4,5};
		Array5.arr(a);
		Array5.max(a);
	}
}
