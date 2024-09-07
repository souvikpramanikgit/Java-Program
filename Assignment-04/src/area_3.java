class square {
    int side;
    square(int s) {
        side = s;
    }
    int area() {
        return side * side;
    }
}

class rectangle {
    int length;
    int width;
    rectangle(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
}

class triangle {
    int base;
    int height;
    triangle(int b, int h) {
        base = b;
        height = h;
    }
    double area() {
        return (0.5 * base * height);
    }
}

class area_3{

    public static void main(String args[]){
        square a1=new square(2);
        rectangle a2=new rectangle(2,6);
        triangle a3=new triangle(2,7);
        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(a3.area());
    }
}
