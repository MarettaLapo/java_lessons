public class Chess {
    private int x;
    private int y;


    //Пустой конструктор
    public Chess() {
    }

    //Конструктор с параметрами
    public Chess(int x, int y) {
        if(x < 0 || x > 7 || y < 0 || y > 7){
            throw new IllegalArgumentException("Координаты от 0 до 7 включительно");
        }
        this.x = x;
        this.y = y;
    }

    //Геттеры
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }

    //Сеттеры
    public void setX(int x) {
        if(x < 0 || x > 7){
            throw new IllegalArgumentException("Координаты от 0 до 7 включительно");
        }
        this.x = x;
    }
    public void setY(int y) {
        if(x < 0 || x > 7){
            throw new IllegalArgumentException("Координаты от 0 до 7 включительно");
        }
        this.y = y;
    }
    public void setXY(int x, int y) {
        if(x < 0 || x > 7 || y < 0 || y > 7){
            throw new IllegalArgumentException("Координаты от 0 до 7 включительно");
        }
        this.x = x;
        this.y = y;
    }
    //Преобразование к строке
    @Override
    public String toString() {
        return Character.toString ((char) this.x + 97) + (this.y + 1);
    }
}
