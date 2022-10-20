package arraypractice;

public class Array2 {
	public static void main(String[] args) {
		int age[] = { 11, 52, 25, 44, 45 }; // datatype arraname[]= { };
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		System.out.println("*********************************************");
		System.out.println("lenth of the array is :" + age.length); // 5
		System.out.println("*****by using for loop********");
		for (int i = 0; i < age.length; i++) {
			// System.out.println("value of age is"+age[i]);
			if (age[i] == 25) {
				System.out.println("age is 25");
				break;
			} else {
				System.out.println("age is not 25");
			}
		}
		System.out.println("***by using for each loop");
		for (int a : age) {
		//	System.out.println(a);
			if (a == 25) {
				System.out.println("age is 25");
				break;
			} else {
				System.out.println("age is not 25");
			}
		}

	}
}
