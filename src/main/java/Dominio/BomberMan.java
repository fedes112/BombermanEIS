package Dominio;


public class BomberMan {
    private Celda celdaEnLaQueEsta;
    private EstadoVivo vivo = new EstadoVivo();
    private boolean saltarParedes = false;
    private Bombas dejarBombas= new DejarBombas();

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
        return dejarBombas.dejarBomba(tiempo,celdaEnLaQueEsta);
    }

    public boolean puedeSaltarParedes() {
        return this.saltarParedes;
    }

    public void setSaltarParedes(boolean cambio){ this.saltarParedes = cambio; }

    public void setDejarBombas(TirarBombas tirarBombas) { dejarBombas = tirarBombas;}
}
