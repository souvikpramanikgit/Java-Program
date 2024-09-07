class complex {
    int a, b;
    complex(int a, int b) {
        this.a = a;
        this.b = b;
    }
    static complex add(complex c1, complex c2) {
        complex temp=new complex(c1.a + c2.a,c1.b + c2.b);
        return temp;
    }
}
class addition_1 {
    public static void main(String args[]) {

        complex n1 = new complex(5, 3);
        complex n2 = new complex(3, 4);
        complex temp = complex.add(n1, n2);

        System.out.println("Sum of two complex numbers is: "+ temp.a +" + "+ temp.b +"i");
    }
}