package didag2.example;

import javax.inject.Inject;

/**
 * Created by ingrid on 17/05/17.
 */
public class DepositoGiordani {

    @Inject
    public DepositoGiordani(Band band) {
        //todo
        System.out.println(band.playSomething());

    }

}
