package Ass3;

import Ass.Additon;
import Ass2.main;

public class Sta extends Additon {

    private static int c = 20;
    private  static int d=10;
    private  int e = 30;
    private int f =40;

   public  static int div(int k , int j){
return  k/j;
    }


    public static void main(String[] args) {
        Sta ob1 = new Sta();
        int res=    ob1.add(2,3);
        System.out.println("Additon of 2 numbers " +res);
        int res2=     ob1.add(ob1.e,ob1.f); //Accessing non - static member
        System.out.println("Additon of 2 numbers " +res2);
        int res3 = ob1.add(c,d); //Accessing static member
        System.out.println("Additon of 2 numbers " +res3);
        System.out.println(  Sta.div(c,d)); //Accessing static method
        Sta.div(2,5);



    }
}
