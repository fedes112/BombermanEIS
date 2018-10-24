package Dominio;

public interface Bombas {
    public Bomba dejarBomba(int tiempo,Celda celda);
}
class DejarBombas implements Bombas{

    @Override
    public Bomba dejarBomba(int tiempo, Celda celda) {
        return new Bomba(tiempo,celda);
    }
}
class TirarBombas implements Bombas{

    @Override
    public Bomba dejarBomba(int tiempo, Celda celda) {
        return new Bomba(tiempo,celda.celdaEste().celdaEste());
    }
}
