package didag2.example;

import javax.inject.Inject;

/**
 * Created by ingrid on 17/05/17.
 */
public class RockTown {

    @Inject
    public RockTown(Band band) {
        //todo
        System.out.println(band.playSomething());

    }

}
