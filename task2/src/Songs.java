//Песни
public class Songs {

    private String name;
    private String author;


    public Songs(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Испольнитель - " + this.author + ": песня - " + this.name;
    }
}
