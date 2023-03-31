package cores;

import java.awt.Color;

public class GerenciaCorRGB {

    /**
     *
     * Aplica uma cor RGB ao texto e retorna o texto com a cor aplicada.
     *
     * @param texto o texto a ser colorido.
     * @param red o valor vermelho da cor (entre 0 e 255).
     * @param green o valor verde da cor (entre 0 e 255).
     * @param blue o valor azul da cor (entre 0 e 255).
     * @return o texto com a cor aplicada.
     */
    public static String aplicarCor(String texto, int red, int green, int blue) {
        Color cor = new Color(red, green, blue);
        String corString = String.format("\033[38;2;%d;%d;%dm", cor.getRed(), cor.getGreen(), cor.getBlue());
        return corString + texto + "\033[0m";
    }
}
