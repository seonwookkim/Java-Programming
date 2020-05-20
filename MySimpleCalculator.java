import java.util.Scanner ;

public class MySimpleCalculator {
	public static void main (String [] args) {
	int a, b ;
	
	System.out.println("Please input two numbers: ") ;
	
	Scanner keyboard = new Scanner (System.in) ;
	a = keyboard.nextInt() ;
	b = keyboard.nextInt() ;
	
	System.out.println ("a + b =" + (a+b)) ;
	System.out.println ("a - b =" + (a-b)) ;
	System.out.println ("a * b =" + (a*b)) ;
	System.out.println ("a / b =" + (a/b)) ;
	}
}
