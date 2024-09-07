//Find the area of a square, rectangle and triangle using method overloading.

import java.util.Scanner;

public class area_2 {
    public static void main(String args[]){
        int s;
        int a,b;
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("1.Square \n2.Rectangle \n3.Triangle ");
            System.out.println("\nChoose any option(1-3): ");
            s=sc.nextInt();
            switch(s) {
                case 1:
                    System.out.println("Enter the length of the side: ");
                    a = sc.nextInt();
                    System.out.println("Area of a square: " + area(a, a));
                    break;
                case 2:
                    System.out.println("Enter length: ");
                    a = sc.nextInt();
                    System.out.println("Enter breadth: ");
                    b = sc.nextInt();
                    System.out.println("Area of a rectangle: " + area(a, b));
                    break;
                case 3:
                    System.out.println("Enter a: ");
                    float base = sc.nextFloat();
                    System.out.println("Enter b: ");
                    float height = sc.nextFloat();
                    System.out.println("Area of a triangle: " + area(base, height,true));
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
        catch(Exception e){
            System.out.println("Error occured");
        }
    }
    static float area(int x,int y){
        return (float) x*y;
    }
    static float area(float b,float h,boolean istriangle){
        return (float)0.5*b*h;
    }
}
