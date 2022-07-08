package Constructor;

public class Triangle {
    //sides of triangles
    int a = 3, b = 4, c = 5;
    int sum = a + b + c;
    int difference = a - b - c;

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("This is sum of traingle " + triangle.sum);
        System.out.println("This is differene of triangle"+ triangle.difference);
    }
}
