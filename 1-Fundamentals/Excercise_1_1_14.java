public class Excercise_1_1_14{
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		System.out.println(lg(N));
	}
	/*
	 * Takes an int value N as argument and returns the largest int not larger than the base-2 logarithm of N.
	 */
	public static int lg(int N){
		int ret = 0;
		for(int i=N;i>1;i/=2){
			ret++;
		}
		return ret;
	}
}
