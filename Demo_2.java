public class Demo_2 {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);
        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0, "blue", true);
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0, "yellow", true);

        System.out.println(S.toString());
        System.out.println("Area of C: " + C.getArea());
        System.out.println("Perimeter of C: " + C.getPerimeter());
        System.out.println(C1.toString());
        System.out.println("Area of C1: " + C1.getArea());
        System.out.println("Perimeter of C1: " + C1.getPerimeter());
        System.out.println(R.toString());
        System.out.println("Area of R: " + R.getArea());
        System.out.println("Perimeter of R: " + R.getPerimeter());
        System.out.println(R1.toString());
        System.out.println("Area of R1: " + R1.getArea());
        System.out.println("Perimeter of R1: " + R1.getPerimeter());
        System.out.println(Sq.toString());
        System.out.println("Area of Sq: " + Sq.getArea());
        System.out.println("Perimeter of Sq: " + Sq.getPerimeter());
        System.out.println(Sq1.toString());
        System.out.println("Area of Sq1: " + Sq1.getArea());
        System.out.println("Perimeter of Sq1: " + Sq1.getPerimeter());
    }
}