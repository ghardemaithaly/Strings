package stringPrograms;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);//user input
		System.out.println("Enter a Sentence ");//printing statement
		String sentence=sc.nextLine();//storing user input
		System.out.println("Before Reverse Sentence is:  "+ sentence);//printing statement and userinput
		String [] words=sentence.split(" "); //single Dimentional array
											//it will split in multiple part where space will occur
		String reverseSentence="";//variable to store string after reversing
		
		for(String s:words) {	//for each loop which stores word and the word after split
			String reverseword=""; //it will store word after reversing
			for(int i=s.length()-1;i>=0;i--) {// this will loop till the length of the word
				reverseword+=s.charAt(i); //stores reversewords at the index 
			}
				reverseSentence+=reverseword+" ";//reversewords is storing at reverseSentence
		}
		System.out.println("After Reverse Sentence is:   "+reverseSentence);
	}

}
