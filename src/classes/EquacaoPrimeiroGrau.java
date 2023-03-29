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
            double x = -b / a;
            String resolucao = "Resolução da equação " + a + "x + " + b + " = 0:\n";
            resolucao += "Aplicando a propriedade da igualdade, obtemos:\n";
            resolucao += a + "x = " + -b + "\n";
            resolucao += "Dividindo ambos os lados da equação por " + a + ", temos:\n";
            resolucao += "x = " + x + "\n";
            resolucao += "Portanto, a solução da equação é x = " + x;
            return resolucao;
        }
    }
}
