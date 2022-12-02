package practiceArray;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements");
		for(int i =0 ; i< a.length;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("The sum of the elements is " + sum);
	}

}
