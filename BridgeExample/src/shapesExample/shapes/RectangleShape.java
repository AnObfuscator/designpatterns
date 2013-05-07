package shapesExample.shapes;

import shapesExample.drawingApi.DrawingAPI;

public class RectangleShape extends Shape {

    private double x, y, height, width;
    public RectangleShape(double x, double y, double height, double width, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;  this.y = y;  this.height = height; this.width = width;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(x, y, height, width);
    }

    @Override
    public void resizeByPercentage(double pct) {
        height *= pct;
        width *= pct;
    }
}
