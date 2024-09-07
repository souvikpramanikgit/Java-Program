import java.util.Scanner;
class search_5 {
    public static void main(String args[]){
        int i,j,k,n;
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size: ");
            n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements of the array: ");
            for(i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the element you want to find: ");
            k=sc.nextInt();
            for(i=0;i<n;i++){
                if(a[i]==k){
                    System.out.println("The element is available in "+i+"th index.");
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Error occured");
        }
    }
}
