package day7;
import java.util.Scanner;
public class matmul {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows and colums in matrix1:");
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		int[][] m1 = new int[r1][c1];
		System.out.println("Enter elements of matrix1:");
		for(int i =0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				m1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter number of rows and colums in matrix2:");
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		int[][] m2 = new int[r2][c2];
		System.out.println("Enter elements of matrix1:");
		for(int i =0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				m2[i][j]=s.nextInt();
			}
		}
		if(c1!=r2) {
			System.out.println("Matrix multiplication is not possible!");
			return;
		}
		int [][] m3 = new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		System.out.println("The result of matrix multiplication is:");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
