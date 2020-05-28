import java.util.Scanner ;
public class CH04_MyDrawing {
	public static void main(String [] args) {
		int num ;
		
		System.out.println("Please input a number:") ;
		Scanner keyboard = new Scanner(System.in) ;
		num = keyboard.nextInt() ;
		
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j <= i ; j++) {
			System.out.print("*") ;
			}
			System.out.println() ;
		}
		
		for(int x = 0 ; x < num ; x++) {
			for(int y = num ; y > x ; y--) {
			System.out.print("*") ;
			}
			System.out.println() ;
		}
	}
}
