package Dominio;

public class Celda {
    private Tablero miTablero;
    private int cordenadasX;
    private int cordenadasY;
    private ContenidoDeLaCelda contengo;


    public Celda(int x,int y,Tablero tablero){
        cordenadasX = x;
        cordenadasY = y;
        contengo = new Vacio();
        miTablero = tablero;
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

    public Celda mover(Celda celda,BomberMan bomber) {
        if (this.contigua(celda) && celda.estaVacia(bomber)){
            return celda;
        }else{
            return this;
        }
    }

    private boolean estaVacia(BomberMan bomber) {
        return (this.contengo.PuedoMover(bomber));
    }

    public boolean esEquals(Celda celda) {
        return (this.cordenadasY == celda.getCordenadasY() && this.cordenadasX == celda.getCordenadasX()) ;
    }

    public void contener(ContenidoDeLaCelda objeto) {
        this.contengo = objeto;
    }

    public Celda celdaEste(){
        return miTablero.getCellda(cordenadasX,cordenadasY+1);
    }
    public Celda celdaNorte(){
        return miTablero.getCellda(cordenadasX+1,cordenadasY);
    }
    public Celda celdaSur(){
        return miTablero.getCellda(cordenadasX-1,cordenadasY);
    }
    public Celda celdaOeste(){
        return miTablero.getCellda(cordenadasX,cordenadasY-1);
    }

    public void romperObstaculo() {
        contengo.recivoExplocion(this);
    }

    public boolean estaVacia() {
        return contengo.getClass() == Vacio.class;
    }
}

