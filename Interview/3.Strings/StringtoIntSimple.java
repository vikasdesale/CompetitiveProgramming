public class StringtoIntSimple {
    
    
    public static void main (String args[])
    {
        String  convertingString="123456";
        System.out.println("String Before Conversion :  "+ convertingString);
        int output=    getNumber( convertingString );
        System.out.println("");
        System.out.println("");
        System.out.println("int value as output "+ output);
        System.out.println("");
    }
    

public static int getNumber(String number) {
    int result = 0;
    for (int i = 0; i < number.length(); i++) {
        result = result * 10 + number.charAt(i) - '0';
    }
    return result;
}

}