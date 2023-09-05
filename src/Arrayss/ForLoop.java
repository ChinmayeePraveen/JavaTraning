package Arrayss;

public class ForLoop {

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,};

        for (int i=0 ; i<arr.length ; i++){
         //   System.out.println(arr[i]);
            arr[i] = arr[i]+10;
            System.out.println(arr[i]);
        }
    }
}
