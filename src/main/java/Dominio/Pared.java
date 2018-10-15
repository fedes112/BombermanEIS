package Dominio;

public class Pared implements Obstaculo {
    public boolean estado;

    public Pared(){
        estado = true;
    }

    @Override
    public boolean existe() {
        return estado;
    }

    @Override
    public void destruir() {
        estado = false;
    }

    @Override
    public void mover() {

    }
}
