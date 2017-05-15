import musicians.Classical;
import musicians.Guitarist;
import musicians.Rocker;
import musicians.Singer;

/**
 * Created by ingrid on 14/05/17.
 */
public class Band {
    private Guitarist guitarPlayer;
    private Singer singer;

    public Band(Guitarist guitarist, Singer singer) {
        this.guitarPlayer = guitarist;
        this.singer = singer;
    }

    public void playSomething(){
        guitarPlayer.play();
    }

}
