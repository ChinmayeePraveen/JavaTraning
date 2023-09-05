package Arrayss;

public class Sorting {



    public static void main(String[] args) {

       // int [] a={2,9,-1,-9};
        int[] un_sorted_array1 = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");
//sorting logic
        for (int i = 0; i < un_sorted_array1.length; i++)
        {
            for (int j = i + 1; j < un_sorted_array1.length; j++)
            {
                int tmp = 0;
                if (un_sorted_array1[i] > un_sorted_array1[j])
                {
                    tmp = un_sorted_array1[i];
                    un_sorted_array1[i] = un_sorted_array1[j];
                    un_sorted_array1[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(un_sorted_array1[i]);
        }
    }
}