import edu.princeton.cs.algs4.StdOut;
public class Fibonacci
{
	public static long F(int N)
	{
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	public static long MyF(int N)
	{
	
		if ( N == 0) return 0;
		if ( N == 1) return 1;
		long[] fibArr = new long[N+1];
		fibArr[0] = 0;
		fibArr[1] = 1;
		for(int i = 2; i <= N; i++)
		{
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		return fibArr[N];
	}

	public static void main(String[] args)
	{
		for (int N = 0; N < 100; N++)
			StdOut.println(N + " " + MyF(N));
	}
}
