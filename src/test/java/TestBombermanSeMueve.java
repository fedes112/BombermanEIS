import Dominio.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TestBombermanSeMueve {

    @Test
    public void tengo2CeldasContiguas(){
        Tablero tablero = new Tablero(10,10);
        Celda celda1 = tablero.getCellda(1,2);
        Celda celda2 = tablero.getCellda(1,1);
        assert (celda1.contigua(celda2) && celda2.contigua(celda1));
    }

    @Test
    public void cuandoBombermanSeMueveSiNoHayNadaCambiaACeldaContigua(){
        Tablero tablero = new Tablero(10,10);
        Celda celda1 = tablero.getCellda(1,2);
        Celda celda2 = tablero.getCellda(1,1);

        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert (bomber.estaEnCelda(celda2));

    }

    @Test
    public void cuandoBombermanSeMueveSiNoHayNadaYCeldaNoContiguaNoCambiaDeCelda(){
        Tablero tablero = new Tablero(10,10);
        Celda celda1 = tablero.getCellda(1,2);
        Celda celda2 = tablero.getCellda(1,0);

        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert (bomber.estaEnCelda(celda1));

    }

    @Test
    public void cuandoBombermanSeMueveSiHayAlgoNoCambiaDeCelda(){
        Tablero tablero = new Tablero(10,10);
        Celda celda1 = tablero.getCellda(1,2);
        Celda celda2 = tablero.getCellda(1,1);
        celda2.contener(new Pared());
        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert(bomber.estaEnCelda(celda1));
    }

    @Test
    public void cuandoBombermanSeMueveSiHayUnEnemigoSeMuere(){
        Tablero tablero = new Tablero(10,10);
        Celda celda1 = tablero.getCellda(1,2);
        Celda celda2 = tablero.getCellda(1,1);
        celda2.contener(new Enemigo());
        BomberMan bomber = new BomberMan(celda1);

        bomber.moverCelda(celda2);

        assert(bomber.estaEnCelda(celda1));
    }

    @Test
    public void cuandoBombermandejaUnaBombaYMataUnEnemigo(){
        Tablero tablero = new Tablero(10,10);
        Celda celda1 = tablero.getCellda(5,5);
        Celda celda2 = tablero.getCellda(4,5);
        celda2.contener(new Enemigo());
        BomberMan bomber = new BomberMan(celda1);
        Bomba bomba = bomber.dejarBomba(1);
        bomba.explotar();
        assert(celda2.estaVacia());
    }


}
