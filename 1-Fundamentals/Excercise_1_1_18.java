public class Excercise_1_1_18{
	public static void main(String[] args){
		
		System.out.println("mystery(2, 25) = " + mystery(2,25));
		System.out.println("mystery(3, 11) = " + mystery(3,11));
		
		//Part 2 of the question 	
		System.out.println("mystery2(2, 25) = " + mystery2(2,25));
		System.out.println("mystery2(3, 11) = " + mystery2(3,11));	

	}
	public static int mystery(int a, int b){
		if (b == 0)	return 0;
		if (b % 2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}
	
	//Part 2 modifications of mystery(int a, in b)
	public static int mystery2(int a, int b){
		if (b == 0)	return 1;
		if (b % 2 == 0) return mystery2(a*a, b/2);
		return mystery2(a*a, b/2) * a;
	}
}

