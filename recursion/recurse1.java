package recursion;
import java.util.*;
public class recurse1 {

	
static int sumnum(int i) {
	if ( i == 0) {
		return 0;
	}
	else {
		return i+sumnum(i-1);
	}
	
}
	public static void main(String[] args) {
		 int n = 5;
      System.out.println(sumnum( n));
	}

}
