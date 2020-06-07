public class CH07_Matrix2 {
	
	public static int[][] makeMatrix2 (int[][] intArray) {
		int sum = 1 ;
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				intArray[i][j] = sum ;
				sum ++ ;
			}
		}
		return intArray ;
	}
	public static int[][] makeMatrix (int[][] intArray) {
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				intArray[i][j] = j+i ;
			}
		}
		return intArray ;
	}
	public static void printMatrix (int[][] intArray) {
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				System.out.printf(intArray[i][j] + " " ) ;
			}
			System.out.println() ;
		}
	}
	public static void addition (int[][] intArray, int[][] intArray2) {
		int[][] add = new int[intArray.length][intArray[0].length] ;
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				add[i][j] = intArray[i][j] + intArray2[i][j] ;
			}
		}	

		System.out.println("\nMatrixt addition is..") ;
		for(int i = 0 ; i < add.length ; i++) {
			for(int j = 0 ; j < add[i].length ; j++) {
				System.out.printf(add[i][j] + " " ) ;
			}
			System.out.println() ;
		}	
	}
	public static void subtraction (int[][] intArray, int[][] intArray2) {
		int[][] subtraction = new int[intArray.length][intArray[0].length] ;
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				subtraction[i][j] = intArray[i][j] - intArray2[i][j] ;
			}
		}	

		System.out.println("\nMatrixt subtraction is..") ;
		for(int i = 0 ; i < subtraction.length ; i++) {
			for(int j = 0 ; j < subtraction[i].length ; j++) {
				System.out.printf(subtraction[i][j] + " " ) ;
			}
			System.out.println() ;
		}	
	}
	public static void multiplication (int[][] intArray, int[][] intArray2) {
		int[][] multiplication = new int[intArray.length][intArray[0].length] ;
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				for(int x = 0 ; x < intArray2.length ; x ++) {
					multiplication[i][j] += intArray[i][x] * intArray2[x][j] ;
				}
			}
		}	

		System.out.println("\nMatrixt miltiplication is..") ;
		for(int i = 0 ; i < multiplication.length ; i++) {
			for(int j = 0 ; j < multiplication[i].length ; j++) {
				System.out.printf(multiplication[i][j] + " " ) ;
			}
			System.out.println() ;
		}	
	}
	
	public static void main(String[]args) {
		int[][] A = new int[3][3] ;
		int[][] B = new int[3][3] ;
		
		CH07_Matrix2.makeMatrix2(A) ;
		CH07_Matrix2.makeMatrix(B) ;
		
		System.out.println("\nMatrixt A is..") ;
		CH07_Matrix2.printMatrix(A) ;
		System.out.println("\nMatrixt B is..") ;
		CH07_Matrix2.printMatrix(B) ;
		
		CH07_Matrix2.addition(A, B) ;
		CH07_Matrix2.subtraction(A, B) ;
		CH07_Matrix2.multiplication(A, B) ;
	}
}
