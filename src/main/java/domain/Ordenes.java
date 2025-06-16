package domain;

public class Ordenes {

    private int buffer[];
    private int siguiente = 0;
    private boolean estaLlena = false;
    private boolean estaVacia = true;
    
    public Ordenes(int capacidad) {
        buffer = new int[capacidad];
    }
    
    public synchronized int recogerOrden() {
        while (estaVacia == true) {
            try {
                wait();
            } catch (InterruptedException e) {;
            }
        }
        siguiente--;
        int pedido = buffer[siguiente];
        if (siguiente == 0) {
            estaVacia = true;
        }
        estaLlena = false;
        notify();
        return pedido;
    }
    //Método para añadir      

    public synchronized void lanzar(int pedido) {
        while (estaLlena == true) {
            try {
                wait();
            } catch (InterruptedException e) {;
            }
        }
        // Añade un pedido en el primer lugar disponible         
        buffer[siguiente] = pedido;
        // Cambia al siguiente lugar disponible       
        siguiente++;
        // Comprueba si el buffer está lleno       
        if (siguiente == 10) {
            estaLlena = true;
        }
        estaVacia = false;
        notify();
    }

    public String nombrePlatillo(int num) {
        return switch (num) {
            case 1 ->
                "Sopa de camarón";
            case 2 ->
                "Cóctel de camarón";
            case 3 ->
                "Camarones empanizados";
            case 4 ->
                "Arroz con camarones";
            case 5 ->
                "Sopa de mariscos";
            default ->
                "Desconocido";
        };
    }
}
