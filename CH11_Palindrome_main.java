import java.util.Scanner ;

public class CH11_Palindrome_main {
	public static void main(String[]args) {
		System.out.println("Enter a String : ") ;
		Scanner keyboard = new Scanner(System.in) ;
		String word = keyboard.next() ;
		int i = 0 ;
		getPalindrome(word, i, word.length()-1) ;
	}

	public static void getPalindrome (String w, int begin, int end) {
		String word = w.toLowerCase() ;
		char check[] = new char[word.length()] ;
		if(end == 0) {
			System.out.println(w + " is a palindrome") ;
			return ;
		}
		
		if(begin == end) {
			System.out.println(w + " is a palindrome") ;
			return ;
		}
		else if(word.charAt(begin) != w.charAt(end)) {
			System.out.println(w + " is not a palindrome") ;
			return ;
		}
		else if(word.charAt(begin) == w.charAt(end)) {
			getPalindrome(w, begin+1, end-1) ;
		}
	}
}
