public class Equacao {
    private final String nome;
    private final String formato;
    private final int numCoeficientes;

    public Equacao(String nome, String formato, int numCoeficientes) {
        this.nome = nome;
        this.formato = formato;
        this.numCoeficientes = numCoeficientes;
    }

    public String getNome() {
        return nome;
    }

    public String getFormato() {
        return formato;
    }

    public int getNumCoeficientes() {
        return numCoeficientes;
    }
}

public class MinhaTela extends javax.swing.JFrame {
    private static final Equacao EQ1 = new Equacao("Equação do 1° Grau", "ax + b = 0", 2);
    private static final Equacao EQ2 = new Equacao("Equação do 2° Grau", "ax² + bx + c = 0", 3);
    private static final Equacao EQ3 = new Equacao("Equação do 3° Grau", "ax³ + bx² + cx + d = 0", 4);
    private static final Equacao EQ4 = new Equacao("Equação do 4° Grau", "ax⁴ + bx³ + cx² + dx + e = 0", 5);

    public MinhaTela() {
        initComponents();
        jComboBox_SelecaoEquacao.addItem(EQ1.getNome());
        jComboBox_SelecaoEquacao.addItem(EQ2.getNome());
        jComboBox_SelecaoEquacao.addItem(EQ3.getNome());
        jComboBox_SelecaoEquacao.addItem(EQ4.getNome());
    }

    private void jComboBox_SelecaoEquacaoActionPerformed(java.awt.event.ActionEvent evt) {
        Equacao equacaoSelecionada = null;
        String itemSelecionado = (String) jComboBox_SelecaoEquacao.getSelectedItem();

        switch (itemSelecionado) {
            case EQ1.getNome() -> equacaoSelecionada = EQ1;
            case EQ2.getNome() -> equacaoSelecionada = EQ2;
            case EQ3.getNome() -> equacaoSelecionada = EQ3;
            case EQ4.getNome() -> equacaoSelecionada = EQ4;
        }

        if (equacaoSelecionada != null) {
            setLabelText(equacaoSelecionada.getFormato());
            setCamposHabilitados(true, true, true, true, true);
            int numCampos = equacaoSelecionada.getNumCoeficientes();
			
			switch (numCampos) {
            case 2 -> setCamposHabilitados(true, true, false, false, false);
            case 3 -> setCamposHabilitados(true, true, true, false, false);
            case 4 -> setCamposHabilitados(true, true, true, true, false);
            case 5 -> setCamposHabilitados(true, true, true, true, true);

           jTextField_A.requestFocus();
        } else {
            setLabelText("");
            setCamposHabilitados(false, false, false, false, false);
        }
	}
	
	private void setLabelText(String text) {
       jLabel_Selecionado.setText(text);
    }

    private void setCamposHabilitados(boolean a, boolean b, boolean c, boolean d, boolean e) {
        jTextField_A.setEnabled(a);
        jTextField_B.setEnabled(b);
        jTextField_C.setEnabled(c);
        jTextField_D.setEnabled(d);
        jTextField_E.setEnabled(e);
    }
}
	