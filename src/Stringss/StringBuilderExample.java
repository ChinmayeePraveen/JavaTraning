package Stringss;

public class StringBuilderExample {

        public static void main(String[] args) {


            StringBuilder str = new StringBuilder("Hello Java");
            //Append method used to add string to the end
            str.append(" String");
            System.out.println(str);
            //	It is used to insert the specified string with this string at the specified position. The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc
            str.insert(0 , " Hai ");
            System.out.println(str);
            //It is used to replace the string from specified startIndex and endIndex.
            str.replace(0,4,"Welcome");
            System.out.println(str);
            //It is used to delete the string from specified startIndex and endIndex.
            str.delete(0,3);
            System.out.println(str);
            //	is used to reverse the string
            str.reverse();
            System.out.println(str);
            //It is used to return the current capacity.
            str.capacity();
            System.out.println(str);
            //It is used to return the character at the specified position
            System.out.println( str.charAt(2));
            //It is used to return the substring from the specified beginIndex.
            System.out.println(str.substring(0,3));
        }
    }

