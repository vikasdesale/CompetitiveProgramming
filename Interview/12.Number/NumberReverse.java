public class NumberReverse {
 
    public static int reverseNumber(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
     
    public static void main(String a[]){
        System.out.println("Result: "+reverseNumber(23458));
    }
}
