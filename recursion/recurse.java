package recursion;
import java.util.*;
public class recurse {
 static void printnum(int i , int n) {
	if(i == n+1) {
		return;
	}
	else {
		printnum(i+1 ,n);
	System.out.println(i);
	}
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		printnum(1,n);
		 

	}

}
