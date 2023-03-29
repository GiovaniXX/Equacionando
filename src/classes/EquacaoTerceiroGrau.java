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

        // Cálculo do coeficiente C
        double C = Math.cbrt((delta1 + Math.sqrt(delta1 * delta1 - 4 * delta0 * delta0 * delta0)) / 2);

        // Cálculo das raízes
        double x1 = -1.0 / (3 * a) * (b + C + delta0 / C);
        double x2 = -1.0 / (3 * a) * (b - 0.5 * C - 0.5 * Math.sqrt(3) * Math.sqrt(delta0) / C);
        double x3 = -1.0 / (3 * a) * (b - 0.5 * C + 0.5 * Math.sqrt(3) * Math.sqrt(delta0) / C);

        // Construção da string de resolução
        StringBuilder resolucao = new StringBuilder();
        resolucao.append("Resolução da equação: \n");
        resolucao.append(a).append("x^3 + ").append(b).append("x^2 + ").append(c).append("x + ").append(d).append(" = 0\n");
        resolucao.append("Delta0 = ").append(delta0).append("\n");
        resolucao.append("Delta1 = ").append(delta1).append("\n");
        resolucao.append("C = ").append(C).append("\n");
        resolucao.append("x1 = ").append(x1).append("\n");
        resolucao.append("x2 = ").append(x2).append("\n");
        resolucao.append("x3 = ").append(x3);

        return resolucao.toString();
    }
}
