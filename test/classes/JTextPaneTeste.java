package classes;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class JTextPaneTeste {

    @Test
    public void testResolverEquacaoComDecimalTest() {
        double a = 3.5;
        double b = 1.5;
        double resultadoEsperado = -b / a;
        //String resultado = JTextPaneTeste.testResolverEquacaoComDecimal(a, b);
        //assertThat(resultado, containsString("Portanto, a solução da equação é x = " + resultadoEsperado));
    }
}
