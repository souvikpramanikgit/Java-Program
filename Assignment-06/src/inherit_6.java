class Animal {
    String name;
    Animal(String n) {
        name = n;
        System.out.println("Animal constructor called");
    }
}
class Dog extends Animal {
    int age;

    Dog(String n, int a) {
        super(n);
        age = a;
        System.out.println("Dog constructor called");
    }
}

class inherit_6 {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", 5);
    }
}
