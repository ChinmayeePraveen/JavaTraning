package Arrayss;
import java.util.Arrays;
public class SortMethod {




        public static void main(String[] args) {
            int[] numbers = { 5, 2, 9, 1, 5, 6 };

            System.out.println("Original array: " + Arrays.toString(numbers));

            // Using Arrays.sort() to sort the array
            Arrays.sort(numbers);

            System.out.println("Sorted array: " + Arrays.toString(numbers));
        }
    }

