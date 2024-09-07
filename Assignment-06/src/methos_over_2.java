class HIT {
    void address() {
        System.out.println("HIT Address");
    }
    void students() {
        System.out.println("Number of students: 100");
    }
}
class CSE extends HIT {
    void lab() {
        System.out.println("CSE Lab");
    }
}

class ECE extends HIT {
    void lab() {
        System.out.println("ECE Lab");
    }
}

class methods_over_2 {
    public static void main(String[] args) {
        CSE cse = new CSE();
        cse.students();
        cse.lab();

        ECE ece = new ECE();
        ece.students();
        ece.lab();
    }
}