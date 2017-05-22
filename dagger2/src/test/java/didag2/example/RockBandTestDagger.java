package didag2.example;

import didag2.example.dagger.BandComponentTest;
import didag2.example.dagger.DaggerBandComponentTest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ingrid on 19/05/17.
 */
public class RockBandTestDagger {

    @Before
    public void setUp(){

    }

    @Test
    public void playSomething(){
        BandComponentTest component =
                DaggerBandComponentTest
                        .builder()
                        .build();

        Band band = component.injectBand();

        assertEquals("I'm Anthony Kiedis I'm John Frusciante now, let's funky rock pop whenever!", band.playSomething(true));
    }

}
