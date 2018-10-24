package Dominio;

public class Lanzar_bombas implements ContenidoDeLaCelda {

    @Override
    public boolean PuedoMover(BomberMan bomber) {
        bomber.setDejarBombas(new TirarBombas());
        return true;
    }

    @Override
    public void recivoExplocion(Celda celda) {}
}
class SaltarPared extends Lanzar_bombas {

    @Override
    public boolean PuedoMover(BomberMan bomber) {
        bomber.setSaltarParedes(true);
        return true;
    }
}
class MultiBombasSalto extends Lanzar_bombas {

    @Override
    public boolean PuedoMover(BomberMan bomber) {
        return true;
    }

}
