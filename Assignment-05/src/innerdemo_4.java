class demo{
    private int x=20;
    void show(){
        demo1 d1=new demo1();
        d1.display();
        System.out.println("Y= "+d1.y);
    }
    private class demo1{
        private int y=30;
        void display(){
            System.out.println("Hello");
            System.out.println("X= "+x);
        }
    }
}
class innerdemo_4{
    public static void main(String args[]){
        demo d=new demo();
        d.show();
    }
}