import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
public class Excercise_1_1_21
{
	public static void main(String[] args)
	{
		String current;
		String [] lineParse;
		int[] intValues = new int[2];
		double ratio;
		String name;

		while(StdIn.hasNextLine())
		{
			current = StdIn.readLine();
			lineParse = current.split(",");//takes comma seperated values and splits them into an array of Strings
			name = lineParse[0];
			intValues[0] = Integer.parseInt(lineParse[1]);
			intValues[1] = Integer.parseInt(lineParse[2]);
			ratio = (double)intValues[0] / (double)intValues[1];
			System.out.printf("%-10s %d %d %.3f\n", name, intValues[0], intValues[1], ratio);
		}
	}
}
