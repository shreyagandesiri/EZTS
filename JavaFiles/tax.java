package basic;
import java.util.*;
public class tax {
	public static void main(String[] args) {
	double age,sal;
	Scanner sc=new Scanner(System.in);
	age=sc.nextDouble();
	sal=sc.nextDouble();
	if(age<60){
	    if(sal==250000)
	        System.out.println("No tax");
	    else if(sal<=500000){
	        System.out.println((sal-250000)*0.05);
	    }
	    else if(sal<=1000000){
	        System.out.println((sal-500000)*0.1+12500);
	    }
	    else if(sal<=3000000){
	        System.out.println((sal-1000000)*0.2+62500);
	    }
	    else{
	        System.out.println((sal-3000000)*0.3+462500);
	        
	    }
	    
	}
	else{
	    if(sal==300000)
	        System.out.println("No tax");
	    else if(sal<=500000){
	        System.out.println((sal-300000)*0.05);
	    } 
	    else if(sal<=2000000){
	        System.out.println((sal-500000)*0.1+10000);
	    }
	    else{
	        System.out.println((sal-2000000)*0.2+155000);
	        
	    }
	}
		
	}

}
