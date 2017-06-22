import java.io.*;
public class TestSplit {

   public static void main(String args[]) {
      String Str = new String("Welcome-to-India");
      System.out.println("Return Value :" );      
      
      for (String retval: Str.split("-")) {
         System.out.println(retval);
      }
   }
}