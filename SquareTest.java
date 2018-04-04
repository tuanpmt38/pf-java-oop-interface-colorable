public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
//        System.out.println(square);
        //square.howTocolor();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square(4.5, "green", true);
        shapes[2] = new Square(3.5, "red", false);
        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i]);
            if (shapes[i].isFilled()) {
                square.howTocolor();
            } else {
                System.out.println();
            }
        }
    }
}
