package cores;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * Classe para gerenciamento de cores RGB.
 */
public class GerenciadorCoresRGB {

    /**
     *
     * Aplica uma cor RGB ao texto e retorna o texto com a cor aplicada.
     *
     * @param jTextArea
     * @param texto o texto a ser colorido.
     * @param red o valor vermelho da cor (entre 0 e 255).
     * @param green o valor verde da cor (entre 0 e 255).
     * @param blue o valor azul da cor (entre 0 e 255).
     */
//    public static String aplicarCor(String texto, int red, int green, int blue) {
//        Color cor = new Color(red, green, blue);
//        String corString = String.format("\033[38;2;%d;%d;%dm", cor.getRed(), cor.getGreen(), cor.getBlue());
//        return corString + texto + "\033[0m";
//    }
    public static void aplicarCor(JTextArea jTextArea, String texto, int red, int green, int blue) {
        Color cor = new Color(red, green, blue);
        String corString = String.format("\033[38;2;%d;%d;%dm", cor.getRed(), cor.getGreen(), cor.getBlue());
        jTextArea.setForeground(cor);
        jTextArea.append(corString + texto + "\033[0m");
    }

}
