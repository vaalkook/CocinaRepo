package logic;

import domain.Cocineros;
import domain.Ordenes;
import java.util.List;

public class LogicCocineros {

    private Cocineros cocinero;

    public LogicCocineros(Ordenes orden, List<Integer> pedidos) {
        this.cocinero = new Cocineros(orden, pedidos);
    }
    public Cocineros getCocinero() {
        return cocinero;
    }

    public void iniciarCocinero() {
        cocinero.start();
    }
}
