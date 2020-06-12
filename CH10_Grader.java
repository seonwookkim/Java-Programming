import java.io.File ;
import java.io.PrintWriter ;
import java.io.FileOutputStream ;
import java.io.FileInputStream ;
import java.io.IOException ;
import java.io.FileNotFoundException ;
import java.util.Scanner ;

public class CH10_Grader {
	public static void main(String[]args) throws IOException {
		String fileName = "grades.txt" ;
		String outfileName = "grades_average.txt" ;
		try {
			Scanner inputStream = new Scanner(new File(fileName)) ;
			String line = inputStream.nextLine() ;
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(outfileName, true)) ;
			
			double people = 0 ;
			int jv = 0, ds = 0, os = 0, ca = 0 ;
			double aver = 0, allaver = 0 ;
			outputStream.print(line + "\n") ;
			while(inputStream.hasNextLine()) {
				line = inputStream.nextLine() ;
				outputStream.print(line) ;
				String[] ary = line.split(",") ;
				jv = Integer.parseInt(ary[2]) ;
				ds = Integer.parseInt(ary[3]) ;
				os = Integer.parseInt(ary[4]) ;
				ca = Integer.parseInt(ary[5]) ;
				people = jv + ds + os + ca ;
				aver = people / 4 ;
				allaver += aver ;
				outputStream.print("," + aver + "\n") ;
			}
			outputStream.close();
			inputStream.close();
			//
			Scanner inputStream2 = new Scanner(new File(fileName)) ;
			String line2 = inputStream2.nextLine() ;
			PrintWriter outputStream2 = new PrintWriter(new FileOutputStream(outfileName, true)) ;
			
			double JvA = 0, DsA = 0, OsA = 0, CaA = 0 ;
			while(inputStream2.hasNextLine()) {
				line2 = inputStream2.nextLine() ;
				String[] ary = line2.split(",") ;
				int Jv = Integer.parseInt(ary[2]) ;
				int Ds = Integer.parseInt(ary[3]) ;
				int Os = Integer.parseInt(ary[4]) ;
				int Ca = Integer.parseInt(ary[5]) ;
				JvA += Jv ; DsA += Ds ; OsA += Os ; CaA += Ca ;
			}
			outputStream2.printf("Average,000000,%2.2f,%2.2f,%2.2f,%2.2f,%2.3f", JvA / 8, DsA / 8, OsA / 8, CaA / 8, allaver / 8) ;
			outputStream2.close();
			inputStream2.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName) ;
			System.exit(0) ;
		}
	}
}
