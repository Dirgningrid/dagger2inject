import instruments.ClassicalGuitar;
import instruments.Drums;
import instruments.ElectricGuitar;
import musicians.*;

/**
 * Created by ingrid on 14/05/17.
 */
public class Main {

    public static void main(String[] args) {

        Band band;

        Singer singer = new Singer();
        singer.setDecibel(75);

        Guitarist guitarist = new Rocker(new ElectricGuitar());

        Drummer drummer = new Rocker(new Drums());

        band = new Band(guitarist, singer, drummer);

        band.playSomething();

    }
}
