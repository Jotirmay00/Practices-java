import java.util.*;
import java.lang.*;
import java.io.*;
public class sumofDigits {

/* Name of the class has to be "Main" only if the class is public. */

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); 
  
        int ninp = sc.nextInt(); 
  
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=ninp;i++) {
            int a = sc.nextInt(); 
            ls.add(getSum(a));
        }
        for(Integer e : ls) {
            System.out.println(e);
        }
	}
	static int getSum(int n) {
	    int sum = 0;
	    while(n>0) {
	        int rem = n%10;
	        n=n/10;
	        sum=sum+rem;
	    }
	    return sum;
	}

}
