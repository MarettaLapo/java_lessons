import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            throw new IllegalArgumentException();
        }
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(" ");
            }
            String[] arr = sb.toString().split(" +");
            System.out.println(arr.length);
        } catch (IOException e) {
            System.out.println("Cannot open or read file");;
        }

    }
}