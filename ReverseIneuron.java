package stringPrograms;

public class ReverseIneuron {

	public static void main(String[] args) {
		// Reversing using StringBuffer 
		
		//variable declare
		String str="iNeuron"; //1 object SCP
		System.out.println(str);

		
		//Object for StringBuffer class
		StringBuffer sb= new StringBuffer(str); //2 objects
		System.out.println(sb.reverse());//using direct method reverse
	}

}
