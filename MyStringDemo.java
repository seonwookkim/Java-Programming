import java.util.* ;

public class MyStringDemo {
	public static void main (String [] args) {
		String sentence = "Jesus Christ Is My Savior" ;
		int index ;
		
		System.out.println(sentence) ;
		System.out.println("0123456789012345678901234") ;
		
		index = sentence.indexOf("Savior") ;
		System.out.println("The word \"Savior\" starts at index " + index) ;
		
		sentence = sentence.substring(0, index) + "friend" ;
		System.out.println("The changed string is :") ;
		System.out.println(sentence) ;
		
		sentence = sentence.replaceAll("friend", "joy") ;
		sentence = sentence.toUpperCase();
		System.out.println("The changed string is : ") ;
		System.out.println(sentence) ;
	}
}
