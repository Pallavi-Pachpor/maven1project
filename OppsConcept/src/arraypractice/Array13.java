package arraypractice;

import java.util.Arrays;

public class Array13 {
	public static void main(String[] args) {
		// declaring the source array
		char[] copyfrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		System.out.println("Elements count of copyfrom array:" + copyfrom.length);
		char[] copyto = Arrays.copyOf(copyfrom, copyfrom.length);
		System.out.println("Elements count of copyto array:" + copyto.length);
		for (int i = 0; i < copyto.length; i++) {
			System.out.print(copyto[i] + " ");
		}
		System.out.println("\n**********copy using the range*********");
		char[] copywithrange = Arrays.copyOfRange(copyfrom, 5, copyfrom.length); // int no here is the range from where
																					// we want to copy
		for (int i = 0; i < copywithrange.length; i++) {
			System.out.print(copywithrange[i] + " ");
		}
		System.out.println("\n******after sorting*********");
		Arrays.sort(copywithrange);
		for (char c : copywithrange) {
			System.out.print(c + " ");
		}
//		System.out.println(" ");Arrays.sort(copyfrom);
//			for(char a : copyfrom) {
//				System.out.print(a+" ");

		// }
		System.out.println(" ");
		Arrays.sort(copyto);
		for (char c : copyto) {
			System.out.print(c + " ");
		}
		System.out.println(" ");
		System.out.println("***********************************");
		char[] pallavi = copyfrom.clone();
		for (char g : pallavi) {
			System.out.print(g + " ");
		}
	}
}