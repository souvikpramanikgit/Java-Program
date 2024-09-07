import java.util.Scanner;
class largest_3 {
    public static void main(String args[]) {
        int i, n;
        try {
            System.out.println("Enter the size: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int largest = a[0], smallest = a[0];
            //largest and smallest with the value of a[0] before you have read in any values for the array.
            // This means that both largest and smallest will be initialized to 0,
            // which will cause your program to output 0 as both the largest and smallest numbers.
            //To fix this issue, you should initialize largest and smallest after you have read in the values for the array.
            for (i = 1; i < a.length; i++) {
                if (a[i] > largest)
                    largest = a[i];
                else if (a[i] < smallest)
                    smallest = a[i];
            }
            System.out.println("Largest Number is : " + largest);
            System.out.println("Smallest Number is : " + smallest);
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}