package codigoAckermann;

/**
 *
 * @author Max Rojas Rojas
 */

public class Ackermann {

    public static int ackermannIter(int m, int n, Contador contador) {
        java.util.Stack<int[]> stack = new java.util.Stack<>();
        stack.push(new int[]{m, n});

        while (!stack.isEmpty()) {
            contador.incrementar();

            int[] current = stack.pop();
            m = current[0];
            n = current[1];

            if (m == 0) {
                n = n + 1;
                if (stack.isEmpty()) {
                    return n;
                } else {
                    int[] top = stack.pop();
                    stack.push(new int[]{top[0], n});
                }
            } else if (n == 0) {
                stack.push(new int[]{m - 1, 1});
            } else {
                stack.push(new int[]{m - 1, -1}); 
                stack.push(new int[]{m, n - 1});
            }
        }
        return -1; 
    }

    public static String obtenerComplejidad(int m) { //notacion asintotica
        if (m == 0) return "n+1";
        if (m == 1) return "n+2";
        if (m == 2) return "2n+3";
        if (m == 3) return "(2^n+3)-3";
        return "hiper exponencial";
    }
}

