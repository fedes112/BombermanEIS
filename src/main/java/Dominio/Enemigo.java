package Dominio;

public class Enemigo implements Obstaculo {
    public boolean estado;

    public Enemigo (){
        estado = true;
    }

    public void destruir(){
        estado = false;
    }

    @Override
    public void mover() {
        this.destruir();
    }

    @Override
    public boolean existe() {
        return estado;
    }
}
