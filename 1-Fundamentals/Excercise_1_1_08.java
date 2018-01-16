public class Excercise_1_1_08{
	public static void main(String[] args){
		//sub section a.
		System.out.println("a.");
		System.out.println('b');
		System.out.println("Explanation: Println(char) writes chars as 1 character strings\n");
		
		//sub section b.
		System.out.println("b.");
		System.out.println('b' + 'c');
		System.out.println("Explanation: Java's + operator converts chars to ints\n");

		//sub section c.
		System.out.println("c.");
		System.out.println((char)('a' + 4));
		System.out.println("Explanation: Explicit casting converts the result of the add operation from int to char");
	}
}
