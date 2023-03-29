package classes;

public class EquacaoQuartoGrau {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    public EquacaoQuartoGrau(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public String resolverEquacao() {
        double delta0 = b * b - 3 * a * c;
        double delta1 = 2 * Math.pow(b, 3) - 9 * a * b * c + 27 * a * a * d;
        double C = Math.cbrt((delta1 + Math.sqrt(delta1 * delta1 - 4 * Math.pow(delta0, 3))) / 2.0);
        double x1 = (-b + C + (delta0 / C)) / (3 * a);
        double x2 = (-b - (C + Math.sqrt(3) * Math.sqrt(delta0 - C * C)) - (delta0 / (C + Math.sqrt(3) * Math.sqrt(delta0 - C * C)))) / (3 * a);
        double x3 = (-b - (C - Math.sqrt(3) * Math.sqrt(delta0 - C * C)) - (delta0 / (C - Math.sqrt(3) * Math.sqrt(delta0 - C * C)))) / (3 * a);
        double x4 = (-b + C - (delta0 / C)) / (3 * a);

        String resolucao = "Resolução da equação: " + a + "x^4 + " + b + "x^3 + " + c + "x^2 + " + d + "x + " + e + " = 0\n";
        resolucao += "Substituindo x = y - " + b / (4 * a) + " para simplificar a equação:\n";
        resolucao += a + "y^4 + " + delta0 / a + "y^2 + " + ((4 * a * c) - (b * b)) / a + " = 0\n";
        resolucao += "Delta0 = b^2 - 3ac = " + delta0 + "\n";
        resolucao += "Delta1 = 2b^3 - 9abc + 27a^2d = " + delta1 + "\n";
        resolucao += "C = " + C + "\n";
        resolucao += "x1 = " + x1 + "\n";
        resolucao += "x2 = " + x2 + "\n";
        resolucao += "x3 = " + x3 + "\n";
        resolucao += "x4 = " + x4 + "\n";

        return resolucao;
    }
}
