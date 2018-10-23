package Dominio;

public class Vacio implements ContenidoDeLaCelda{
    public boolean PuedoMover(BomberMan bomber) {
        return true;
    }

    public void recivoExplocion(Celda celda) {
        celda.contener(new Vacio());
    }
}
