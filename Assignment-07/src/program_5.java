interface shape1 {
    int square();
}

interface color {
    String getColor();
}
class value implements shape1, color {
    int side;
    String color;
    value(int s, String c) {
        side = s;
        color = c;
    }
    public int square() {
        return (side*side);
    }
    public String getColor() {
        return color;
    }
}
public class program_5 {
    public static void main(String[] args) {
        value c = new value(5, "red");
        System.out.println("Area of circle: " + c.square());
        System.out.println("Color of circle: " + c.getColor());
    }
}