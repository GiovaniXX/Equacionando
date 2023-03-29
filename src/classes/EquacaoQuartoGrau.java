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
        // Cálculo dos coeficientes Delta0 e Delta1
        double delta0 = b * b - 3 * a * c;
        double delta1 = 2 * Math.pow(b, 3) - 9 * a * b * c + 27 * a * a * d;

        // Cálculo do coeficiente C
        double C = Math.cbrt((delta1 + Math.sqrt(delta1 * delta1 - 4 * Math.pow(delta0, 3))) / 2.0);

        // Cálculo das raízes x1, x2, x3 e x4
        double x1 = (-b + C + (delta0 / C)) / (3 * a);
        double x2 = (-b - (C + Math.sqrt(3) * Math.sqrt(delta0 - C * C)) - (delta0 / (C + Math.sqrt(3) * Math.sqrt(delta0 - C * C)))) / (3 * a);
        double x3 = (-b - (C - Math.sqrt(3) * Math.sqrt(delta0 - C * C)) - (delta0 / (C - Math.sqrt(3) * Math.sqrt(delta0 - C * C)))) / (3 * a);
        double x4 = (-b + C - (delta0 / C)) / (3 * a);

        // Criação da string com a resolução da equação
        StringBuilder resolucao = new StringBuilder();
        resolucao.append("Resolução da equação: ");
        resolucao.append(a).append("x^4 + ").append(b).append("x^3 + ").append(c).append("x^2 + ").append(d).append("x + ").append(e).append(" = 0\n");

        // Substituição de x = y - b/(4a) para simplificar a equação
        resolucao.append("Substituindo x = y - ").append(b / (4 * a)).append(" para simplificar a equação:\n");
        resolucao.append(a).append("y^4 + ").append(delta0 / a).append("y^2 + ").append((4 * a * c - b * b) / a).append(" = 0\n");
        //resolucao.append(a).append("y^4 + ").append(delta0 / a).append("y^2 + ").append((4 * a * c) - (b * b)) / a).append(" = 0\n"); erro nesta linha

        // Inclusão dos valores de Delta0, Delta1 e C na string
        resolucao.append("Delta0 = b^2 - 3ac = ").append(delta0).append("\n");
        resolucao.append("Delta1 = 2b^3 - 9abc + 27a^2d = ").append(delta1).append("\n");
        resolucao.append("C = ").append(C).append("\n");

        // Inclusão dos valores das raízes na string
        resolucao.append("x1 = ").append(x1).append("\n");
        resolucao.append("x2 = ").append(x2).append("\n");
        resolucao.append("x3 = ").append(x3).append("\n");
        resolucao.append("x4 = ").append(x4).append("\n");

        // Retorno da string com a resolução da equação
        return resolucao.toString();
    }
}
