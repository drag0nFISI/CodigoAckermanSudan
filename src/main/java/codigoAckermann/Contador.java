package codigoAckermann;

/**
 *
 * @author Rojas Rojas Max
 */

public class Contador {
    private int pasos = 0;

    public void incrementar() {
        pasos++;
    }

    public int getPasos() {
        return pasos;
    }

    public void reset() {
        pasos = 0;
    }
}
