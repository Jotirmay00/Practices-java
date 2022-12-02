package array;
import java.util.Scanner;
public class dimensional2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix");
		int rows = sc.nextInt();
		int col = sc.nextInt();
		
		int a[][] = new int[rows][col];
		int b[][] = new int[rows][col];
		System.out.println("Enter first matrix");
		for(int i = 0 ; i< rows ; i++) {
			for(int j = 0 ; j< col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter second matrix");
		for(int i = 0 ; i< rows ; i++) {
			for(int j = 0 ; j < col ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[rows][col];
		for(int i =0 ; i<rows ; i++) {
			for(int j = 0 ; j<col ; j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("The answer is ");
		for(int i = 0 ; i<rows ; i++) {
			for(int j= 0 ; j<col ; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
