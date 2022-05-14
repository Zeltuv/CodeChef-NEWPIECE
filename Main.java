import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int testAmount = scanner.nextInt();

        for (int i = 0; i < testAmount; i++) {
            int fromX = scanner.nextInt();
            int fromY = scanner.nextInt();

            int toX = scanner.nextInt();
            int toY = scanner.nextInt();

            int currentColor = (fromX + fromY) % 2 == 0 ? 0 : 1;
            int newColor = (toX + toY) % 2 == 0 ? 0 : 1;

            if (fromX == toX && fromY == toY) {
                System.out.println(0);
                continue;
            }

            if (currentColor != newColor) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }

        }
    }

}
