import java.util.Scanner ;

public class CH06b_StrCalculator {
	public static int operation(int a, char oper, int b) {
		switch(oper) {
		case '+' :
			return a + b ;
		case '-' :
			return a - b ;
		case '*' :
			return a * b ;
		case '/' :
			return a / b ;
		default :
			return -1;
		}
	}
	
	public static int operation(String one, char oper, String two) {
		int a = Integer.valueOf(one) ;
		int b = Integer.valueOf(two) ;
		switch(oper) {
		case '+' :
			return a + b ;
		case '-' :
			return a - b ;
		case '*' :
			return a * b ;
		case '/' :
			return a / b ;
		default :
			return -1;
		}
	}
	
	public static double operation(double a, char oper, double b) {
		switch(oper) {
		case '+' :
			return a + b ;
		case '-' :
			return a - b ;
		case '*' :
			return a * b ;
		case '/' :
			return a / b ;
		default :
			return -1;
		}
	}
	
	public static void main(String[]args) {
		double result = 0.0 ;
		result = CH06b_StrCalculator.operation(10, '+', 20) ;
		System.out.println("Int op Int : " + result) ;
		
		result = CH06b_StrCalculator.operation("10", '+', "20") ;
		System.out.println("Str op Str : " + result) ;

		result = CH06b_StrCalculator.operation(10.0, '-', 20.0) ;
		System.out.println("Double op Double : " + result) ;
	}
}

