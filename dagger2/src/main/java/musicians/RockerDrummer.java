package musicians;

import instruments.Drums;

/**
 * Created by ingrid on 17/05/17.
 */
public class RockerDrummer {

    private Drums drums;

    public RockerDrummer(){
        this.drums = new Drums();
    }

    public void letsGetBeat(int plates, int basses) {
        drums.setNumBass(basses);
        drums.setNumPlates(plates);
        drums.letsBeat();
    }
}
