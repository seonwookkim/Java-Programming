public class CH07_Matrix {
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
	
	public static void main(String[]args) {
		int[][] A = new int[3][5] ;
		int[][] B = new int[5][3] ;
		int[][] C = new int[3][3] ;
		
		CH07_Matrix.makeMatrix(A) ;
		CH07_Matrix.makeMatrix(B) ;
		CH07_Matrix.makeMatrix(C) ;
		
		System.out.println("\nMatrixt A is..") ;
		CH07_Matrix.printMatrix(A) ;
		System.out.println("\nMatrixt B is..") ;
		CH07_Matrix.printMatrix(B) ;
		System.out.println("\nMatrixt C is..") ;
		CH07_Matrix.printMatrix(C) ; 
	}
}
