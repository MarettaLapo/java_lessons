public class Chess {
    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        if(x < 1 || x > 8){
            throw new IllegalArgumentException("Можно ввести число от 1 до 8 включительно");
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        if(x < 1 || x > 8){
            throw new IllegalArgumentException("Можно ввести число от 1 до 8 включительно");
        }
        this.y = y;
    }
}
