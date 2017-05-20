import musicians.Guitarist;
import musicians.Rocker;
import musicians.Singer;

/**
 * Created by ingrid on 14/05/17.
 */
public class Band {
    private Guitarist guitarPlayer;
    private Singer singer;

    public Band() {
        this.guitarPlayer = new Rocker();
        this.singer = new Singer();
        singer.setVoiceDecibel(70);
    }

    public void playSomething(){
        guitarPlayer.play();
    }

}
