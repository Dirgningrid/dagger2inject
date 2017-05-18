package didag2.example;

import didag2.example.dagger.BandComponent;
import didag2.example.dagger.DaggerBandComponent;

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

        DepositoGiordani rt = component.injectRockTown();


    }
}
