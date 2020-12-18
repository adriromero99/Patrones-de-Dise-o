package Test;

import Personajes.IronMan;
import Personajes.Thanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeleasTest {

    @Test
    public void test00ThanosAtacaAIronManYLeHace15DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        thanos.atacar(ironMan);
        assertEquals(ironMan.getVida(), 85);
    }

    @Test
    public void test01ThanosAtacaAIronManConGemasYLeHace60DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        thanos.conseguirGemas();
        thanos.atacar(ironMan);
        assertEquals(ironMan.getVida(), 40);
    }

    @Test
    public void test02IronManAtacaAThanosSinArmaduraYLeHace0DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.atacar(thanos);
        assertEquals(thanos.getVida(), 250);
    }

    @Test
    public void test03IronManAtacaAThanosConMarkIYLeHace10DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparMarkI();
        ironMan.atacar(thanos);
        assertEquals(thanos.getVida(), 240);
    }

    @Test
    public void test04IronManAtacaAThanosConMarkIIYLeHace12DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparMarkII();
        ironMan.atacar(thanos);
        assertEquals(thanos.getVida(), 238);
    }

    @Test
    public void test05IronManAtacaAThanosConWarMachineYLeHace10DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparWarMachine();
        ironMan.atacar(thanos);
        assertEquals(thanos.getVida(), 240);
    }

    @Test
    public void test06IronManAtacaAThanosConWarMachineYSeCura10DeVida(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparWarMachine();
        ironMan.atacar(thanos);
        assertEquals(ironMan.getVida(), 110);
    }

    @Test
    public void test07IronManSeEquipaMarkIYLuegoMarkIIAtacaAThanosYRealiza22DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparMarkI();
        ironMan.equiparMarkII();
        ironMan.atacar(thanos);
        assertEquals(thanos.getVida(), 228);
    }

    @Test
    public void test08IronManConMarkIILeRobaLasGemasAThanosYLoAtacaHaciendo48DeDanio(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparMarkII();
        thanos.conseguirGemas();
        ironMan.robarGemasA(thanos);
        ironMan.atacar(thanos);
        assertEquals(thanos.getVida(), 202);
    }

    @Test
    public void test09IronManConMarkIILeRobaLasGemasAThanosYLoAtacaLuegoMuere(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.equiparMarkII();
        thanos.conseguirGemas();
        ironMan.robarGemasA(thanos);
        ironMan.atacar(thanos);
        assertEquals(ironMan.getVida(), 0);
    }


}
