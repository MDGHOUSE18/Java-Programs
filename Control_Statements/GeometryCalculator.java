package Control_Statements;

public class GeometryCalculator {
    public static final double PI = Math.PI;

    public static void main(String[] args) {
        // Testing some methods
        int radius = 5;
        int base = 6;
        int height = 8;
        int length = 10;
        int width = 4;
        int side = 7;
        int d1 = 9;
        int d2 = 12;

        System.out.println("Area of Circle with radius " + radius + ": " + areaOfCircle(radius));
        System.out.println("Area of Triangle with base " + base + " and height " + height + ": " + areaOfTriangle(base, height));
        System.out.println("Area of Rectangle with length " + length + " and width " + width + ": " + areaOfRectangle(length, width));
        System.out.println("Area of Rhombus with diagonal d1=" + d1 + " and d2=" + d2 + ": " + areaOfRhombus(d1, d2));
        System.out.println("Perimeter of Circle with radius " + radius + ": " + perimeterOfCircle(radius));
        System.out.println("Perimeter of Rectangle with length " + length + " and width " + width + ": " + perimeterOfRectangle(length, width));
        System.out.println("Perimeter of Square with side " + side + ": " + perimeterOfSquare(side));
        System.out.println("Volume of Cone with radius " + radius + " and height " + height + ": " + volumeOfCone(radius, height));
        System.out.println("Volume of Prism with base " + base + " and height " + height + ": " + volumeOfPrism(base, height));
        System.out.println("Volume of Cylinder with radius " + radius + " and height " + height + ": " + volumeOfCylinder(radius, height));
        System.out.println("Volume of Sphere with radius " + radius + ": " + volumeOfSphere(radius));
        System.out.println("Volume of Pyramid with base " + base + " and height " + height + ": " + volumeOfPyramid(base, height));
        System.out.println("Curved Surface Area of Cylinder with radius " + radius + " and height " + height + ": " + curvedSurfaceAreaofCylinder(radius, height));
        System.out.println("Total Surface Area of Cube with side " + side + ": " + totalSurfaceAreaofCube(side));
    }
    // Area of Circle
    public static double areaOfCircle(int radius) {
        return PI * radius * radius;
    }

    // Area of Triangle
    public static double areaOfTriangle(int base, int height) {
        return 0.5 * base * height;
    }

    // Area of Rectangle
    public static double areaOfRectangle(int length, int width) {
        return length * width;
    }

    // Area of Isosceles Triangle
    public static double areaOfIsoscelesTriangle(int base, int height) {
        return 0.5 * base * height;
    }

    // Area of Parallelogram
    public static double areaOfParallelogram(int base, int height) {
        return base * height;
    }

    // Area of Rhombus
    public static double areaOfRhombus(int d1, int d2) {
        return 0.5 * d1 * d2;
    }

    // Area of Equilateral Triangle
    public static double areaOfEquilateralTriangle(int side) {
        return 0.25 * Math.sqrt(3) * side * side;
    }

    // Perimeter of Circle
    public static double perimeterOfCircle(int radius) {
        return 2 * PI * radius;
    }

    // Perimeter of Equilateral Triangle
    public static double perimeterOfEquilateralTriangle(int side) {
        return 3 * side;
    }

    // Perimeter of Parallelogram
    public static double perimeterOfParallelogram(int base, int side) {
        return 2 * (base + side);
    }

    // Perimeter of Rectangle
    public static double perimeterOfRectangle(int length, int width) {
        return 2 * (length + width);
    }

    // Perimeter of Square
    public static double perimeterOfSquare(int side) {
        return 4 * side;
    }

    // Perimeter of Rhombus
    public static double perimeterOfRhombus(int side) {
        return 4 * side;
    }

    // Volume of Cone
    public static double volumeOfCone(int radius, int height) {
        return (PI * radius * radius * height) / 3;
    }

    // Volume of Prism
    public static double volumeOfPrism(int base, int height) {
        return base * height;
    }

    // Volume of Cylinder
    public static double volumeOfCylinder(int radius, int height) {
        return PI * radius * radius * height;
    }

    // Volume of Sphere
    public static double volumeOfSphere(int radius) {
        return (4 * PI * radius * radius * radius) / 3;
    }

    // Volume of Pyramid
    public static double volumeOfPyramid(int base, int height) {
        return (base * height) / 3;
    }

    // Curved Surface Area of Cylinder
    public static double curvedSurfaceAreaofCylinder(int radius, int height) {
        return 2 * PI * radius * height;
    }

    // Total Surface Area of Cube
    public static double totalSurfaceAreaofCube(int side) {
        return 6 * side * side;
    }
}

