public class Excercise_1_1_15{
	public static void main(String [] args){
		//Test histogram(int [] a, int M) functionality
		int[] a = {0,0,1,1,1,1,1,1,2,2,2,1,1};
		int[] histogram = histogram(a, 3);
		for(int i=0; i < histogram.length; i++)
			System.out.println( i + ": " + histogram[i]);

		//If the values in a[] are all between 0 and M-1, the sum of the values in the returned array should be equal to a.length
		int sum = 0;
		for(int i = 0; i < histogram.length ; i++){
			sum += histogram[i];
		}
		if(a.length == sum){
			System.out.println("True");
		}
	}
	/*takes an array a[] of int values and an integer M
	 * returns an array of length M whoses ith entry is the number of times the integer i appeared in the argument array
	 */
	public static int[] histogram(int[] a, int M){
		int [] ret = new int[M];
		for(int i=0; i<M ; i++){
			for(int j = 0; j<a.length; j++){
				if(a[j]==i)
					ret[i]++;
			}
		}
		return ret;
	}
}
