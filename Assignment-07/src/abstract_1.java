abstract class myclass{
    abstract void calculate(double x);
}
class sub1 extends myclass{
    void calculate(double x){
        System.out.println("Square= "+(x*x));
    }
}
class sub2 extends myclass{
    void calculate(double x){
        System.out.println("Square root= "+Math.sqrt(x));
    }
}
class sub3 extends myclass{
    void calculate(double x){
        System.out.println("Cube= "+(x*x*x));
    }
}
class abstract_1{
    public static void main(String args[]){
        sub1 obj1=new sub1();
        sub2 obj2=new sub2();
        sub3 obj3=new sub3();
        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(2);
    }
}