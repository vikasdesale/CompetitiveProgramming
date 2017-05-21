public class SwapTwoNumbers {
 
public static void main(String[] args) {
 
int number1=2;
int number2=4;
 
System.out.println("Before Swapping");
System.out.println("Value of number1 is :" + number1);
System.out.println("Value of number2 is :" +number2); 
 
number1=number1^number2;
number2=number1^number2;
number1=number1^number2;
 
System.out.println("After Swapping");
System.out.println("Value of number1 is :" + number1);
System.out.println("Value of number2 is :" +number2);
 
}
}