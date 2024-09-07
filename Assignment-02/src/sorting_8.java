import java.util.Scanner;
class sorting_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("Enter size: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array: ");
        for(i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.print("\n");
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for(i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
}
