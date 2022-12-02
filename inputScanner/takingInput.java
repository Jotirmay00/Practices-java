package inputScanner; 
import java.util.Scanner;
public class takingInput {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();
	 int d = sc.nextInt();
	 int e = sc.nextInt();
	 int result = 0;
	 
	 result = a > b && c > d ? a > c ? a > e ? a : e : c > e ? c : e : b > d ? b > e ? b : e : d > e ? d : e; 
	  System.out.println("The biggest number is " + result);
	  }
}

	


