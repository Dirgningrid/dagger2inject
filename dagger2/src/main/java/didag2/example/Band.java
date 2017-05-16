package didag2.example;

import didag2.example.musicians.Drummer;
import didag2.example.musicians.Guitarist;
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

    public void playSomething(){

        if(guitarPlayer != null){
            guitarPlayer.playGuitar();
        }

        if(singer != null){
            singer.singingSomething();
        }

        if(drummer != null){
            drummer.letsGetBeat(8, 2);
        }

    }

}
