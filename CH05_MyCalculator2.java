import java.util.Scanner ;

public class CH05_MyCalculator2 {
	private int a ;
	private int b ;
	
	public void getinput() {
		Scanner keyboard = new Scanner(System.in) ;
		System.out.println("*** CH05_MyCalculator ***") ;
		System.out.printf("Type 1st Num : ") ;
		a = keyboard.nextInt() ;
		System.out.printf("Type 2st Num : ") ;
		b = keyboard.nextInt() ;
	}
	public void printresult() {
		CH05_MyCalculator2 myCal = new CH05_MyCalculator2 () ;
		System.out.println("a + b = " + myCal.addition(a, b)) ;
		System.out.println("a - b = " + myCal.subtraction(a, b)) ;
		System.out.println("a * b = " + myCal.multiplication(a, b)) ;
		System.out.println("a / b = " + myCal.division(a, b)) ;
	}
	
	private void printmenu() {
		System.out.println(" + : add") ;
		System.out.println(" - : subtraction") ;
		System.out.println(" * : multiplication") ;
		System.out.println(" / : division") ;	
	}
	private double addition(int a, int b) {
		double sum = 0 ;
		sum = a + b ;
		return sum ;
	}
	private double subtraction(int a, int b) {
		double sum ;
		sum = a - b ;
		return sum ;
	}
	private double multiplication(int a, int b) {
		double sum ;
		sum = a * b ;
		return sum ;
	}
	private double division(int a, int b) {
		double sum ;
		sum = a / b ;
		return sum ;
	}
	
	public static void main(String[]args) {
		CH05_MyCalculator2 myCal2 = new CH05_MyCalculator2() ;
		myCal2.getinput() ;
		myCal2.printresult() ;
	}
}

