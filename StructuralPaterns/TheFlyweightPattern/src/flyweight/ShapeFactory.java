package flyweight;

import java.util.HashMap;
import java.util.Map;

//This class is responsible for managing the pool of flyweight objects.
//It provides a way to retrieve flyweight objects and create new ones
// if they don't exist already
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a new circle of color: " + color);
        }

        return circle;
    }
}
