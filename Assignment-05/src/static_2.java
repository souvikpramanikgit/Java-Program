class Student{
    String name;
    int roll;
    static String college ="HIT";
    Student(String n,int r){
        name = n;
        roll = r;
    }
    void display (){
        System.out.println(name+" "+roll+" "+college);
    }
}
class static_2{
    public static void main(String args[]){
        Student s1 = new Student("John",15);
        Student s2 = new Student("Jim",27);
        s1.display();
        s2.display();
    }
}
