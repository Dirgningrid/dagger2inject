package didag2.example;

/**
 * Created by ingrid on 17/05/17.
 */
public class DepositoGiordani {

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
