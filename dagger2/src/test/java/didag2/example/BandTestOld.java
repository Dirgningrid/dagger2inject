package didag2.example;

import didag2.example.dagger.BandComponentTest;
import didag2.example.dagger.DaggerBandComponentTest;
import didag2.example.musicians.RockerDrummer;
import didag2.example.musicians.RockerGuitarist;
import didag2.example.musicians.Singer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
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
        RockerGuitarist guitarist = Mockito.mock(RockerGuitarist.class);
        RockerDrummer drummer = Mockito.mock(RockerDrummer.class);
        Singer singer = Mockito.mock(Singer.class);

        Band band = new Band(guitarist, singer, drummer);

        when(guitarist.playGuitar()).thenReturn("and I'm Slash, ");
        when(singer.singingSomething(true)).thenReturn("I'm Axl Rose ");
        when(drummer.letsGetBeat()).thenReturn("now, Let's Rock!");

        assertEquals("I'm Axl Rose and I'm Slash, now, Let's Rock!",
                band.playSomething(true));
    }
}