class HIT {
    public void address() {
        System.out.println("HIT Address");
    }
    public void students() {
        System.out.println("Number of students: 100");
    }
}
class CSE extends HIT {
    public void lab() {
        System.out.println("CSE Lab");
    }
}

class ECE extends HIT {
    public void lab() {
        System.out.println("ECE Lab");
    }
}

class Main {
    public static void main(String[] args) {
        CSE cse = new CSE();
        cse.students();
        cse.lab();

        ECE ece = new ECE();
        ece.students();
        ece.lab();
    }
}