package didag2.example.musicians;

import didag2.example.instruments.Drums;

/**
 * Created by ingrid on 18/05/17.
 */
public class PopDrummer implements Drummer {

    Drums drums;

    public PopDrummer(Drums drums){
        this.drums = drums;
        drums.setNumBass(1);
        drums.setNumPlates(5);
    }


    @Override
    public String letsGetBeat() {
        return drums.letsBeat(false);
    }
}
