import flyweight.Circle;
import flyweight.ShapeFactory;

public class Main {

    /*
    The Flyweight pattern is a structural design pattern used to minimize
    memory usage and improve performance when dealing with large numbers
    of objects with shared states

    It achieves this by sharing the common state among multiple objects
    rather than duplicating it for each instance

    The pattern is particularly useful when the application needs to create
    a large number of similar objects and memory consumption is a concern
     */



    private static final String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(10);
            circle.draw();
        }
    }

    //Generating a random color from the "colors" array
    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}