import java.util.Scanner;
import java.util.Random;

public class Main {
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

        QuickSort(0, arr.length - 1);

        System.out.print("\nSorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void QuickSort(int begin, int end){
        int i = begin;
        int j = end;
        int key = arr[(begin + end)/2];
        
        while(i <= j){
            while(arr[i] < key) ++i;
            while(arr[j] > key) --j;
            
            if(i <= j){
                int value = arr[i];
                arr[i] = arr[j];
                arr[j] = value;
                ++i; --j;
            }
        }
        if (i < end) QuickSort(i, end);
        if (j > begin) QuickSort(begin, j);
    }
}
