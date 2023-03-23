//Звуковоспроизводящие устройства
public abstract class SoundDevices implements Playable{
    //носители, которые могут проигрываться
    private String[] media;

    public SoundDevices(String... media) {
        this.media = media;
    }

    public String[] getMedia() {
        return media;
    }

    public void setMedia(String[] media) {
        this.media = media;
    }

    //Проверка на воспроизводимость носителя
    @Override
    public String play(Media media) {
        for(String item : this.media){
            if(item.equalsIgnoreCase(media.mediaName())){
                String string = "Носитель - " + media.mediaName() + "\n";
                for(Songs song : media.getSongs()){
                    string = string + song.toString() + "\n";
                }
                return string;
            }
        }
        return "Устройство не может выводить музыку с " + media.mediaName();
    }
}
