package basic;
import java.util.*;

public class first {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double bsal,da,ta,gsal;
		System.out.print("Enter Basic Salary:");
		bsal=sc.nextDouble();
		if(bsal >= 10000) {
			da=bsal*0.40;
			ta=bsal*0.30;
			}
		else {
			da=bsal*0.30;
			ta=bsal*0.20;
		}
		gsal=bsal + da + ta;
		System.out.println("Gross Salary:" +gsal);
		
	}

}
