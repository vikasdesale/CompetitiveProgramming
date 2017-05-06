class IncrementDemo{
 
public static void main(String [] args){ 

    int a=20;
    a= a++ + ++a;
 
    System.out.println(a); //42
 
}
}