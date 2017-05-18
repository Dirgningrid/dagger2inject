package didag2.example.musicians;

import didag2.example.instruments.AcusticGuitar;
import didag2.example.instruments.Guitar;

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
