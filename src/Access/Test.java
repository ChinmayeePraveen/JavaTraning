package Access;

import Another.Test2;

public class Test {
   public int i = 50;
   protected void add()
   {
       System.out.println("Additon on 2 number ");
   }
    public static void main(String[] args) {
        System.out.println("This is access modifiers ");
        Test t = new Test();
        System.out.println(t.i);



    }
}
