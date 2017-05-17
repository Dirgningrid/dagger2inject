package musicians;

import instruments.ElectricGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class RockerGuitarist {
    private ElectricGuitar guitar;

    public RockerGuitarist(){
        guitar = new ElectricGuitar();
    }

    public void play() {
        guitar.genere();
    }
}
