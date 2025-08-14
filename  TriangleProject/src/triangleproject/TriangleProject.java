package triangleproject;


public class triangleProje {
    public static void main(String[] args) {
        // Empty constructor দিয়ে object তৈরি
        Triangle t1 = new Triangle(); 
        t1.showInfo();
        t1.testTriangle();

        System.out.println();

        // Valued constructor দিয়ে object তৈরি
        Triangle t2 = new Triangle(5, 5, 5);
        t2.showInfo();
        t2.testTriangle();
    }
}
