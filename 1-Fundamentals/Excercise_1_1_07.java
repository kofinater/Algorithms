import edu.princeton.cs.algs4.StdOut;
public class Excercise_1_1_07{
	public static void main(String[] args){
		//sub section a
		StdOut.print("a.\n");
		double t = 9.0;
		while (Math.abs(t-9.0/t) > .001)
			t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n",t);

		//sub section b
		StdOut.print("\nb.\n");
		int sum = 0;
		for (int i =1; i <1000; i++)
			for (int j =1; j<i ; j++)
				sum++;
		StdOut.println(sum);

		//sub section c
		StdOut.print("\nc.\n");
		sum = 0;
		for (int i =1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum++;
		StdOut.println(sum);
	}
}	
