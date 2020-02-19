import java.util.Map;

public class RockBandNew implements Performer{
    public RockBandNew(){}
    public void perform(){
        for (String key: instruments.keySet()){
            System.out.println(key+ " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
