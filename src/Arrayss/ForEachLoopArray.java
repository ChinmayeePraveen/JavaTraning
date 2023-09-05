package Arrayss;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] myArray = {10,20,30,40};
        int index = 0;


       for (int j : myArray){
              //  System.out.println(i);
           myArray[index] = j+12;
           index++;
           System.out.println(myArray);
//
            }
        }

    }

