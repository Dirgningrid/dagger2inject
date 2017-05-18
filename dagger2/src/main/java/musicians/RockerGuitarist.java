package musicians;

import instruments.Drums;
import instruments.ElectricGuitar;

/**
 * Created by ingrid on 14/05/17.
 */

public class RockerGuitarist implements Guitarist {

    private ElectricGuitar guitar;

    public RockerGuitarist(ElectricGuitar guitar){
        this.guitar = guitar;
    }

    @Override
    public void playGuitar() {
        guitar.choose();
    }

}
