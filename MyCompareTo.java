import java.util.Scanner ;

public class MyCompareTo {
	public static void main(String [] args)
	{
		String s1, s2, s3 ;
		String a = "y" ;
		
		do {
		System.out.println("Please input two words : ") ;
		Scanner keyboard = new Scanner(System.in) ;
		s1 = keyboard.next() ;
		s2 = keyboard.next() ;

		if(s1.compareTo(s2)<0)
			System.out.println(s1+" is before "+s2) ;
		else if(s1.compareTo(s2)>0)
			System.out.println(s1+" is after "+s2) ;
		else if(s1.compareTo(s2)==0)
			System.out.println(s1+" equals "+s2) ;
		
		System.out.println("Want to end the program??") ;
		System.out.println("Enter y for yes or n for no") ;
		s3 = keyboard.next() ;
		} while(s3.compareTo(a)==0) ;
	
		System.out.println("end the program!!") ;
		System.exit(0);
	}
}

