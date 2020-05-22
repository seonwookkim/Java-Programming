import java.util.Scanner ;

public class MyKoreanChangeMaker {
	public static void main(String [] args) {
		System.out.println("Enter a whole number from 1 to 10000.") ;
		
		Scanner keyboard = new Scanner(System.in) ;
		int amount, originalAmount, fivehundred, hundred, ten, five, one ;
		amount = keyboard.nextInt() ;
		originalAmount = amount ;
		fivehundred = amount / 500 ;
		amount = amount % 500 ;
		hundred = amount / 100 ;
		amount = amount % 100 ;
		ten = amount / 10 ;
		amount = amount % 10 ;
		five = amount / 5 ;
		amount = amount % 5 ;
		one = amount ;

		if(0 < originalAmount && 10000 > originalAmount) {
			System.out.println(originalAmount + " won in coins can be given as:") ;
			System.out.println(fivehundred + " 500 won") ;
			System.out.println(hundred + " 100 won") ;
			System.out.println(ten + " 50 won") ;
			System.out.println(five + " 10 won") ;
			System.out.println(one + " 1 won") ;
		}
		else if(0 > originalAmount || 10000 < originalAmount)
			System.out.println("You have to put a number from 1 to 10000.") ;
	}
}

