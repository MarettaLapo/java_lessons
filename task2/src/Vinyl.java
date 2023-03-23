public class Vinyl extends Media{
    public Vinyl(Songs... songs) {
        super(songs);
    }

    @Override
    public String mediaName() {
        return "Виниловая пластинка";
    }
}
