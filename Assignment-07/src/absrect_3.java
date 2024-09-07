abstract class calculate{
    abstract void area();
}
class square extends calculate{
    private int s;
    square(int s){
        this.s=s;
    }
    void area(){
        System.out.println("Square= "+(s*s));
    }
}
class rectangle extends calculate{

    private int l;
    private int b;
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("Rectangle= "+(l*b));
    }
}
class triangle extends calculate{
    private int b;
    private int h;
    triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    void area(){
        System.out.println("Triangle= "+(0.5*b*h));
    }
}
class absrect_3{
    public static void main(String args[]){
        square obj1=new square(5);
        rectangle obj2=new rectangle(5,7);
        triangle obj3=new triangle(4,8);
        obj1.area();
        obj2.area();
        obj3.area();
    }
}