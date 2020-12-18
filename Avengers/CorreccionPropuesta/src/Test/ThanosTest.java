package Test;

import Personajes.Thanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThanosTest {

    @Test
    void Test00ThanosSeCreaCon250DeVida(){
        Thanos thanos = new Thanos();
        assertEquals(thanos.getVida(), 250);
    }

    @Test
    void Test01ThanosSeCreaCon15DeDanio(){
        Thanos thanos = new Thanos();
        assertEquals(thanos.calcularDaño(), 15);
    }

}
