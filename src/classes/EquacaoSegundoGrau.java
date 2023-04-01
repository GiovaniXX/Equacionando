package classes;

public class EquacaoSegundoGrau {

    private final double a;
    private final double b;
    private final double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolverEquacao() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "A equação é indeterminada.";
                } else {
                    return "A equação é impossível.";
                }
            } else {
                double x = -c / b;
                return "A equação é de primeiro grau. A solução é x = " + x;
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                return "A equação não possui raízes reais.";
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                String resolucao = "Resolução da equação:\n " + a + "x² + " + b + "x + " + c + " = 0:\n";
                resolucao += "Calculando o valor do delta:\n";
                resolucao += "delta = " + b + "² - 4 * " + a + " * " + c + " = " + delta + "\n";
                resolucao += "Calculando as raízes da equação:\n";
                resolucao += "x1 = (-" + b + " + √" + delta + ") / (2 * " + a + ") = " + x1 + "\n";
                resolucao += "x2 = (-" + b + " - √" + delta + ") / (2 * " + a + ") = " + x2 + "\n";
                resolucao += "Portanto, as soluções da equação são:\n x1 = " + x1 + "\n x2 = " + x2;

                return resolucao;
            }
        }
    }
}
