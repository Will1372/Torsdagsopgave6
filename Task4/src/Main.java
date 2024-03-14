public class Main {
    public static void main(String[] args) {
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(new Circle(1.0));
        shapeBuilder.addShape(new Square(5.2));

        double totalArea = shapeBuilder.getTotalArea();
        System.out.println("Total area of shapes: " + totalArea);
    }
}