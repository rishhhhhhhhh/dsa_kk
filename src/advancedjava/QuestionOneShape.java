package advancedjava;
class Shape {
    int length;
    int breadth;
    int height;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public int volume() {
        return this.length * this.breadth * this.height;
    }
}

class QuestionOneShape {
    public static void main(String[] args) {
        Shape s1 = new Shape(5, 3);
        System.out.println("The area is " + s1.area());
        System.out.println("The volume is " + s1.volume());
    }
}