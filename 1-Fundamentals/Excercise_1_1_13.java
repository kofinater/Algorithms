public class Excercise_1_1_13{
	public static void main(String[] args){
		int[][] m = {{1,2,3,4},
		            {5,6,7,8},
		            {9,10,11,12}};
		printTranspose(m);
				
	}
	
	
	/*
	 prints transpose of integer 2D array
	 Assumes array is not jagged
	 Assumes array has a size of atleast 1X1
	 */
	public static void printTranspose(int[][] matrix){
		int M = matrix.length;
		int N = matrix[0].length;
		for(int i = 0;i < N; i++){
			for(int j = 0; j < M; j++){
				System.out.print(matrix[j][i]+" ");		
			}
			System.out.println();
		}
		
	}
}
