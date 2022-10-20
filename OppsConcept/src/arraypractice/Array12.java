package arraypractice;

public class Array12 {
	public static void main(String args[]) {
		int arr[][]= {{1,2,3},{11,12},{21,22,23,22}};
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}char[] charArr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		} System.out.println("**************************************");
		
	}
		
}

