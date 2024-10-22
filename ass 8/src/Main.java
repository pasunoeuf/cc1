public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();


        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);


        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);


        drawing.calculateAreas();
    }
}
