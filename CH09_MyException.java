import java.util.Scanner ;

public class CH09_MyException extends Exception{
	public String toString() {
		return ("String should not include\nspecial character $.") ;
	}
	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in) ;
		try {
			String str = kb.nextLine() ;
			MyTest(str) ;
		}
		catch(CH09_MyException mae) {
			System.out.println(mae.toString()) ;
		}
		kb.close() ;
	}
	
	static void MyTest(String str) throws CH09_MyException {
		char check[] = new char[str.length()] ;
		for(int i = 0 ; i < str.length() ; i++) {
			check[i] = str.charAt(i) ;
			if(check[i] == '$') {
				throw new CH09_MyException() ;
			}
		}
		System.out.println("String : " + str) ;
	}
}

