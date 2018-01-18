public class Excercise_1_1_12{
	public static void main(String[] args){
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(i);//What is printed in the book
			//System.out.println(a[i]);//The probably intended line manipulating the array then not printing from it would seem to defeat the purpose of the trace
			/* Print out of array
			 0
			 1
			 2
			 3
			 4
			 4
			 3
			 2
			 1
			 0
			 */
	}	
}
