package wrapperclass;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		try {
			System.out.println("try block started");
			int arr[]=new int [5];
			arr[5]=30/2;
			System.out.println("try block ends");
	}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array exception:"+e);
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception:"+e);
		}catch(Exception e) {
			System.out.println("exception :"+e);
		}try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs "+e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);
		} catch (Exception e) {
			System.out.println("Parent Exception occurs "+e);
		}
		System.out.println("rest of the code");
	}

	}

/**
* try block can have multiple catch block, but only one catch block will be executed 
* try can handle only one abnormal condition at a time
*/
