import java.util.Random;

public class Problem_9_9 {
    private static int id;

    /** Main method */
    public static void main(String[] args) {

        // Create three RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        Random random = new Random();

        printInfo(polygon1);
        printInfo(polygon2);
        printInfo(polygon3);

    }

    public static void printInfo(RegularPolygon polygon) {
        System.out.println("\n" + "-".repeat(51));
        System.out.println("| Regular Polygon Objects  |  Perimeter  |  Area  |");
        System.out.println("-".repeat(50));
        System.out.printf( "|       Polygon# %d         |%8.2f     |%6.2f  |\n",
                id++ ,polygon.getPerimeter(), polygon.getArea());
        System.out.println("-".repeat(51));
    }

}
