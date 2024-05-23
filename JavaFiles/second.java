package basic;
import java.util.*;
public class second {
	public static void main(String[] args) {
		int  n1,n2,r;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("First number:");
		n1=sc.nextInt();
		System.out.println("Second number:");
		n2=sc.nextInt();
		System.out.println("Enter an operator(+,-,*,/,%):");
		op=sc.next().charAt(0);
		switch(op) {
		case '+':
		    r=n1+n2;
			System.out.println("Result:" +r);
			break;
		case '-':
		    r=n1-n2;
			System.out.println("Result:" +r);
			break;
		case '*':
		    r=n1*n2;
			System.out.println("Result:" +r);
			break;
		case '/':
			if(n2 != 0){
			    r=n1/n2;
			    System.out.println("Result:" +r);
			}
			else
				System.out.println("Division by zero is not possible ");
			break;
		case '%':
			if(n2 != 0){
			    r=n1%n2;
			    System.out.println("Result:" +r);
			}
			else
				System.out.println("Division by zero is not possible ");
			break;
		default:
			System.out.println("Invalid Operator");	
		}
		sc.close();
	}

}
