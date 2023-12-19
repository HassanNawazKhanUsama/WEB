import java.util.Scanner;

public class lab4e3 {
    public static void main(String[] args) {
         System.out.println("hassan nawaz khan");
System.out.println("21_ARID_717");
System.out.println("\nreplace()"); 
StringBuffer sb=new StringBuffer ("hello");
 sb.replace(1, 3, "el");
  System.out.println(sb);
System.out.println("\nappend()"); 
StringBuffer s=new StringBuffer ();
 System.out.println(s.capacity()); 
 s.append("Hello");
  System.out.println(s.capacity());
   s.append("java is my favourite language"); 
   System.out.println(s.capacity());
System.out.println("\ninsert()"); 
StringBuffer b=new StringBuffer ("hello ");
b.insert(1,"JAVA");
System.out.println(b);
 }
}
