package Another;

import Access.Test;
  class t2{
    private  void sub(){
        System.out.println("sub");
    }

    protected  void mul(){
        System.out.println("mult");
    }
     void div()
    {
        System.out.println("Division");
    }
    public  void simple()
    {
        System.out.println("simple");
    }
}

public class Test2 extends Test{
    public static void main(String[] args) {
        t2 t = new t2();
    //   t.sub(); // its private
        t.div(); // its default
        Test2 ob1 =  new Test2();
        System.out.println(ob1.i);
        ob1.add();  // its protected but still accescible as it's been extended


    }
}
