public class USB extends Media{
    public USB(Songs... songs) {
        super(songs);
    }

    @Override
    public String mediaName() {
        return "Usb-флешка";
    }
}
