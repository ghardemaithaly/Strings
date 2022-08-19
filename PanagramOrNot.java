package stringPrograms;

import java.util.Scanner;

public class PanagramOrNot {
	//word or sentence it should have all letters from a to z.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String with all Alphabets present a-z or A-Z");
		String sentence=sc.nextLine();
		
		//Array to store alphabets
		int[] alphabets=new int[26];
		boolean panagram=true;
		char ch;
		
		//loop each charater of String
		for(int i=0;i<sentence.length();i++) {
			ch=sentence.charAt(i);
			
			if(ch== ' ')
				continue;
			
		//check ch is alphabet if it is then increment
			if(ch>='A' && ch<='Z') {
				alphabets[ch-'A']++;
			}else if(ch>='a' && ch<='z') {
				alphabets[ch-'a']++;
			}
		}
		//
		
		for(int i=0;i<alphabets.length;i++) {
			if(alphabets [i]==0) {
				panagram=false;
				break;
			}
		}
		
		
		if(panagram) 
			System.out.println("String is Panagram "+sentence);
		else
			System.out.println("String is Not Panagram "+sentence);
	}

}
