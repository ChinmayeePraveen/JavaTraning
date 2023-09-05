package Ass2;

import Ass.Additon;

public class main extends Additon {
    private  int c = 10;
    private int d=20;
    protected  int e = 30;
            protected int f =40;


    public static void main(String[] args) {
        main ob1 = new main();
     int res=    ob1.add(2,3);
        System.out.println("Additon of 2 numbers " +res);
    int res2=     ob1.add(ob1.e,ob1.f);
        System.out.println("Additon of 2 numbers " +res2);
        int res3 = ob1.add(ob1.c,ob1.d);
        System.out.println("Additon of 2 numbers " +res3);


    }
}




