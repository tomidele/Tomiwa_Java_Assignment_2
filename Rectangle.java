public class Rectangle {
    private double length;
    private double width;

    // Constructor with default values
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // Getter and setter methods for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (isValidNumber(length)) {
            this.length = length;
        }
    }

    // Getter and setter methods for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (isValidNumber(width)) {
            this.width = width;
        }
    }

    // Method to check if a number is valid (larger than 0.0 and less than 20.0)
    private boolean isValidNumber(double number) {
        if (number > 0.0 && number < 20.0) {
            return true;
        } else {
            System.out.println("Invalid input. Please enter a floating-point number larger than 0.0 and less than 20.0.");
            return false;
        }
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}
