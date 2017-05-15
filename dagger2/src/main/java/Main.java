import instruments.ClassicalGuitar;
import musicians.Classical;
import musicians.Guitarist;
import musicians.Rocker;
import musicians.Singer;

/**
 * Created by ingrid on 14/05/17.
 */
public class Main {

    public static void main(String[] args) {

        Band band;

        Singer singer = new Singer();
        singer.setVoiceDecibel(70);

        Guitarist guitarist = new Classical(new ClassicalGuitar(false));

        band = new Band(guitarist, singer);

        band.playSomething();

    }
}
