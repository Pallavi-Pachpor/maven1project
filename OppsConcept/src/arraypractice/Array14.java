package arraypractice;

import java.util.Arrays;

public class Array14 {
//	program to make clone array
	public static void main(String[] args) {
    int array[]= {33,3,4,5};
    System.out.println("printing the original array");
    for(int a:array) {
    	System.out.print(a+ " ");
    }System.out.println("\nprinting the clone of the array");
    int clonearray[]=array.clone();             //arrayname.clone
    for (int i: clonearray) {
    	System.out.print(i+" ");
    }System.out.println("\n are both arr and carr?");
    System.out.println("array and clone array content validatation:"+Arrays.equals(array,clonearray));
    System.out.println("************************************");
    int newcopiedarray[]=Arrays.copyOf(array, array.length);
	for (int i : newcopiedarray){
		System.out.print(i+ " ");
	}
	System.out.println("\n******************************");
    int newcopiedrangearray[]=Arrays.copyOfRange(array, 1, 2);
    for( int i:newcopiedrangearray) {
    	System.out.print(i+" ");
    }System.out.println("\nComparing newCopiedRangeArray & newCopiedArray :" +Arrays.equals(newcopiedarray, newcopiedrangearray));
    System.out.println("*************************************");
    Arrays.sort(array);
    	System.out.println("after sorting the original array");
    	for (int i:array) {
    		System.out.print(i+" ");
    }
}
}

