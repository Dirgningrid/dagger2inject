import musicians.RockerDrummer;
import musicians.RockerGuitarist;
import musicians.Singer;

/**
 * Created by ingrid on 14/05/17.
 */
public class Band {

    private RockerGuitarist guitarPlayer;
    private Singer singer;
    private RockerDrummer drummer;

    public Band() {
        this.guitarPlayer = new RockerGuitarist();
        this.singer = new Singer();
        singer.setVoiceDecibel(70);
        this.drummer = new RockerDrummer();
    }

    public void playSomething(){
        guitarPlayer.play();
        singer.singingSomething();
        drummer.letsGetBeat(8, 2);
    }

}
