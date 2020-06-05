import java.util.Scanner ;

public class CH07_Morse {
	private static String[] morse = {"o-", "-ooo", "-o-o", "-oo", "o", "oo-o", "--o", "oooo", "oo",
			"o---", "-o-", "o-oo", "--", "-o", "---", "o--o", "--o-", "o-o", "ooo", "-", "oo-",
			"ooo-", "o--", "-oo-", "-o--", "--oo"
	} ;
	public static String convert(String word) {
		String tmp = "" ;
		char check[] = new char[word.length()] ;
		for(int i = 0 ; i < word.length() ; i++) {
			check[i] = word.charAt(i) ;
			if(check[i] == 'A') tmp += morse[0] ;
			else if(check[i] == 'B') tmp += morse[1] ;
			else if(check[i] == 'C') tmp += morse[2] ;
			else if(check[i] == 'D') tmp += morse[3] ;
			else if(check[i] == 'E') tmp += morse[4] ;
			else if(check[i] == 'F') tmp += morse[5] ;
			else if(check[i] == 'G') tmp += morse[6] ;
			else if(check[i] == 'H') tmp += morse[7] ;
			else if(check[i] == 'I') tmp += morse[8] ;
			else if(check[i] == 'J') tmp += morse[9] ;
			else if(check[i] == 'K') tmp += morse[10] ;
			else if(check[i] == 'L') tmp += morse[11] ;
			else if(check[i] == 'M') tmp += morse[12] ;
			else if(check[i] == 'N') tmp += morse[13] ;
			else if(check[i] == 'O') tmp += morse[14] ;
			else if(check[i] == 'P') tmp += morse[15] ;
			else if(check[i] == 'Q') tmp += morse[16] ;
			else if(check[i] == 'R') tmp += morse[17] ;
			else if(check[i] == 'S') tmp += morse[18] ;
			else if(check[i] == 'T') tmp += morse[19] ;
			else if(check[i] == 'U') tmp += morse[20] ;
			else if(check[i] == 'V') tmp += morse[21] ;
			else if(check[i] == 'W') tmp += morse[22] ;
			else if(check[i] == 'X') tmp += morse[23] ;
			else if(check[i] == 'Y') tmp += morse[24] ;
			else if(check[i] == 'Z') tmp += morse[25] ;
		}
		return tmp ;
	}
	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in) ;
		
		System.out.println("Java Alphabet-to-Morse converter") ;
		System.out.print("Type a word : ") ;
		String word = kb.next() ;
		
		String morse_code = CH07_Morse.convert(word.toUpperCase()) ;
		System.out.println("Morse Codes : " + morse_code) ;
		
		kb.close();
	}
}

