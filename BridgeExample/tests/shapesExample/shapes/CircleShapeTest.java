package shapesExample.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;
import shapesExample.drawingApi.DrawingAPI;

public class CircleShapeTest {

    DrawingAPI mockDrawingApi;
    CircleShape circleShape;

    @Before
    public void setup() {
        mockDrawingApi  = PowerMockito.mock(DrawingAPI.class);

    }

    @Test
    public void testDraw() throws Exception {

        circleShape = new CircleShape(1,2,3,mockDrawingApi);

        circleShape.draw();

        Mockito.verify(mockDrawingApi, Mockito.times(1)).drawCircle(1,2,3);

    }

    @Test
    public void testResizeByPercentage() throws Exception {
        circleShape = new CircleShape(1,2,3,mockDrawingApi);

        circleShape.resizeByPercentage(2);

        double radius = Whitebox.getInternalState(circleShape, "radius");
        Assert.assertEquals(6, radius, 0.1);

    }
}
