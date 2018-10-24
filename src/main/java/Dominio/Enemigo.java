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

class Bagulaa extends Enemigo {

    @Override
    public void recivoExplocion(Celda celda) {
        celda.contener(new Lanzar_bombas());
    }
}

class ProtoMaxJr extends Enemigo {

    @Override
    public void recivoExplocion(Celda celda) {
        celda.contener(new SaltarPared());
    }
}

class ProtoMaxUnits extends Enemigo {
    @Override
    public void recivoExplocion(Celda celda) {
        celda.contener(new MultiBombasSalto());
    }
}