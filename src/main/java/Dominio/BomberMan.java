package Dominio;


public class BomberMan {
    private Celda celdaEnLaQueEsta;
    private EstadoVivo vivo = new EstadoVivo();

    public BomberMan(Celda celda) {
       celdaEnLaQueEsta = celda;
    }


    public void moverCelda(Celda celda) {
        this.celdaEnLaQueEsta = this.vivo.mover(celdaEnLaQueEsta,celda,this);
    }

    public boolean estaEnCelda(Celda celda) {
        return this.celdaEnLaQueEsta.esEquals(celda);
    }

    public void matar() {
        this.vivo = new EstadoMuerto();
    }

    public Bomba dejarBomba(int tiempo){
        return new Bomba(tiempo,celdaEnLaQueEsta);
    }

}
