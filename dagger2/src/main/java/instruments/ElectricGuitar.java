package instruments;

/**
 * Created by ingrid on 14/05/17.
 */
public class ElectricGuitar implements Instrument{

    private String gunsNRoses = "November Rain";

    @Override
    public void genere() {
        System.out.println(gunsNRoses);
    }
}
