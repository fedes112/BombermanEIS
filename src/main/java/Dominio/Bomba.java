package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Bomba {

    int tiempo ;
    List<Celda> celdas;

    public Bomba(int tiempo, Celda celdaEnLaQueEsta) {
        this.tiempo = tiempo;
        celdas = new ArrayList<Celda>();
        celdas.add(celdaEnLaQueEsta);
        celdas.add(celdaEnLaQueEsta.celdaOeste());
        celdas.add(celdaEnLaQueEsta.celdaOeste().celdaOeste());
        celdas.add(celdaEnLaQueEsta.celdaSur());
        celdas.add(celdaEnLaQueEsta.celdaSur().celdaSur());
        celdas.add(celdaEnLaQueEsta.celdaNorte());
        celdas.add(celdaEnLaQueEsta.celdaNorte().celdaNorte());
        celdas.add(celdaEnLaQueEsta.celdaEste());
        celdas.add(celdaEnLaQueEsta.celdaEste().celdaEste());
    }

    public void explotar(){
        for (Celda celda: this.celdas) {
            celda.romperObstaculo();
        }
    }
}
