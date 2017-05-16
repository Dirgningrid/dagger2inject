package didag2.example.musicians;

import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class Rocker implements Guitarist, Drummer {

    private ElectricGuitar guitar;
    private Drums drums;

    public Rocker(ElectricGuitar guitar){
        this.guitar = guitar;
    }

    public Rocker(Drums drums){
        this.drums = drums;
    }

    @Override
    public void playGuitar() {
        guitar.choose();
    }


    @Override
    public void letsGetBeat(int plates, int basses) {
        drums.setNumBass(basses);
        drums.setNumPlates(plates);
        drums.letsBeat();
    }
}
