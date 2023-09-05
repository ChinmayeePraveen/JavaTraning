 class Calculator {


    int a, b , result;

    public void perform(int a, int b){

    }

    public void displayResult(){
        System.out.println(result);
    }


}


class add extends Calculator{
    public void perform(int a, int b){
        result = a+b;
    }
}
class sub extends Calculator{
    public void perform(int a, int b){
        result = a-b;
    }
}
class mul extends Calculator{
    public void perform(int a, int b){
        result = a*b;
    }
}
class div extends Calculator{
    public void perform(int a, int b){
        result = a/b;
    }
}

public class Result{
    public static void main(String[] args) {
        add c = new add();
        c.perform(10,20);
        c.displayResult();
        sub s = new sub();
        s.perform(20,10);
        s.displayResult();
        mul m = new mul();
        m.perform(20,10);
        m.displayResult();
        div d = new div();
        d.perform(20,10);
        d.displayResult();
        System.out.println("enter requrired value" );

    }
}


