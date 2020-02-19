public class Guitarist implements Performer{
    private final int beanBags;
    public Guitarist(){
        this(3);
    }
    public Guitarist(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform() {
        System.out.println("JUGGLING "+beanBags + " GUITAR RIFFS");
    }
}
