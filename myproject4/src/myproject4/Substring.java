package myproject4;
import java.util.*;

public class Substring{

public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   System.out.println("enter string");
  String S = in.nextLine();
   int start = in.nextInt();
   int end = in.nextInt();
   
   System.out.println(S.substring(start,end)+" ");
}


}


