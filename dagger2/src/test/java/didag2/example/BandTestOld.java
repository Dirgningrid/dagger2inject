package didag2.example;

import didag2.example.Band;
import didag2.example.dagger.DaggerRockBandComponent;
import didag2.example.dagger.RockBandComponent;
import didag2.example.dagger.RockBandComponentTest;
import didag2.example.musicians.PopDrummer;
import didag2.example.musicians.PopGuitarist;
import didag2.example.musicians.Singer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by ingrid on 18/05/17.
 */
public class BandTestOld {

    @Before
    public void setUp(){
    }

    @Test
    public void testPlaySomething() throws Exception {

//        BandComponentTest component =
//                DaggerBandComponentTest
//                        .builder()
//                        .build();
//
//        Band band = component.injectBand();
//        assertThat();
    }
}