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

        String weWillRockYou;

        BandComponent component =
                DaggerBandComponent
                .builder()
                .build();

        //Band band = component.injectBand();
        //weWillRockYou = band.playSomething();

        //System.out.println(weWillRockYou);

        RockTown rt = component.injectRockTown();


    }
}
