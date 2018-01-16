public class Excercise_1_1_09{
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		System.out.println(Excercise_1_1_09_ToBinaryString(N));
	}

	//Code provided in the book.
	public static String Excercise_1_1_09_ToBinaryString(int N){
		String s="";
		for(int n = N; n>0; n /= 2){
			s = (n % 2) + s;
		}
		return s;
	}
}
