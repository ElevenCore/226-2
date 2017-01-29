public class Video extends Datei {
    private String encoding;
    private Integer resolution;
    private Integer bitrate;

    public void play()
    {
        System.out.println("Here is your Video: " + name);
    }

}
