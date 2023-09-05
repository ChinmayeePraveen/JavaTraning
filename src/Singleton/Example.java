package Singleton;

public class Example {
    public static void main(String[] args) {
       // ABC obj1 = new ABC(); // this allows user to create only 1 instance of a class
        ABC obj2 = ABC.SingeltonClass();
    }

}
class  ABC{
    static  ABC  obj = new ABC(); //eagerly instance creation
    private ABC()
    {

    }
    public static ABC SingeltonClass()
    {
        return obj;
    }

}