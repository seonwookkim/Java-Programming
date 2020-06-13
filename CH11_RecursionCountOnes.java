import java.util.Scanner ;

public class CH11_RecursionCountOnes {
	public static void main(String[]args) {
		System.out.println("Enter a nonnegativ number : ") ;
		Scanner keyboard = new Scanner(System.in) ;
		int number = keyboard.nextInt() ;
		System.out.println(number + " containes " + getNumberOfOnes(number) + " ones.") ;
	}
	
	public static int getNumberOfOnes (int n) {
		int result ;
		
		if(n == 1) result = 1 ;
		else if(n < 10) result = 0 ;
		else if(n % 10 == 1) result = getNumberOfOnes(n/10) + 1 ;
		else result = getNumberOfOnes(n/10) ;
		
		return result ;
	}
}
