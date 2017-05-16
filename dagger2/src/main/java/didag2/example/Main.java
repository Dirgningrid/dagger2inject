package didag2.example;

import didag2.example.dagger.BandComponent;
import didag2.example.dagger.DaggerBandComponent;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.*;

/**
 * Created by ingrid on 14/05/17.
 */
public class Main {

    public static void main(String[] args) {

        BandComponent component =
                DaggerBandComponent
                .builder()
                .build();


        component.injectBand().playSomething();
    }
}
