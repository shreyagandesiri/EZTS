package basic;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
		int r;
		System.out.println("Enter no. of rows:");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		for(int i=1;i<=r;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
