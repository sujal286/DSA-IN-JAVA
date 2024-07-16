import java.util.*;
public class Strings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s="My favourite team is Mumbai Indians in ipl";
        String p=" and I love watching Rohit Sharma";
        //All methods of string
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.concat(p));
        System.out.println(s.replace("Indians","Indian"));
        System.out.println(s.charAt(7));
        System.out.println(s.contains("is"));
        System.out.println(s.substring(0,17));
        System.out.println(s.isEmpty());
        System.out.println(s.equals(p));
        System.out.println(s.intern());
        System.out.println(s.indexOf("Mumbai"));
    }
}
