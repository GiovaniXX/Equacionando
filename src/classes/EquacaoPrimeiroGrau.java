package classes;

public class EquacaoPrimeiroGrau {

    private final double a;
    private final double b;

    public EquacaoPrimeiroGrau(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String resolverEquacao() {
        if (a == 0) {
            if (b == 0) {
                return "A equação é indeterminada.";
            } else {
                return "A equação é impossível.";
            }
        } else {
            String resolucao = "Resolução da equação :\n" + a + "x + " + b + " = 0:\n";
            resolucao += a + "x = " + (-b) + "\n";
            double x = -b / a;
            resolucao += "x = " + x + "\n";
            resolucao += "A solução da equação é : \n x = " + x;

            return resolucao;
        }
    }
}
