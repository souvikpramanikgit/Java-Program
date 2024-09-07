import java.util.Scanner;
class fibo_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value: ");
        n=sc.nextInt();
        int f=fibo(n);
        System.out.println("The fibbonaci value is: "+f);
    }
    static int fibo(int fi){
        if(fi<=1)
            return fi;
        else
            return fibo(fi-1)+fibo(fi-2);
    }
}
