package Static_Keyword;

public class Example_Static {
    int a , b;

    public void nonStatic(){
        System.out.println("Its non static class");
        Example_Static.staticMethod();
    }

    public static void staticMethod(){
        System.out.println("Its  static class");
         int x =10;
        //cannot call nonStatic method nonStatic();
    }

    public static void main(String[] args) {
        System.out.println("MAin method");
        Example_Static.staticMethod();
    }
}
