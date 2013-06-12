package shapesExample.shapes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.mockito.Mockito;
//import org.mockito.internal.util.reflection.Whitebox;
//import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import shapesExample.drawingApi.DrawingAPI;

@RunWith(PowerMockRunner.class)
public class RectangleShapeTest {

    DrawingAPI mockDrawingApi;
    RectangleShape rectangleShape;

    @Before
    public void setup() {
       mockDrawingApi  = PowerMockito.mock(DrawingAPI.class);

    }

    @Test
    public void testDraw() throws Exception {

        rectangleShape = new RectangleShape(1,2,3,4,mockDrawingApi);

        rectangleShape.draw();

        Mockito.verify(mockDrawingApi, Mockito.times(1)).drawRectangle(1,2,3,4);

    }

    @Test
    public void testResizeByPercentage() throws Exception {
        rectangleShape = new RectangleShape(1,2,3,4,mockDrawingApi);

        rectangleShape.resizeByPercentage(2);

        double height = Whitebox.getInternalState(rectangleShape, "height");
        double width = Whitebox.getInternalState(rectangleShape, "width");
        Assert.assertEquals(6,height,0.1);
        Assert.assertEquals(8,width,0.1);

    }
}
