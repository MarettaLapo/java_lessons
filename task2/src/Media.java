//Носители
public abstract class Media {
    private Songs[] songs;

    public Media(Songs... songs) {
        this.songs = songs;
    }

    public Songs[] getSongs() {
        return songs;
    }

    public void setSongs(Songs[] songs) {
        this.songs = songs;
    }

    public abstract String mediaName();
}
