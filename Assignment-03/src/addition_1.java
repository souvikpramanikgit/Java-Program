//Write a program Write a program to add two integers, three integers and two floating point numbers using method overloading.

import java.util.Scanner;
class addition_1 {
    public static void main(String args[]) {
        String a=" ",b=" ",c=" ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs(2 or 3): ");
        int n=sc.nextInt();
        if(n==2){
            try{
                System.out.println("Enter a: ");
                a= sc.next();
                System.out.println("Enter b: ");
                b= sc.next();
            }
            catch (Exception e){
                System.out.println("Error occured");
            }
            try{
                System.out.println("Sum of two numbers: "+sum(Integer.parseInt(a),Integer.parseInt(b)));
            }
            catch (Exception e){
                System.out.println("Sum of two numbers: "+sum(Float.parseFloat(a),Float.parseFloat(b)));
            }
        }
        if(n==3){
            try{
                System.out.println("Enter a: ");
                a= sc.next();
                System.out.println("Enter b: ");
                b= sc.next();
                System.out.println("Enter c: ");
                c= sc.next();
            }
            catch (Exception e){
                System.out.println("Error occured");
            }
            try{
                System.out.println("Sum of three numbers: "+sum(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c)));
            }
            catch (Exception e){
                System.out.println("Error occured");
            }
        }
    }
    static int sum(int a,int b){
        return a+b;
    }
    static float sum(float a,float b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }
}