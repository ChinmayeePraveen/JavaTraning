package Conditional_Statments;

public class IfElseIf {
    public void VoteEligiblity(int i) {


        if (i == 18) {
            System.out.println("USer is eligible for voting");
        } else if (i <18) {
            System.out.println("Please wait till you are 18 years old");
        }else {
            System.out.println("Invalid age");
        }
    }

    public static void main(String[] args) {
        IfElseIf ife = new IfElseIf();
        ife.VoteEligiblity(200000);
    }
}