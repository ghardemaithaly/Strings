package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String or Sentence");
		String str=in.nextLine();
		
//		//direct through methods
		char[] ch=str.toCharArray();//convert string to character array
//		Arrays.sort(ch); // sort in numerical ascending order

		
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];//temp variable will store value of array at i index no
					ch[i]=ch[j]; // array value index j =  array value index i
					ch[j]= (char) temp; //here temp is char datatype using implicit typecasting
				}
			}
		}
		System.out.println("String After Sorting Alphabeticaly: "+Arrays.toString(ch));
	}

}
