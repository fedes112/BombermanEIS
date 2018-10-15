import Dominio.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TestBombermanSeMueve {

    @Test
    public void cuandoBombermanSeMueveSiNoHayNadaCambiaDeCelda(){
        Celda celda1 = new Celda();
        Celda celda2 = new Celda();
        BomberMan bomber = new BomberMan(celda1);


        bomber.mover(celda2);

        assertTrue(celda2.tieneAlgo());
    }

    @Test
    public void cuandoBombermanSeMueveSiHayAlgoNoCambiaDeCelda(){
        Celda celda1 = new Celda();
        Obstaculo pared = new Pared();
        Celda celda2 = new Celda(pared);
        BomberMan bomber = new BomberMan(celda1);


        bomber.mover(celda2);

        assertEquals(celda1,bomber.getCeldaEnLaQueEsta());
    }

    @Test
    public void cuandoBombermanSeMueveSiHayAlguienLoPisa(){
        Celda celda1 = new Celda();
        Obstaculo malo = new Enemigo();
        Celda celda2 = new Celda(malo);
        BomberMan bomber = new BomberMan(celda1);


        bomber.mover(celda2);

        assertTrue(!malo.existe());
    }
}
