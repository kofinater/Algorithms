public class Excercise_1_1_20
{
	public static void main(String[] args)
	{
		System.out.println(lnFactorial(6));//Should evaluate to 6.57925121201		
	}
	public static double lnFactorial(int N)
	{
		if ( N == 1) return 0;
		return Math.log(N) + lnFactorial(N-1);
	}
	
}
