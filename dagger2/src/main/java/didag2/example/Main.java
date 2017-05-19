package didag2.example;

import didag2.example.dagger.DaggerPopBandComponent;
import didag2.example.dagger.DaggerRockBandComponent;
import didag2.example.dagger.PopBandComponent;
import didag2.example.dagger.RockBandComponent;

/**
 * Created by ingrid on 14/05/17.
 */
public class Main {

    public static void main(String[] args) {

        String weWillRockYou;
        String weWillPopYou;

        RockBandComponent rockComponent =
                DaggerRockBandComponent
                .builder()
                .build();

        PopBandComponent popComponent =
                DaggerPopBandComponent
                .builder()
                .build();

        DepositoGiordani rock = rockComponent.injectDeposito();

        weWillRockYou = rock.hiresRockBand();
        System.out.println(weWillRockYou);


        DepositoGiordani pop = popComponent.injectDeposito();

        weWillPopYou = pop.hiresPopBand();
        System.out.println(weWillPopYou);


    }
}
