/*Excercise 1.1.3
 Write a Program that takes three integer command-line arguments and prints "equal" if all three are equal, and "not equal" otherwise
 
 Compilation:
 java Excercise_1_1_03
 Execution:
 java Excercise_1_1_03 a b c
 

 */

public class Excercise_1_1_03{
	public static void main(String[] args){
		int a,b,c;//3 integers for comparison
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		if((a==b)&&(b==c)){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
	}
}
