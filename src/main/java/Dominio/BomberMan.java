package Dominio;

public class BomberMan {
    private Celda celdaEnLaQueEsta;

    public BomberMan(Celda celda1) {
       celdaEnLaQueEsta = celda1;
    }



    public void mover(Celda celda1) {
        celda1.recibirPersonaje(this);

    }

    public Celda getCeldaEnLaQueEsta(){
        return celdaEnLaQueEsta;
    }

    public void cambiarCelda(Celda celda) {
        this.celdaEnLaQueEsta.cambiarEstado();
        this.celdaEnLaQueEsta = celda;
    }
}
