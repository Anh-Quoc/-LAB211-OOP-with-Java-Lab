import java.util.Scanner;
import java.util.Random;

class Main{
	public static int arrLength;
	public static int searchValue;
	public static int[] array;

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
		for(int i = 0; i < array.length; ++i){
			array[i] = ran.nextInt(arrLength);
		}

		QuickSort(0, arrLength - 1);
		
		System.out.print("Sorted array: [");
		for(int i = 0; i < array.length - 1; ++i){
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[arrLength - 1] + "]");

		int index = binary_Search(0, array.length - 1);
		if(index != -1) {
			System.out.print("Found " + searchValue + " at index " + index);
		} else {
			System.out.print("Not found!");
		}
	}

	public static void QuickSort(int begin, int end){
		int key = array[(begin + end)/2];
		int i = begin;
		int j = end;

		while(i <= j) {
			while(array[i] < key) ++i;
			while(array[j] > key) --j;

			if(i <= j){
				int value = array[i];
				array[i] = array[j];
				array[j] = value;
				++i; --j;
			}
		}
		if(i < end) QuickSort(i, end);
		if(j > begin) QuickSort(begin, j);
	}

	public static int binary_Search(int begin, int end){
		if(begin <= end){
			int middle = (begin + end)/2;
			if(searchValue == array[middle]){ 
				return middle;
			} else if(array[middle] < searchValue){
				return binary_Search(middle + 1, end);
			} else if(array[middle] > searchValue){
				return binary_Search(begin, middle - 1);	
			}
		}
		return -1;
	}
}