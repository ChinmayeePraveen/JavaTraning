package Conditional_Statments;

public class Loops {
    public void print(int cond){
        for(int i = 0 ;i< cond ;cond--){
            System.out.println("multiple times" +i);
        }
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.print(4);
    }
}
