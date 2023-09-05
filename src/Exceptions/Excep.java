package Exceptions;

public class Excep {
    public int  div(int a , int b){

     try{
         return a/b;
     }
     catch (ArithmeticException e1){
         System.out.println("Error " +e1);
         return b/a;
     }

    }

    public static void main(String[] args) {
        Excep e = new Excep();
        e.div(10,0);
    }
}
