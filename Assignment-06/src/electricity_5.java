import java.util.Scanner;

public class electricity_5 {

    public static void main(String[] args) {
        int bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of units: ");
        int unit=sc.nextInt();

        System.out.println("Domestic User=>");
        if(unit<=100){
            bill=unit*5;
            System.out.println("Bill: "+bill);
        }
        else if(unit<=300){
            bill=(100*5) + (unit-100)*6;
            System.out.println("Bill: "+bill);
        }
        else{
            bill=(100*5) + (200*6) + (unit-300)*7;
            System.out.println("Bill: "+bill);
        }

        System.out.println("Commercial Users=>");
        if(unit<=100){
            bill=unit*6;
            System.out.println("Bill: "+bill);
        }
        else if(unit<=300){
            bill=(100*6) + (unit-100)*7;
            System.out.println("Bill: "+bill);
        }
        else{
            bill=(100*6) +(200*7)+(unit-300)*8;
            System.out.println("Bill: "+bill);
        }
    }

}

//    For domestic users:
//    Up to 100 units: Rs. 5 per unit
//    101 to 300 units: Rs. 6 per unit
//    Above 300 units: Rs. 7 per unit

//    For commercial users:
//    Up to 100 units: Rs. 6 per unit
//    101 to 300 units: Rs. 7 per unit
//    Above 300 units: Rs. 8 per unit