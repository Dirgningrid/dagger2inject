import instruments.ClassicalGuitar;
import instruments.Drums;
import instruments.ElectricGuitar;
import musicians.*;

/**
 * Created by ingrid on 14/05/17.
 */
public class Main {

    public static void main(String[] args) {

        DepositoGiordani depositoGiordani;

        Singer singer = new Singer();
        singer.setDecibel(75);

        Guitarist guitarist = new RockerGuitarist(new ElectricGuitar());

        Drummer drummer = new RockerDrummer(new Drums());

        Band band = new Band(guitarist, singer, drummer);

        depositoGiordani = new DepositoGiordani();

        depositoGiordani.hiresRockBand();

    }
}
