package Dominio;

public class Celda {
    private int cordenadasX;
    private int cordenadasY;
    private Objeto contengo;

    public Celda(int x,int y){
        cordenadasX = x ;
        cordenadasY = y ;
        contengo = new Objeto();
    }

    public int getCordenadasY() {
        return this.cordenadasY;
    }

    public int getCordenadasX() {
        return this.cordenadasX;
    }

    public boolean desfaceEnYEsMenorA2(int cordenadaX, int cordenadaY){
        return((cordenadaX == this.getCordenadasX()) && 1 < Math.abs((cordenadaY - this.getCordenadasY())));
    }

    public boolean desfaceEnXEsMenorA2(int cordenadaX, int cordenadaY) {
        return (1 < Math.abs(cordenadaX - this.getCordenadasX())) && (cordenadaY == this.getCordenadasY());
    }

    public boolean contigua(Celda celda) {
        return !(this.desfaceEnXEsMenorA2(celda.getCordenadasX(), celda.getCordenadasY())
                || this.desfaceEnYEsMenorA2(celda.getCordenadasX(), celda.getCordenadasY()));
    }

    public Celda mover(Celda celda) {
        if (this.contigua(celda) && celda.estaVacia()){
            return celda;
        }else{
            return this;
        }
    }

    private boolean estaVacia() {
        return (this.contengo.PuedoMover());
    }

    public boolean esEquals(Celda celda) {
        return (this.cordenadasY == celda.getCordenadasY() && this.cordenadasX == celda.getCordenadasX()) ;
    }

    public void contener(Objeto objeto) {
        this.contengo = objeto;
    }
}

