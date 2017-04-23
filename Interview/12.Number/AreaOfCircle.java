import java.util.Scanner;
public Class AreaOfCirle{ 
 
public static void main(String args[]) {
 
int radius = 0;
Scanner in= new Scanner(System.in);
System.out.println("Please enter radius of a circle");
 
    radius=in.nextInt();
     
/*
 * where r is a radius of a circle then Area of a circle is
 *Area= pi * r * r
 *
 */
         
    double area=Math.PI* radius * radius;
      
    System.out.println("Area of the circle ="+area);
 
}
}
