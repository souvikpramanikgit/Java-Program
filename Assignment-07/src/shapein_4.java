interface Shape {
    abstract double volume();
}

class Sphere implements Shape {
    double r;
    Sphere(double r) {
        this.r = r;
    }
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(r,3);
    }
}

class Cone implements Shape {
    double r;
    double h;
    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }
    public double volume() {
        return (1.0/3.0) * Math.PI * Math.pow(r, 2) * h;
    }
}

public class shapein_4 {
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        Cone c = new Cone(5, 10);

        System.out.println("Volume of sphere: " + Math.round(s.volume()));
        System.out.println("Volume of cone: " + Math.round(c.volume()));
    }
}
