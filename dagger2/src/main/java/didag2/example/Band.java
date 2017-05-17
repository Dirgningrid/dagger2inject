package didag2.example;

import didag2.example.musicians.Drummer;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;

import javax.inject.Inject;

/**
 * Created by ingrid on 14/05/17.
 */
public class Band {
    private Guitarist guitarPlayer;
    private Singer singer;
    private Drummer drummer;

    @Inject
    public Band(Guitarist guitarist, Singer singer, Drummer drummer) {
        this.guitarPlayer = guitarist;
        this.singer = singer;
        this.drummer = drummer;
    }

    public String playSomething(){

        String specialSong = "";

        if(guitarPlayer != null){
            specialSong += guitarPlayer.playGuitar();
        }

        if(singer != null){
            specialSong += "\n";
            specialSong += singer.singingSomething();
        }

        if(drummer != null){
            specialSong += "\n";
            specialSong += drummer.letsGetBeat(8, 2);
        }

        return specialSong;
    }

}
