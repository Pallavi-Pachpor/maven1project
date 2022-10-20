package wrapperclass;

public class Wrapperclass1 {
	public static void main(String[] args) {
		int age = 20;
		// boxing
		Integer obj1 = new Integer(45);
		Integer obj2 = 23;
		System.out.println("value of obj1is:" + obj1); // 45
		System.out.println("value of obj2 is:" + obj2); // 23
		System.out.println("value of age is:" + age);// 20
		System.out.println(age == obj1);// false
		Integer obj3 = 20;
		System.out.println(age == obj3);// true
		// *********************************************************************************
		char c = 'z';
		Character ch1 = new Character('R');
		Character ch2 = 'P';
		System.out.println(ch1 == ch2);// false
		System.out.println(ch1);// R
		System.out.println(ch2);// P
		Character ch3 = new Character(c);
		System.out.println(ch3);// z
	}
}
