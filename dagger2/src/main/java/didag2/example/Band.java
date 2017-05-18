package didag2.example;

import didag2.example.musicians.Guitarist;

import didag2.example.musicians.Drummer;
import didag2.example.musicians.Singer;

/**
 * Created by ingrid on 14/05/17.
 */
public class Band {

    private Guitarist guitarPlayer;
    private Singer singer;
    private Drummer drummer;

    public Band(Guitarist guitarist, Singer singer, Drummer drummer) {
        this.guitarPlayer = guitarist;
        this.singer = singer;
        this.drummer = drummer;
    }

    public String playSomething(boolean isRock) {

        String guitarSound = guitarPlayer.playGuitar();
        String drummerBeat = drummer.letsGetBeat();
        String song = singer.singingSomething(isRock);

        return song + guitarSound + drummerBeat;
    }
}
