package Conditional_Statments;

public class IfCondition {
    public void validation(int i){
        if(i != 0)
        {
            System.out.println("Its inside if condition ");
        }
        else
        {
            System.out.println("Its inside else condition");
        }
    }

    public static void main(String[] args) {
        IfCondition ic = new IfCondition();
        ic.validation(2);
    }
}
