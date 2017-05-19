package didag2.example;

import didag2.example.instruments.Guitar;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;

import javax.inject.Inject;

/**
 * Created by ingrid on 17/05/17.
 */
public class DepositoGiordani {

    private Band band;
    Singer singer; Guitarist guitar;

    @Inject
    public DepositoGiordani(Band band, Singer singer, Guitarist guitar) {
        this.band = band;
        this.singer = singer;
        this.guitar = guitar;
    }

    public String hiresRockBand(){
        return band.playSomething(true);
    }

    public String hiresPopBand(){
        return band.playSomething(false);
    }
}
