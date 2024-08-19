//import stuff here!

//Your code here
import java.util.Scanner;
 public class Program6{
     public static void main(String[] args){
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = scanner.nextDouble();
        double diameter = radius*2;
        double area = PI*(radius*radius);
        double circumference = PI*diameter;
        System.out.println("\n The radius is: " + radius);
        System.out.println("\n The diameter is: " + diameter);
        System.out.println("\n The area is: " + area);
        System.out.println("\n The circumference is: " + circumference);
    
    }
}

//Paste console output below:
/*
Enter a radius:
3.712

 The radius is: 3.712

 The diameter is: 7.424

 The area is: 43.28779268096

 The circumference is: 23.32316416

*/
