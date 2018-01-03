/*
Excercise 1.1.5
Write a code fragment that prints true if the double variables x and y are both strictly between 0 and 1 and false otherwise.

Compilation:
javac Excercise_1_1_05.java

Execution java Excercise_1_1_05 x y
*/
public class Excercise_1_1_05{
	public static void main(String[] args){
		double x,y;
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		if((x>0)&&(x<1)&&(y>0)&&(y<1)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}
