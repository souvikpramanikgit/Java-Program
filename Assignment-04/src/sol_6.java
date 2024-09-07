class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Student change(Student s) {
        s.id = 105;
        s.name = "James";
        return s;
    }
    void display(){
        System.out.println("Id= "+id+" , Name: "+name);
    }
}

class sol_6 {
    public static void main(String args[]) {

        Student s1 = new Student(115,"John");
        s1.display();
        Student s2 = new Student(0,null);
        s2=s2.change(s1);
        s2.display();
    }

}