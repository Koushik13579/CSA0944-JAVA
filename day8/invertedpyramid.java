package day8;

public class invertedpyramid {

	public static void main(String[] args) {
		int r = 5;
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");			
				}
			for(int k=r;k>i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
