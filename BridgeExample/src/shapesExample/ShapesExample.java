package shapesExample;

import shapesExample.drawingApi.DrawingAPI;
import shapesExample.drawingApi.DrawingAPI1;
import shapesExample.drawingApi.DrawingAPI2;
import shapesExample.shapes.CircleShape;
import shapesExample.shapes.RectangleShape;
import shapesExample.shapes.Shape;

public class ShapesExample {

    public static void main(String[] args) {

        DrawingAPI api1 = new DrawingAPI1();
        DrawingAPI api2 = new DrawingAPI2();

        Shape[] shapes = new Shape[] {
                new CircleShape(1, 2, 3, api1),
                new CircleShape(5, 7, 11, api2),
                new RectangleShape(1, 2, 3, 4, api1),
                new RectangleShape(0, 0, 5, 5, api2)
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }

}