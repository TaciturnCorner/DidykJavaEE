public class Slayer implements Song {
    private static String[] LINES = {
            "Trapped in purgatory",
            "A lifeless object, alive",
            "Awaiting reprisal",
            "Death will be their acquiescence",
            "The sky is turning red",
            "Return to power draws near",
            "Fall into me, the sky's crimson tears",
            "Abolish the rules made of stone",
            "Pierced from below, souls of my treacherous past",
            "Betrayed by many, now ornaments dripping above",
            "Awaiting the hour of reprisal",
            "Your time slips away",
            "Raining blood",
            "From a lacerated sky",
            "Bleeding its horror",
            "Creating my structure now I shall reign in blood"};

    public Slayer(){}

    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
