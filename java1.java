public class java1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 5);
        Triangle triangle = new Triangle(5, 5, 5);
        Cone cone = new Cone(5, 5);
    }
}

class Circle {
    double r;
    Circle(double r){
        this.r = r;
        System.out.println("Area of the circle is: " + calculateArea());
    }
    double calculateArea(){
        return Math.PI * r * r; 
    }
}

class Square {
    double s;
    Square(double s){
        this.s = s;
        System.out.println("Area of the square is: " + calculateArea());
    }
    double calculateArea(){
        return s * s; 
    }
}

class Rectangle {
    double l, b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
        System.out.println("Area of the rectangle is: " + calculateArea());
    }
    double calculateArea(){
        return l * b; 
    }
}

class Triangle {
    double a, b, c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Area of the triangle is: " + calculateArea());
    }
    double calculateArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Cone {
    double h, r;  
    Cone(double h, double r){
        this.h = h;
        this.r = r;
        System.out.println("Surface area of the cone is: " + calculateArea());
    }
    double calculateArea(){
        double l = Math.sqrt((r * r) + (h * h));
        return Math.PI * r * (r + l);
    }
}
