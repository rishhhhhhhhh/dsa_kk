package advancedjava;
class QuadSides {
    QuadSides(int s1) {
        System.out.println("This is a square of side " + s1);
    }

    QuadSides(int s1, int s2) {
        System.out.println("This is a rectangle of sides " + s1 + " and " + s2);
    }

    QuadSides(int s1, int s2, int s3, int s4) {
        System.out.println("This is a quadrilateral of sides " + s1 + ", " + s2 + ", " + s3 + " ,and " + s4);
    }
}

class QuestionThreeConstructorOverloading {
    public static void main(String[] args) {
        QuadSides q1 = new QuadSides(15);
        QuadSides q2 = new QuadSides(52, 10);
        QuadSides q3 = new QuadSides(51, 22, 73, 4);
    }
}