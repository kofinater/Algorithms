public class Excercise_1_1_11{
	public static void main(String[] args){
		boolean[][] m = {{true, true, false},{false,false,true},{true,true,true}};
		printBool2dArray(m);
		/*
		 Test array should print:
		 ** 
		   *
		 ***

		 */
	}
	public static void printBool2dArray(boolean[][] m){//prints 2d boolean array where true is represented by * and false is represented by a sppace
		for(int i = 0; i < m.length; i++){
			for(int j=0; j < m[i].length; j++){
				if(true == m[i][j]){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
