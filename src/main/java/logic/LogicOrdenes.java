package logic;

import domain.Ordenes;

public class LogicOrdenes {
    int cantidadPedidos;
    private Ordenes ordenes;

    public LogicOrdenes(int cantidadPedidos) {
        this.ordenes = new Ordenes(cantidadPedidos);
    }

    public Ordenes getOrdenes() {
        return ordenes;
    }

    public void lanzarPedido(int codigoPlatillo) {
        ordenes.lanzar(codigoPlatillo);
    }

    public int recogerPedido() {
        return ordenes.recogerOrden();
    }

    public String obtenerNombrePlatillo(int codigo) {
        return ordenes.nombrePlatillo(codigo);
    }
}
