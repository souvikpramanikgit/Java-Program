import java.util.Scanner;

class gcd_10 {
    public static void main(String args[]){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("The first number is: ");
        n1=sc.nextInt();
        System.out.println("The second number is: ");
        n2=sc.nextInt();
        int g=gcd(n1,n2);
        System.out.println("The gcd value is: "+g);
    }
    static int gcd(int m,int n){
        if(n==0)
            return m;
        else
            return gcd(n,m % n);
    }
}
