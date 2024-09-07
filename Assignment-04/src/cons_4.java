public class cons_4 {
    int id;
    String name;
    cons_4(int i, String n){
        id=i;
        name=n;
    }
    cons_4(cons_4 s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        cons_4 s1=new cons_4(115,"john");
        cons_4 s2=new cons_4(s1);
        s1.display();
        s2.display();
    }
}
