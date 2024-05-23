package basic;
import java.util.*;

public class Second_largest {
	public static void main(String[] args) {
		int arr[]= {23,45,67,87,98,65};
		int s=arr.length;
		Arrays.sort(arr);
		int res=arr[s-2];
		System.out.println("Second_largest is:" +res);	
		
	}

}
