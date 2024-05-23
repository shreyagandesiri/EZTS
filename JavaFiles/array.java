package basic;
import java.util.*;
public class array {

	public static void main(String[] args) {
		float sum=0,avg=0;
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the marks:\n");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum is"+sum);
		avg= sum/5;
		System.out.println("Average is"+avg);
	}

}
