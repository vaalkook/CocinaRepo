package domain;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Meseros extends Thread {
    int cantidadPedidos;
    private Ordenes orden;
    private List<Integer> pedidos;
    
    public Meseros(Ordenes orden, List<Integer> pedidos) {
        this.orden = orden;
        this.pedidos = pedidos;
    }

    public void run() {
        for (int pedido : pedidos) {
            orden.lanzar(pedido);
            JOptionPane.showMessageDialog(null, "Mesero: Pedido lanzado " + orden.nombrePlatillo(pedido));
        }
    }
}
