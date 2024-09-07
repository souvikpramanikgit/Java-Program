//1.Write a program to create Teacher class and enter data through keyboard. Create another class Student which extends Teacher class.
//Print te

import java.util.Scanner;

class teacher {
    String name;
    String subject;

    void input() {
        System.out.println("Teachers Details => ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
    }

    void t_value() {
        System.out.println("\n" + "Teachers Information");
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject + " \n");
    }
}

class student extends teacher{
    int roll;
    String course;
    void input() {
        super.input();
        System.out.println("Student's Details => ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rollno: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    void s_value() {
        super.t_value();
        System.out.println("Student's Information");
        System.out.println("Rollno: " + roll);
        System.out.println("Course: " + course);
    }
}

class demo_1 {
    public static void main(String args[]) {
        student s=new student();
        s.input();
        s.s_value();
    }
}
