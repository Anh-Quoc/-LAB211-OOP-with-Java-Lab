import java.util.Scanner;
import java.util.Random;

class Main{

	public static int arrLength;
	public static int[] arr;

	public static void main(String[] args) {
		user_Input();
		display_And_Sort();
	}
	
	public static void user_Input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array: ");
		arrLength = sc.nextInt();
		sc.close();
	}

	public static void display_And_Sort(){
		Random ran = new Random();
		arr = new int[arrLength];
		System.out.print("Unsorted array: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = ran.nextInt(arrLength);
			System.out.print(arr[i] + " ");
		}

		MergeSort(arr, 0, arrLength - 1);
		System.out.print("\nSorted array: ");
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	public static void MergeSort(int[] array, int low, int hight){
		if(low < hight){
			int middle = low + (hight - low)/2;
			MergeSort(array, low, middle);
			MergeSort(array, middle + 1, hight);
			Merge(array, low, middle, hight);
		}
	}
	public static void Merge(int[] array, int low, int middle, int hight){
		int k = low;
		int n1 = middle - low + 1;
		int n2 = hight - middle;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for(int i = 0; i < n1; ++i){
			arr1[i] = array[low + i];
		}
		for(int i = 0; i < n2; ++i){
			arr2[i] = array[middle + 1 + i];
		}
		
		int i = 0;
		int j = 0;
		while(i < n1 && j < n2){
			array[k++] = (arr1[i] <= arr2[j]) ? arr1[i++] : arr2[j++];
		}

		while(i < n1){
			array[k++] = arr1[i++];
		}
		while (j < n2) {
			array[k++] = arr2[j++];
		}
	}
}
