package loop;
import java.util.Scanner;
public class forLoop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			 int fact = 1;
//			for(int i = 1; i <= 10; i++) {
//				System.out.println(n + "*" + i + "=" + (n * i) );
//			}
			
			for(int i = n; i >= 1; i--) {
				fact=fact*i;
				
			}
			System.out.println(fact);

			
			
	}

}
