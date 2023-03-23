import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Songs song1 = new Songs("some name", "some one");
        Songs song2 = new Songs("another name", "another one");

        USB usb = new USB(song1, song2);
        Vinyl vinyl = new Vinyl(song1);

        Player player = new Player("usb-флешка");
        System.out.println(player.play(usb));
        System.out.println(player.play(vinyl));
    }
}