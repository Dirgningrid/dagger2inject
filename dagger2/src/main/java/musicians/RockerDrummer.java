package musicians;

import instruments.Drums;

/**
 * Created by ingrid on 17/05/17.
 */
public class RockerDrummer implements Drummer{

    private Drums drums;

    public RockerDrummer(Drums drums){
        this.drums = drums;
        drums.setNumBass(2);
        drums.setNumPlates(8);
    }

    @Override
    public String letsGetBeat() {
        return drums.letsBeat(true);
    }
}
