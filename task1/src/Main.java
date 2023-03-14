public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            //числа кратны и 3, и 5
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //числа кратны только 3
            if(i % 3 == 0){
                System.out.println("Fizz");
            } else {
                //числа кратны только 5
                if(i % 5 == 0){
                    System.out.println("Buzz");
                } else { //вывод для остальных
                    System.out.println(i);
                }
            }
        }
    }
}