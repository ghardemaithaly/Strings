package stringPrograms;

import java.util.Scanner;

public class CountSpecialCharacter {
	
	

	public static void main(String[] args) {
		int num=0, alphabet=0, special=0;
		Scanner in= new Scanner(System.in);
		System.out.println("Please Enter Alpha Numeric Special String");
		String alphaNumericString = in.nextLine();	
		
		for(int i=0;i<alphaNumericString.length();i++) {
			char ch=alphaNumericString.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alphabet++;
			}else if(ch>='0' && ch<='9') {
				num++;
				}else {
					special++;
				}
				
			}
		System.out.println("Alphabets  are "+ alphabet);
		System.out.println("Number: "+num);
		System.out.println("Special Character: "+special);
		
	}

}
