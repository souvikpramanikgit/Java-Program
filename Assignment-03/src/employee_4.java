//Write a program to enter name salary of two employees and show whose salary is higher. Use proper user defined methods.

public class employee_4 {
    int salary;
    String name;
    employee_4(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println(name+" , "+salary);
    }
    public static void main(String args[]){
        employee_4 e1=new employee_4("Souvik",30000);
        employee_4 e2=new employee_4("Soumyadeep",25000);
        e1.display();
        e2.display();
        if(e1.salary>e2.salary){
            System.out.println("Salary of "+e1.name+" is higher than "+e2.name);
        }
        else{
            System.out.println("Salary of "+e2.name+" is higher than "+e1.name);
        }
    }
}
