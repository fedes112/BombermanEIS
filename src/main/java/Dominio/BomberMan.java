package Dominio;

public class BomberMan {
    private Celda celdaEnLaQueEsta;

    public BomberMan(Celda celda) {
       celdaEnLaQueEsta = celda;
    }


    public void moverCelda(Celda celda) {
        this.celdaEnLaQueEsta = this.celdaEnLaQueEsta.mover(celda);
    }

    public boolean estaEnCelda(Celda celda) {
        return this.celdaEnLaQueEsta.esEquals(celda);
    }
}
