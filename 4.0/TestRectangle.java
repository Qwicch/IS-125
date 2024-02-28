public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(24.45, 33.65);
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("-".repeat(30));
        System.out.printf("rectangle:     getWidth(): %.2f%n", rectangle.getWidth());
        System.out.printf("rectangle:    getHeight(): %.2f%n", rectangle.getHeight());
        System.out.printf("rectangle:      getArea(): %.2f%n", rectangle.getArea());
        System.out.printf("rectangle: getPerimeter(): %.2f%n", rectangle.getPerimeter());

        System.out.println("-".repeat(30) + "\n");

        System.out.println("-".repeat(30));
        System.out.printf("rectangle1:     getWidth(): %.2f%n", rectangle1.getWidth());
        System.out.printf("rectangle1:    getHeight(): %.2f%n", rectangle1.getHeight());
        System.out.printf("rectangle1:      getArea(): %.2f%n", rectangle1.getArea());
        System.out.printf("rectangle1: getPerimeter(): %.2f%n", rectangle1.getPerimeter());
        System.out.println("-".repeat(30) + "\n");

        System.out.println("-".repeat(30));
        System.out.printf("rectangle2:     getWidth(): %.2f%n", rectangle2.getWidth());
        System.out.printf("rectangle2:    getHeight(): %.2f%n", rectangle2.getHeight());
        System.out.printf("rectangle2:      getArea(): %.2f%n", rectangle2.getArea());
        System.out.printf("rectangle2: getPerimeter(): %.2f%n", rectangle2.getPerimeter());
        System.out.println("-".repeat(30) + "\n");

    }
}
