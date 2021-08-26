import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		System.out.println("The 45 sequence fibonacci: ");

		// int[] fibonacci = new int[45];
		// fibonacci[0] = 0;
		// fibonacci[1] = 1;
		// for(int i = 2; i < fibonacci.length; ++i){
		// 	fibonacci[i] = fibonacci[i -1] + fibonacci[i - 2];
		// }

		int fibonacci_1 = 0;
		int fibonacci_2 = 1;
		System.out.print(fibonacci_1 + ", " + fibonacci_2 + ", ");
		for(int i = 1; i <= 16; ++i){
			int fibonacci_3 = fibonacci_2 + fibonacci_1;
			System.out.print(fibonacci_3 + ", ");
			fibonacci_1 = fibonacci_2;
			fibonacci_2 = fibonacci_3;
		}

	}
}