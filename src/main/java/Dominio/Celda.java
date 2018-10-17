package Dominio;

public class Celda {
    private boolean estaOcupada;
    private Obstaculo obs;

    public Celda(Obstaculo obstaculo) {
        estaOcupada = true;
        obs = obstaculo;
    }

    public Celda(){
        estaOcupada = false;
        obs = null;
    }


    public boolean tieneAlgo(){
        return estaOcupada;
    }

    public void recibirPersonaje(BomberMan bomberMan) {
        if (!estaOcupada){
            bomberMan.cambiarCelda(this);
            this.estaOcupada = true;

        }
        else{
            obs.mover();
        }

    }

    public void cambiarEstado() {
        this.estaOcupada =!this.estaOcupada;
    }
}
