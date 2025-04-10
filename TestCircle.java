public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);

        System.out.println("Радіус: " + c.getRadius());            // 5.0
        System.out.println("Площа: " + c.getArea());              // ~78.54
        System.out.println("Довжина кола: " + c.getCircumference()); // ~31.42

        c.setRadius(10.0);
        System.out.println("Новий радіус: " + c.getRadius());     // 10.0

        c.scale(0.5);
        System.out.println("Після масштабування: " + c.getRadius()); // 5.0
    }
}
