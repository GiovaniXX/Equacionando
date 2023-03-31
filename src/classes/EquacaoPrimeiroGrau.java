package classes;

import cores.GerenciadorCoresRGB;

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
            String resolucao = "Resolução da equação:\n" + formatarNumero(a) + "x + " + formatarNumero(b) + " = 0:\n";
            resolucao += "Aplicando a propriedade da igualdade, obtemos:\n";
            resolucao += formatarNumero(a) + "x = " + formatarNumero(-b) + "\n";
            resolucao += "Dividindo ambos os lados da equação por " + formatarNumero(a) + ", temos:\n";
            resolucao += formatarNumero(a) + "x / " + formatarNumero(a) + " = " + formatarNumero(-b) + " / " + formatarNumero(a) + "\n";
            resolucao += "x = -(" + formatarNumero(b) + ") / " + formatarNumero(a) + "\n";
            resolucao += "x = " + formatarNumero(x) + "\n";
            resolucao += "Portanto, a solução da equação é x = " + formatarNumero(x) + "\n";
            resolucao += "--------------------------------------------------------------------------------------------------------------------------------\n";
            resolucao += "Chamamos de raíz quadrada do 1° Grau, o número real que substituído no lugar da variável x torna a sentença verdadeira.\n";
            resolucao += "Exemplo:\n";
            resolucao += "Na equação 2x - 6 = 0\n";
            resolucao += "A sentença será verdadeira se:\n";
            resolucao += "2.3 - 6 = 0\n";
            resolucao += "6 - 6 = 0\n";
            resolucao += "Logo, essa sentença é verdadeira pois, o resultado da equação é 0\n";
            resolucao += "Sendo sua solução x = 3\n";
            //resolucao += "Toda equação do 1° Grau tem que ser igual a 0 para que seja verdadeira.";
            resolucao += GerenciadorCoresRGB.aplicarCor("Toda equação do 1° Grau tem que ser igual a 0 para que seja verdadeira.", 255, 0, 102);

            return resolucao;
        }
    }

    private String formatarNumero(double numero) {
        if (numero == (int) numero) {
            return String.format("%d", (int) numero);
        } else {
            return String.format("%.1f", numero).replace(",", ".");
        }
    }
}
