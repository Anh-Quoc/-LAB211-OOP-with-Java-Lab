import java.util.Scanner;

interface mainInterface{
	Scanner sc = new Scanner(System.in);
}

class Main implements mainInterface{
	public static void main(String[] args) {
		
	}
	public void menu(){
		System.out.println("========= Equation Program =========");
		System.out.println("1. Calculate Superlative Equation");
		System.out.println("2. Calculate Quadratic Equation");
		System.out.println("3. Exit");
		System.out.println("Please choice one option:");
		
	}
}