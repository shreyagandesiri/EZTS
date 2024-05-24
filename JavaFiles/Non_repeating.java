package basic;
import java.util.*;

public class Non_repeating {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner s=new Scanner(System.in);
		String w=s.nextLine();
		char fnr='\0';
		for(int i=0;i<w.length();i++) {
			char c=w.charAt(i);
			boolean isRep=false;
			for(int j=0;j<w.length();j++) {
				if(i!=j && c==w.charAt(j)) {
					isRep=true;
					break;
				}
			}
			if(!isRep) {
				fnr=c;
				break;
			}
		}
		if(fnr!='\0') {
			System.out.println("The first character is not repeating is:" +fnr);
		}
		else {
			System.out.println("There is no non-repeating character");
		}
		
	}

}
