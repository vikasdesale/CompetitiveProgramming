public class CharSorting 
public static void main(String[] args) { 
 
   String original = "edcba";
 
  char[] chars = original.toCharArray();
 
  Arrays.sort(chars);
 
  String sorted = new String(chars);
  System.out.println(sorted);
} 

}