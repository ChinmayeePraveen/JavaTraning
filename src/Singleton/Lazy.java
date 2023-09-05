package Singleton;

public class Lazy {
    public static void main(String[] args) {
        Ex1 obj = Ex1.method();
    }
}
class Ex1 {
    static Ex1 o;
    private Ex1(){
        System.out.println("Instance created");
    }
    static Ex1 method()
    {
        if (o==null) {
            o = new Ex1();
        }
        return o;
    }
}
