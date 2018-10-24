package Dominio;

public class Tablero {

    Celda[][] tablero ;

    public Tablero(int ancho,int altura){
        tablero = new Celda[altura][ancho];
        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < altura; y++) {
                tablero[x][y] = new Celda(x,y,this);
            }
        }
    }


    public Celda getCellda(int x, int y) {
        return tablero[x][y];
    }
}
