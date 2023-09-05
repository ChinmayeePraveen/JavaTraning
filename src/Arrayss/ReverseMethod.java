package Arrayss;
import java.util.Arrays;
import java.util.Collections;
public class ReverseMethod {





        public static void main(String[] args) {
            Integer[] array = {1, 2, 3, 4, 5};

            System.out.println("Original array: " + Arrays.toString(array));

            // Convert array to a List and reverse it using Collections.reverse()
            Collections.reverse(Arrays.asList(array));

            System.out.println("Reversed array: " + Arrays.toString(array));
        }
    }

