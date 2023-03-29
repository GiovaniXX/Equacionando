package classes;

public class EquacaoTerceiroGrau {

    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public EquacaoTerceiroGrau(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String resolverEquacao() {
        double delta0 = b * b - 3 * a * c;
        double delta1 = 2 * b * b * b - 9 * a * b * c + 27 * a * a * d;

        double C = Math.cbrt((delta1 + Math.sqrt(delta1 * delta1 - 4 * delta0 * delta0 * delta0)) / 2);
        double x1 = -1.0 / (3 * a) * (b + C + delta0 / C);
        double x2 = -1.0 / (3 * a) * (b - 0.5 * C - 0.5 * Math.sqrt(3) * Math.sqrt(delta0) / C);
        double x3 = -1.0 / (3 * a) * (b - 0.5 * C + 0.5 * Math.sqrt(3) * Math.sqrt(delta0) / C);

        String resolucao = "Resolução da equação:\n" + a + "x^3 + " + b + "x^2 + " + c + "x + " + d + " = 0\n";
        resolucao += "Delta0 = " + delta0 + "\n";
        resolucao += "Delta1 = " + delta1 + "\n";
        resolucao += "C = " + C + "\n";
        resolucao += "x1 = " + x1 + "\n";
        resolucao += "x2 = " + x2 + "\n";
        resolucao += "x3 = " + x3 + "\n";

        return resolucao;
    }
}
