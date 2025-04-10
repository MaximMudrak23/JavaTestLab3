import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testGetRadius() {
        Circle c = new Circle(5);
        assertEquals(5.0, c.getRadius(), 0.001);
    }

    @Test
    public void testSetRadius() {
        Circle c = new Circle(5);
        c.setRadius(10);
        assertEquals(10.0, c.getRadius(), 0.001);
    }

    @Test
    public void testGetArea() {
        Circle c = new Circle(2);
        assertEquals(Math.PI * 4, c.getArea(), 0.001);
    }

    @Test
    public void testGetCircumference() {
        Circle c = new Circle(3);
        assertEquals(2 * Math.PI * 3, c.getCircumference(), 0.001);
    }

    @Test
    public void testScale() {
        Circle c = new Circle(4);
        c.scale(2);
        assertEquals(8.0, c.getRadius(), 0.001);
    }
}