import instruments.AcusticGuitar;
import instruments.Drums;
import musicians.PopDrummer;
import musicians.PopGuitarist;
import musicians.Singer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.when;

/**
 * Created by ingrid on 18/05/17.
 */
public class BandTest {

    Band band;

    PopGuitarist guitarist;
    PopDrummer drummer;
    Singer singer;

    AcusticGuitar guitar;
    Drums drums;

    @Before
    public void setUp(){

        band = Mockito.mock(Band.class);

        guitarist = Mockito.mock(PopGuitarist.class);
        drummer = Mockito.mock(PopDrummer.class);
        singer = Mockito.mock(Singer.class);

        guitar = Mockito.mock(AcusticGuitar.class);
        drums = Mockito.mock(Drums.class);

    }

    @Test
    public void testPlaySomething() throws Exception {

        when(singer.singingSomething(false)).thenReturn("I'm Madonnan\n");

        when(band.playSomething(true)).thenReturn(contains("Axl"));

        when(drums.letsBeat(true)).thenReturn(contains("Rock"));
    }
}