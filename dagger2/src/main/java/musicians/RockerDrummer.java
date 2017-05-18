package musicians;

import instruments.Drums;

/**
 * Created by ingrid on 17/05/17.
 */
public class RockerDrummer implements Drummer{

    private Drums drums;

    public RockerDrummer(Drums drums){
        this.drums = drums;
    }

    @Override
    public void letsGetBeat(int plates, int basses) {
        drums.setNumBass(basses);
        drums.setNumPlates(plates);
        drums.letsBeat();
    }
}
