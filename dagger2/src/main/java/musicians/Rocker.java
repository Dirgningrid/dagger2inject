package musicians;

import instruments.ElectricGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class Rocker implements Guitarist, Singer {

    private long decibel;
    private ElectricGuitar guitar;

    public Rocker(ElectricGuitar guitar){
        this.guitar = guitar;
    }

    public Rocker(long decibel){
        this.decibel = decibel;
    }

    @Override
    public void play() {
        guitar.genere();
    }

    @Override
    public void voiceDecibel() {

    }
}
