package domain;

import java.util.List;
import javax.swing.JOptionPane;

public class Cocineros extends Thread {
    private List<Integer> pedidos;
    private Ordenes orden;

    public Cocineros(Ordenes orden, List<Integer> pedidos) {
        this.orden = orden;
        this.pedidos = pedidos;
    }

    public void run() {
        // Consume 10 pedidos de orden         
        for (int pedido : pedidos) {
           JOptionPane.showMessageDialog(null, "Cocinero Preparando: " + orden.nombrePlatillo(pedido));
           try {
                Thread.sleep(2000); //tiempo de preparación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            try {
//                sleep((int) (Math.random() * 2000));
//            } catch (InterruptedException e) {;
//            }
        }
    }
}
