package Exceptions;

public class NullPointer {

        public static void main (String[] args)
        {

            String str = null;


            try
            {
             int i=   str.length();
                System.out.println("Length of string " +i);
//                if (str.equals("gfg"))
//                    System.out.print("Same");
//                else
//                    System.out.print("Not Same");
            }
            catch(NullPointerException e)
            {
                System.out.print("NullPointerException Caught");
            }
        }
    }

