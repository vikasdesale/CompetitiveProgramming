public class StringtoInt {
    
    
    public static void main (String args[])
    {
        String  convertingString="123456";
        System.out.println("String Before Conversion :  "+ convertingString);
        int output=    strToInt( convertingString );
        System.out.println("");
        System.out.println("");
        System.out.println("int value as output "+ output);
        System.out.println("");
    }
    

public static int strToInt (String s) {
    int i = 0; 
    int num = 0;
    int len = str.length();
    boolean isNegative = false;
    char[] str = s.toCharArray();
 
    if (str[0] == '-') {
        isNegative = true;
        i = 1;
    }
 
    while (i < len) {
        num *= 10;
        num += (str[i++] - '0');
    }
 
    if (isNegative) { 
        num *= -1; 
    }
 
    return num;
}

}