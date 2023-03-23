public class CD extends Media{
    public CD(Songs... songs) {
        super(songs);
    }

    @Override
    public String mediaName() {
        return "СД";
    }
}
