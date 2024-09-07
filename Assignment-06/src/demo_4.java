class area{
    int length;
    int breadth;
    area(int l,int b){
        length=l;
        breadth=b;
    }
    void showarea(){
        System.out.println("Area= "+(length*breadth));
    }
}
class volume extends area{
    int height;
    volume(int l,int b,int h){
        super(l,b);
        height=h;
    }
    void showvalue(){
        System.out.println("Volume= "+(length*breadth*height));
    }
}

class demo_4 {
    public static void main(String args[]){
        area ob1=new area(10,20);
        volume ob2=new volume(10,20,30);
        ob1.showarea();
        ob2.showvalue();
    }
}
