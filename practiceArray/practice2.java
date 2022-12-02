package practiceArray;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n =  sc.nextInt();
		System.out.println("Enter the Elements");
		int a[] = new int[n];
		int temp = 0 ;
		for(int i = 0 ; i< a.length ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ;i<a.length ;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}

}
