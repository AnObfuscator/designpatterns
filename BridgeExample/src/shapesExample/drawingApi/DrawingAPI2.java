package shapesExample.drawingApi;

public class DrawingAPI2 implements DrawingAPI {

    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
    }

    @Override
    public void drawRectangle(double x, double y, double height, double width) {
        System.out.printf("API1.rectangle at %f:%f height: %f width: %f\n", x, y, height, width);
    }

}
