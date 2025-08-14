// Triangle.java
public class Triangle {
    private int x;
    private int y;
    private int z;

    public Triangle() {
        x = 5;
        y = 3;
        z = 1;
    }

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void showInfo() {
        System.out.println("Side 1: " + x);
        System.out.println("Side 2: " + y);
        System.out.println("Side 3: " + z);
    }

    public void testTriangle() {
        if (x == y && y == z) {
            System.out.println("Equilateral triangle");
        } else if (x == y || y == z || x == z) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
