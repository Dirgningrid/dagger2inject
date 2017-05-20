package didag2.example;

import didag2.example.dagger.DaggerPopBandComponent;
import didag2.example.dagger.DaggerRockBandComponent;
import didag2.example.dagger.PopBandComponent;
import didag2.example.dagger.RockBandComponent;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;

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

        Singer singer = rockComponent.injectSinger();
        Guitarist guitarist = rockComponent.injectGuitarist();
        //singer.singingSomething(true);
        System.out.printf(singer.toString());

        weWillRockYou = rock.hiresRockBand();
        System.out.println(weWillRockYou);


        DepositoGiordani pop = popComponent.injectDeposito();

        weWillPopYou = pop.hiresPopBand();
        System.out.println(weWillPopYou);


    }
}
