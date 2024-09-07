//Write a program to take input from user to print name and age & compare the age by creating objects and methods in two different classes.

public class students_5 {
    int age;
    String name;
    students_5(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" , "+age);
    }
    public static void main(String args[]){
        students_5 s1=new students_5("Souvik",20);
        students_5 s2=new students_5("Soumyadeep",21);
        s1.display();
        s2.display();
        if(s1.age>s2.age){
            System.out.println(s1.name+"'s age is higher than "+s2.name);
        }
        else{
            System.out.println(s2.name+"'s age is higher than "+s1.name);
        }
    }
}
