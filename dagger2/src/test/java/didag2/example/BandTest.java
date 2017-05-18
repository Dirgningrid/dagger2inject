package didag2.example;

import didag2.example.Band;
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
public class BandTest {

    PopGuitarist guitarist;
    PopDrummer drummer;
    Singer singer;

    @Before
    public void setUp(){
        guitarist = Mockito.mock(PopGuitarist.class);
        drummer = Mockito.mock(PopDrummer.class);
        singer = Mockito.mock(Singer.class);
    }

    @Test
    public void testPlaySomething() throws Exception {

        Band band = new Band(guitarist, singer, drummer);

        when(guitarist.playGuitar()).thenReturn("B");
        when(singer.singingSomething(true)).thenReturn("A");
        when(drummer.letsGetBeat()).thenReturn("C");

        assertEquals("ABC", band.playSomething(true));
    }
}