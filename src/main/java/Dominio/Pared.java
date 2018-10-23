package Dominio;

public class Pared implements ContenidoDeLaCelda {
    public boolean PuedoMover(BomberMan bomber) {
        return false;
    }

    @Override
    public void recivoExplocion(Celda celda) {
        celda.contener(new Vacio());
    }

}

class ParedMetal extends Pared{
    public void recivoExplocion(Celda celda) {}
}
