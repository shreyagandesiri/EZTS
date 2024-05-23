package basic;
import java.util.*;
public class factorial {
	static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Factorial of num is:"+fact(n));
	}
//	return 0;

}
