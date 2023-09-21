// import java.util.*;
public class strings{

    
    public static void main(String[] args) {
        String s= "harsh";
        String s2= new  String("Yadav");
        
        int len=s.length();
        System.out.println(len);
        

        String lower=s2.toLowerCase();
        System.out.println(lower);

        String upper=s.toUpperCase();
        System.out.println(upper);

        String subs=s.substring(2);
        System.out.println(subs);

        String rep=s.replace('h','g');
        System.out.println(rep);

        char charat=s.charAt(3);
        System.out.println(charat);

        boolean equal=s.equals("harsh");
        System.out.println(equal);
        
        boolean equal2=s.equalsIgnoreCase("hArSh");
        System.out.println(equal2);
    }
}