package Arrayss;

public class MultiArray {
    public static void main(String[] args) {
        int un_sorted_array1[][] = new int[3][3];
        int un_sorted_array2[][] = {{1,2,3,4,5},{3,4,5,6,6}};
        int un_sorted_array3[][][] = {{{0,9,8},{2,5,3}},{{5,4,2}}};
//        System.out.println(arr2[0][1]);
//        System.out.println(arr2.length);
//        System.out.println(arr2[0].length);
        for (int i =0 ; i<un_sorted_array2.length;i++)
        for (int k = 0 ;k<un_sorted_array2[i].length ; k++){
            System.out.println(un_sorted_array2[i][k]);


        }
    }
}
