package stringPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	//Anagram is arranging the letters of another word in diffrent order.
	
	public static boolean isAnagram(String word1, String word2) { // this method is going to take both the String values from main method
		if(word1.length() != word2.length())
			return false;
		else {
			char[] String1Array=word1.toCharArray();
			char[] String2Array=word2.toCharArray();
			Arrays.sort(String1Array);
			Arrays.sort(String2Array);
			//comparing two Array
			return Arrays.equals(String1Array, String2Array);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);//input from user
		System.out.println("Please Enter A Word: ");
		String word1=sc.nextLine();
		System.out.println("Please Enter Another Word: ");
		String word2=sc.nextLine();
		
			//calling isAnagram method
		if(isAnagram(word1,word2)) {
			System.out.println("Words are Anagram: "+word1.toLowerCase()+" and "+word2.toLowerCase());
		}else {
			System.out.println("Words Are Not Anagram");
		}
	}

}
// after taking input when it is checking ignore captial or small alphabets order
// if sentence is given so maintain space