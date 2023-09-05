package Stringss;

public class Strings {
    public static void main(String[] args) {


        String s = "    dEllo     ";
        System.out.println(s.concat("Java"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(2));
        System.out.println(s.compareTo("Dello"));
        System.out.println(s.compareToIgnoreCase("hello"));
        System.out.println(s.indexOf("o"));
        System.out.println(s.replace("H","o"));
        System.out.println(s.trim());
        System.out.println(s.substring(1,2));
        System.out.println(s.subSequence(1,2));
        String s1 = s.substring(1,2);
        // String s2 = s.subSequence(1,2);
        System.out.println(s.replace("l" , "p"));
        System.out.println(s.replaceAll("dEllo" ,"ddd"));
       // System.out.println(s.split("e"));
        System.out.println(s.toCharArray());
        System.out.println(s.join("HEkko"));

    }

}