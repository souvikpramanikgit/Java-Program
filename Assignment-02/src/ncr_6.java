import java.util.Scanner;

class ncr_6 {
    public static void main(String args[]) {
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        r = sc.nextInt();
        int res = (fact(n)) / ((fact(n - r)) * fact(r));
        System.out.println("The value of ncr is: "+res);
    }
    static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }
}
