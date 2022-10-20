package block1;

public class block1 {
	{System.out.println("nonstatic 2");
	}
	static {
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		System.out.println("hello world");
		block1 s1 =new block1();
	//	block1 s2 =new block1();
		System.out.println("hello");
		block1 s3 =new block1();

		}static {
			System.out.println("static block1");
		} {
			System.out.println("nonstatic block");
		}
	}
     
