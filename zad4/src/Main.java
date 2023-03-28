import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //проверка на наличие аргумента
        if(args.length == 0){
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            //чтение строк из файла
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(" ");
            }
        } catch (IOException e) {
            System.out.println("Cannot open or read file");;
        }
        //преобразование в массив через сплит по пробелам
        String[] arr = sb.toString().split(" +");
        System.out.println(arr.length);
    }
}