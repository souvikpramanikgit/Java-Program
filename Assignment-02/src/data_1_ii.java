import java.io.*;

public class data_1_ii {
    public static void main(String args[]){
        int a,b,c;
        try {
            DataInputStream pr = new DataInputStream(System.in);
            System.out.println("Enter the first number: ");
            a = Integer.parseInt(pr.readLine());
            System.out.println("Enter the second number: ");
            b = Integer.parseInt(pr.readLine());

            c=a+b;
            System.out.println("The addition is:" +c);
        }
        catch(Exception e){
            System.out.println("Error occured");
        }
    }
}
