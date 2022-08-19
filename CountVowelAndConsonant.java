package stringPrograms;

import java.util.Scanner;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		// variables
		int vowels=0, consonants=0;
		
		Scanner in= new Scanner (System.in);
		System.out.println("Enter a String");
		String str=in.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					vowels++;
				}
			else if((ch>='a' && ch<='z')) {
				consonants++;
			}
		}
		System.out.println(str);
		System.out.println("Number of vowels: "+ vowels);
		System.out.println("Number of consonants: "+ consonants);

	}

}
