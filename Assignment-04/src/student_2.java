public class student_2 {
    String name;
    int marks;

    student_2(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name + " and marks: " + marks + " \n");
    }

    public static void main(String args[]) {
        student_2 s1 = new student_2("Souvik", 85);
        student_2 s2 = new student_2("Shivam", 82);
        s1.display();
        s2.display();
        if (s1.marks > s2.marks) {
            System.out.println(s1.name + "'s mark is higher");
        } else {
            System.out.println(s2.name + "'s mark is higher");
        }
    }
}
