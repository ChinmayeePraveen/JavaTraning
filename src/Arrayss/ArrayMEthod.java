package Arrayss;

public class ArrayMEthod {
    static void min(int a[])
    {
      int  min1 = a[0];
      for (int i=1;i<a.length;i++)

         if (min1 > a[i])
             min1 = a[i];
          System.out.println(min1);


    }

    public static void main(String[] args) {
        int arr[] = {5,8,9,1,2};
        min(arr);
    }
}
