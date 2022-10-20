package arraypractice;

public class Array11 {
	public static void main(String args[]) {
		int age[][]=new int [3][4];   //Initialization and declaration of 2Darray
		System.out.println("array size is "+age.length); //it will show the row count
		for(int i=0;i<age.length;i++) {
			for(int j=0;j<age[i].length;j++) {
				System.out.print(age[i][j]+" ");
			}System.out.println();
			
		}
		System.out.println("**********************");
		age[0][0] = 1;
		age[0][1] = 2;
		age[0][2] = 3;
		age[1][0] = 4;
		age[1][1] = 5;
		age[1][2] = 6;
		age[2][0] = 7;
		age[2][1] = 8;
		age[2][2] = 9;
		age[2][3] = 45;
		age[1][3]=12;
		age[0][3]= 356;
		// printing 2D array
		for (int i = 0; i < age.length; i++) {// to get row number
			for (int j = 0; j < age[i].length; j++) {// to get column for above row
				System.out.print(age[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
