package didag2.example.instruments;

/**
 * Created by ingrid on 14/05/17.
 */
public class ElectricGuitar implements Guitar {

    private String gunsNRoses = "November Rain\n";

    @Override
    public String chooses() {
        return gunsNRoses;
    }
}
