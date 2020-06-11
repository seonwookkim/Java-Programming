import java.io.PrintWriter ;
import java.io.FileNotFoundException ;
import java.util.Scanner ;

public class CH10_TimeTable {
	public static void main(String[]args) {
		String fileName = "ThreeTimesTable.txt" ;
		PrintWriter outputStream = null ;
		
		try {
			outputStream = new PrintWriter(fileName) ;
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName) ;
			System.exit(0) ;
		}
		
		System.out.println("I am writing the 3 times table...") ;
		System.out.println("3 times table was created in ThreeTimesTable.txt") ;
		int n = 3 ;
		outputStream.println("Result in ThreeTimesTable.txt") ;
		outputStream.println("3 times table\n") ;
		for(int i = 1 ; i <= 9 ; i++) {
			outputStream.println(i + " * " + n + " = " + i * n) ;
		}
		outputStream.close();
	}
}
