import java.util.Scanner;
import java.util.Random;

class Main {
	
	public static int arrLength;
	public static int[] array;
	public static int searchValue;
	public static void main(String[] args) {
		user_Input();
		display_And_Search();
	}

	public static void user_Input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array: ");
		arrLength = sc.nextInt();
		System.out.println("Enter search value: ");
		searchValue = sc.nextInt();
		sc.close();
	}
	public static void display_And_Search(){
		Random ran = new Random();
		array = new int[arrLength];
		System.out.print("The array: [");
		for(int i = 0; i < array.length - 1; ++i){
			array[i] = ran.nextInt(arrLength);
			System.out.print(array[i] + ",");
		}
		System.out.println(array[arrLength - 1] + "]");
		
		// Search
		for(int i = 0; i < array.length; ++i){
			if(array[i] == searchValue){
				System.out.println("Found " + searchValue +" at index: " + i);
				break;
			} else if(i == array.length - 1) {
				System.out.print("Not found!");
			}
		}
	}
}