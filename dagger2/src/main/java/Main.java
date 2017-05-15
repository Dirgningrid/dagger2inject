import instruments.ClassicalGuitar;
import instruments.ElectricGuitar;
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

        Singer singer = new Rocker(75);

        Guitarist guitarist = new Rocker(new ElectricGuitar());

        band = new Band(guitarist, singer);

        band.playSomething();

    }
}
