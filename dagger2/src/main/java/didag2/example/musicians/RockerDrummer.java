package didag2.example.musicians;

import didag2.example.instruments.Drums;

/**
 * Created by ingrid on 16/05/17.
 */
public class RockerDrummer implements Drummer {

    private Drums drums;

    public RockerDrummer(Drums drums){
        this.drums = drums;
    }

    @Override
    public String letsGetBeat(int plates, int basses) {
        drums.setNumBass(basses);
        drums.setNumPlates(plates);
        return drums.letsBeat();
    }
}
