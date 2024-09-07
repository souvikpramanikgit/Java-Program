import java.util.Scanner;

public class factorial_2 {
    public static void main(String args[]){
        int a;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            a = sc.nextInt();
            System.out.println("The factorial of " + a + " is: " + fact(a));
        }
        catch (Exception e){
            System.out.println("Error occured");
        }
    }
    static int fact(int n){
        int i,f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}