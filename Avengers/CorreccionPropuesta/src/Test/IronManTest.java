package Test;

import Personajes.IronMan;
import Personajes.Thanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IronManTest {

        @Test
        void Test00IronManSeCreaCon100DeVida(){
            IronMan ironMan = new IronMan();
            assertEquals(ironMan.getVida(), 100);
        }

        @Test
        void Test01IronManSeCreaCon0DeDanio(){
            IronMan ironMan = new IronMan();
            assertEquals(ironMan.calcularDaño(), 0);
        }


}
