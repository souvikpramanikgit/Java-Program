import java.util.Scanner;
class matrix_trans_7 {
    public static void main(String args[]){
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        r=sc.nextInt();
        System.out.println("Enter the column size: ");
        c=sc.nextInt();
        int matr[][]=new int[r][c];
        System.out.println("Enter the elements of matrix: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                matr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is: ");
        int tra[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                tra[i][j]=matr[j][i];
                System.out.print(" "+tra[i][j]);
            }
            System.out.println("\n");
        }
    }
}
