package logic;

import domain.Meseros;
import domain.Ordenes;
import java.util.List;

public class LogicMeseros {
    private Meseros mesero;

    public LogicMeseros(Ordenes orden, List<Integer> pedidos) {
        this.mesero = new Meseros(orden, pedidos);
    }

    public Meseros getMesero() {
        return mesero;
    }

    public void iniciarMesero() {
        mesero.start();
    }
}