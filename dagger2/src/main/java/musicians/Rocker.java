package musicians;

import instruments.ElectricGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class Rocker implements Guitarist {
    private ElectricGuitar guitar;

    public Rocker(){
        guitar = new ElectricGuitar();
    }

    @Override
    public void play() {
        guitar.genere();
    }
}
