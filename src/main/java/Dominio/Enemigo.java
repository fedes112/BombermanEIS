package Dominio;

public class Enemigo implements ContenidoDeLaCelda {
    public boolean PuedoMover(BomberMan bomber) {
        bomber.matar();
        return false;
    }

    @Override
    public void recivoExplocion(Celda celda) {
        celda.contener(new Vacio());
    }
}
