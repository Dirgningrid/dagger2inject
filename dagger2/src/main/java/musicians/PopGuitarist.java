package musicians;

import instruments.AcusticGuitar;
import instruments.Guitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class PopGuitarist implements Guitarist {

    private Guitar guitar;

    public PopGuitarist(AcusticGuitar guitar){
        this.guitar = guitar;
    }

    @Override
    public String playGuitar() {
        return guitar.chooses();
    }

}
