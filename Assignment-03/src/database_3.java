//Create a database for 3 students. Use proper OOP approach.

public class database_3 {
    private String name;
    private int roll;
    private int age;
    database_3(String name,int roll,int age){
        this.name=name;
        this.roll=roll;
        this.age=age;

    }
    String getname(){
        return name;
    }
    int getroll(){
        return roll;
    }
    int getage(){
        return age;
    }
    void display(){
        System.out.println("Name: "+name+",Roll: "+roll+",Age: "+age);
    }
    public static void main(String args[]){
        database_3 d1=new database_3("Souvik",163,20);
        database_3 d2=new database_3("Srinjoy",164,20);
        database_3 d3=new database_3("Shivam",146,21);
        d1.display();
        d2.display();
        d3.display();
    }
}
