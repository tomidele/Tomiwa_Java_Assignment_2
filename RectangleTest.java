public class RectangleTest {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Display default values
        System.out.println("Default length: " + rectangle.getLength());
        System.out.println("Default width: " + rectangle.getWidth());

        // Test setting valid length and width
        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        // Display updated values
        System.out.println("Updated length: " + rectangle.getLength());
        System.out.println("Updated width: " + rectangle.getWidth());

        // Test calculating perimeter and area
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        // Test setting invalid length and width
        rectangle.setLength(25.0); // Out of range
        rectangle.setWidth(-2.0);  // Out of range

        // Display values after invalid settings
        System.out.println("Length after invalid setting: " + rectangle.getLength());
        System.out.println("Width after invalid setting: " + rectangle.getWidth());
    }
}
