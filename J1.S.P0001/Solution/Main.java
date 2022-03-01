import java.util.Random;
import java.util.Scanner;

class Main {

    public static int arrLength;
    public static int[] array;

    public static void main(String[] args) {

        user_Input();
        display_And_Sort();

    }

    public static void user_Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        arrLength = sc.nextInt();
        sc.close();
    }

    public static void display_And_Sort() {
        // Random and display unsorted array
        array = new int[arrLength];
        Random ran = new Random();

        System.out.print("Unsorted array: ");
        for (int i = 0; i < array.length; ++i) {
            array[i] = ran.nextInt(arrLength);
            System.out.print(array[i] + " ");
        }

        // Sort
        for (int i = 0; i < array.length; ++i) {
            boolean haveSwap = false;
            for (int j = 0; j < array.length - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                    haveSwap = true;
                }
            }
            if (haveSwap == false) {
                break;
            }
        }

        // Display sorted array
        System.out.print("\nSorted array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}