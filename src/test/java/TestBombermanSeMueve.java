import Dominio.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TestBombermanSeMueve {

    @Test
    public void tengo2CeldasContiguas(){
        Celda celda1 = new Celda(1,2);
        Celda celda2 = new Celda(1,1);

        assert (celda1.contigua(celda2) && celda2.contigua(celda1));
    }

    @Test
    public void cuandoBombermanSeMueveSiNoHayNadaCambiaACeldaContigua(){
        Celda celda1 = new Celda(1,2);
        Celda celda2 = new Celda(1,1);

        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert (bomber.estaEnCelda(celda2));

    }

    @Test
    public void cuandoBombermanSeMueveSiNoHayNadaYCeldaNoContiguaNoCambiaDeCelda(){
        Celda celda1 = new Celda(1,2);
        Celda celda2 = new Celda(1,0);

        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert (bomber.estaEnCelda(celda1));

    }

    @Test
    public void cuandoBombermanSeMueveSiHayAlgoNoCambiaDeCelda(){
        Celda celda1 = new Celda(1,2);
        Celda celda2 = new Celda(1,1);
        celda2.contener(new Pared());
        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert(bomber.estaEnCelda(celda1));
    }

    @Test
    public void cuandoBombermanSeMueveSiHayUnEnemigoSeMuere(){
        Celda celda1 = new Celda(1,2);
        Celda celda2 = new Celda(1,1);
        celda2.contener(new Enemigo());
        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert(bomber.estaEnCelda(celda2));
    }
}
