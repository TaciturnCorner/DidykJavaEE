public class Vocalist extends Guitarist {
    private Song song;
    public Vocalist(Song song){
        super();
        this.song = song;
    }
    public Vocalist(int beanBags, Song song){
        super(beanBags);
        this.song = song;
    }
    public void perform(){
        super.perform();
        System.out.println("While reciting ...");
        song.recite();
    }
}
