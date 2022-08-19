package stringPrograms;

import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Anything a word or a Sentence");
		String str=in.nextLine();
		
		//storing input in a array
		char[] ch=str.toCharArray();//converts the string to a new character array
		System.out.println("The Entered String is: "+str);
		
		System.out.print("Repeated Characters in above String are: ");
		//for
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					
					System.out.print(ch[i]);
				}
			}
		}
	}

}
