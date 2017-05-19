package didag2.example;

import javax.inject.Inject;

/**
 * Created by ingrid on 17/05/17.
 */
public class DepositoGiordani {

    private Band band;

    @Inject
    public DepositoGiordani(Band band) {
        this.band = band;
    }

    public String hiresRockBand(){
        return band.playSomething(true);
    }

    public String hiresPopBand(){
        return band.playSomething(false);
    }
}
