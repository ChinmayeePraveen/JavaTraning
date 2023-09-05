package Exceptions;

public class EXception1 {
    public  int div(int a , int b) throws ArithmeticException{
        System.out.println("From div metod");
        return  a/b;
    }
    public static void main(String[] args) {
        EXception1 ex1 = new EXception1();


            try {
                ex1.div(10, 0);
            }
            catch (ArithmeticException e){
                System.out.println("Exception handled" +e);
            }
        throw new ArithmeticException("The Arthemetic Exception is caught");

    }
}
