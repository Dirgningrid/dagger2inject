package musicians;

import instruments.Drums;

/**
 * Created by ingrid on 18/05/17.
 */
public class PopDrummer implements Drummer {

    Drums drums;

    public PopDrummer(Drums drums){
        this.drums = drums;
    }


    @Override
    public void letsGetBeat(int plates, int basses) {
        drums.setNumBass(basses);
        drums.setNumPlates(plates);
        drums.letsBeat(false);
    }
}
