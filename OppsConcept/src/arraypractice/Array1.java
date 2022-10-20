package arraypractice;

public class Array1 {
	public static void main(String[] args) {
		/*
		 * //declaration int a[]; //size initialization a = new int[5];
		 */
		// or
		int a[] = new int[5]; // declaration and instantiation   
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0] = 10; // initialization       
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("************after initialization********************");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("*******************************************************************");
		System.out.println("length of the array is:" + a.length); // a is the array name  arrayname.length
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);              
			// ***************by using for each loop********************
			System.out.println("after using for each loop");
			for (int num : a) {
				System.out.println(num);
			}
			char[] getArray = new char[] { 'A', 'B', 'C', 'D' };
			// or
			char[] getArray1 = new char[4];
			getArray1[0] = 'A';
			getArray1[1] = 'B';
			getArray1[2] = 'C';
			getArray1[3] = 'D';
			// or
			char[] getArray2 = { 'A', 'B', 'C', 'D' };

			System.out.println("**************for-each loop----5*************");
			for (char num : getArray) {
				System.out.println(num);
			}
		}
	}

}
