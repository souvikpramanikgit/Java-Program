import java.util.Scanner;

class arrstudent_5 {
    private String name;
    void input(String y){
        name=y;
    }
    void show(){
        System.out.println("Name= "+name);
    }
    public static void main(String args[]){
        arrstudent_5 obj[]=new arrstudent_5[5];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<obj.length;i++){
            obj[i]=new arrstudent_5();
            System.out.println("Enter name: ");
            obj[i].input(sc.next());
        }
        for(i=0;i<obj.length;i++){
            obj[i].show();
        }
    }
}