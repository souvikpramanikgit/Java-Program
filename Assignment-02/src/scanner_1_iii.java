import java.util.Scanner;
public class scanner_1_iii {
    public static void main(String args[]){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();

            int c = a + b;
            System.out.println("The sum is:" + c);
        }
        catch (Exception e){
            System.out.println("Error occured");
        }
    }
}