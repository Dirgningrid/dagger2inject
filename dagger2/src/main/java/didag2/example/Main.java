package didag2.example;

import didag2.example.instruments.AcusticGuitar;
import didag2.example.instruments.Drums;
import didag2.example.musicians.*;
import musicians.*;

/**
 * Created by ingrid on 14/05/17.
 */
public class Main {

    public static void main(String[] args) {

        DepositoGiordani depositoGiordani;

        Singer singer = new Singer();
        singer.setDecibel(75);

        Drummer drummer = new PopDrummer(new Drums());

        Guitarist guitarist = new PopGuitarist(new AcusticGuitar());

        Band band = new Band(guitarist, singer, drummer);

        depositoGiordani = new DepositoGiordani(band);

        String show = depositoGiordani.hiresPopBand();

        System.out.println(show);

    }
}
