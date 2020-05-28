import java.util.Scanner;

public class CH04_MySummation {
	public static void main(String [] args) {
		int num, sum ;
		sum = 0 ;
		
		System.out.println("Please input a number:") ;
		Scanner keyboard = new Scanner(System.in) ;
		num = keyboard.nextInt() ;
		
		for(int i = 1 ; i <= num ; i++) {
			sum += i ;
		}
		
		System.out.println("The summation from 1 to " + num + " is\n" + sum) ;
	}
}
