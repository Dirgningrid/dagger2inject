package didag2.example;

import javax.inject.Inject;

/**
 * Created by ingrid on 17/05/17.
 */
public class DepositoGiordani {

    @Inject
    public DepositoGiordani(Band band) {
        //todo
        System.out.println(band.playSomething());

    }

    private Band band;

    public DepositoGiordani(Band band){
        this.band = band;
    }

    public void hiresRockBand(){
        band.playSomething(true);
    }

    public String hiresPopBand(){
        return band.playSomething(false);
    }
}
