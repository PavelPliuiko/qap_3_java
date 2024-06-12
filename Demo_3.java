public class Demo_3 {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 2, 1, 1);
        System.out.println("Point 1: " + point1.toString());

        MovablePoint point2 = new MovablePoint(3, 4);
        System.out.println("Point 2: " + point2.toString());

        point1.move();
        System.out.println("Point 1 after move: " + point1.toString());

        point2.move();
        System.out.println("Point 2 after move: " + point2.toString());
    }
}