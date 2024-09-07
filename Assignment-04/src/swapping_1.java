class swapping_1 {
    int a,b;
    int temp;
    swapping_1(){
        a=8;
        b=6;
    }
    swapping_1(int num1, int num2){
        a=num1;
        b=num2;
    }
    void display(){
        System.out.println("The value of a is "+a+" and b is "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the value of a is "+a+" and b is "+b);
    }
    public static void main(String args[]){
        swapping_1 s1=new swapping_1();
        s1.display();
    }
}
