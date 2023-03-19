import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chess chess = new Chess();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x");
        int x = scanner.nextInt();
        chess.setX(x);
        System.out.println("Введите координату y");
        int y = scanner.nextInt();
        chess.setY(y);
        System.out.println("На шахматной доске: " + chess.toString());
    }
}