package loop;

import java.util.Scanner;

public class araisedtoB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 int result = 1;
		  
		 for( int i = 0 ; i < b ; i++) {
			result = a * result ; 
			 
		 }
		 System.out.println(result);
	}

}
