class thiskey_3 {
    String n;
    int m;

    thiskey_3(String n, int m) {
        this.n = n;
        this.m = m;
    }

    void display() {
        System.out.println("Name: " + n + " and marks: " + m + " \n");
    }

    public static void main(String args[]) {
        thiskey_3 s1 = new thiskey_3("Souvik", 85);
        thiskey_3 s2 = new thiskey_3("Shivam", 82);
        s1.display();
        s2.display();
    }
}
