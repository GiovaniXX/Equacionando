package equacionando;

import classes.EquacaoPrimeiroGrau;
import classes.EquacaoQuartoGrau;
import classes.EquacaoSegundoGrau;
import classes.EquacaoTerceiroGrau;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Equacao extends javax.swing.JFrame {

    public Equacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox_SelecionarEquacao = new javax.swing.JComboBox<>();
        jLabel_Selecionado = new javax.swing.JLabel();
        jButton_CalcularEquacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Resolucao = new javax.swing.JTextArea();
        jTextField_A = new javax.swing.JTextField();
        jTextField_B = new javax.swing.JTextField();
        jTextField_C = new javax.swing.JTextField();
        jTextField_D = new javax.swing.JTextField();
        jTextField_E = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_LimparCampos = new javax.swing.JButton();
        jLabel_Info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equazione™");
        setResizable(false);

        jComboBox_SelecionarEquacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA A EQUAÇÃO", "Equação do 1° Grau", "Equação do 2° Grau", "Equação do 3° Grau", "Equação do 4° Grau" }));
        jComboBox_SelecionarEquacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SelecionarEquacaoActionPerformed(evt);
            }
        });

        jLabel_Selecionado.setForeground(new java.awt.Color(51, 204, 0));
        jLabel_Selecionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Selecionado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_CalcularEquacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_CalcularEquacao.setText("Calcular Equação");
        jButton_CalcularEquacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CalcularEquacaoActionPerformed(evt);
            }
        });

        jTextArea_Resolucao.setColumns(20);
        jTextArea_Resolucao.setRows(5);
        jTextArea_Resolucao.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_Resolucao);

        jTextField_A.setEnabled(false);
        jTextField_A.setSelectionColor(new java.awt.Color(205, 0, 102));
        jTextField_A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_AKeyPressed(evt);
            }
        });

        jTextField_B.setEnabled(false);
        jTextField_B.setSelectionColor(new java.awt.Color(205, 0, 102));

        jTextField_C.setEnabled(false);

        jTextField_D.setEnabled(false);

        jTextField_E.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("E");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Entre com os valores da equação!");

        jButton_LimparCampos.setText("Limpar Campos");
        jButton_LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparCamposActionPerformed(evt);
            }
        });

        jLabel_Info.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel_Info.setForeground(new java.awt.Color(51, 204, 0));
        jLabel_Info.setText("Desenvolvido por: Giovani V. Chaves - 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Selecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_SelecionarEquacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_A, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_B, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_C, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_D, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_E, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_CalcularEquacao, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_LimparCampos)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Selecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jComboBox_SelecionarEquacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_CalcularEquacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_LimparCampos)
                    .addComponent(jLabel_Info))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CalcularEquacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CalcularEquacaoActionPerformed
        int selectedIndex = jComboBox_SelecionarEquacao.getSelectedIndex();
        double A, B, C, D, E;

        if (selectedIndex == 0) {
            JOptionPane.showMessageDialog(this, "É necessário escolher uma equação para calcular.!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        switch (selectedIndex) {
            case 1 -> {
                if (jTextField_A.getText().isEmpty() || jTextField_B.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "É necessário entrar com valor nos campos A B", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jTextField_A.requestFocus();
                    return;
                }
                A = Double.parseDouble(jTextField_A.getText());
                B = Double.parseDouble(jTextField_B.getText());
                EquacaoPrimeiroGrau epg = new EquacaoPrimeiroGrau(A, B);
                jTextArea_Resolucao.setText(epg.resolverEquacao());
            }
            case 2 -> {
                if (jTextField_A.getText().isEmpty() || jTextField_B.getText().isEmpty() || jTextField_C.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "É necessário entrar com valor nos campos A B C", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jTextField_A.requestFocus();
                    return;
                }
                A = Double.parseDouble(jTextField_A.getText());
                B = Double.parseDouble(jTextField_B.getText());
                C = Double.parseDouble(jTextField_C.getText());
                EquacaoSegundoGrau esg = new EquacaoSegundoGrau(A, B, C);
                jTextArea_Resolucao.setText(esg.resolverEquacao());
            }
            case 3 -> {
                if (jTextField_A.getText().isEmpty() || jTextField_B.getText().isEmpty() || jTextField_C.getText().isEmpty() || jTextField_D.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "É necessário entrar com valor nos campos A B C D", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jTextField_A.requestFocus();
                    return;
                }
                A = Double.parseDouble(jTextField_A.getText());
                B = Double.parseDouble(jTextField_B.getText());
                C = Double.parseDouble(jTextField_C.getText());
                D = Double.parseDouble(jTextField_D.getText());
                EquacaoTerceiroGrau etg = new EquacaoTerceiroGrau(A, B, C, D);
                jTextArea_Resolucao.setText(etg.resolverEquacao());
            }
            case 4 -> {
                if (jTextField_A.getText().isEmpty() || jTextField_B.getText().isEmpty() || jTextField_C.getText().isEmpty() || jTextField_D.getText().isEmpty() || jTextField_E.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "É necessário entrar com valor nos campos A B C D E", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jTextField_A.requestFocus();
                    return;
                }
                A = Double.parseDouble(jTextField_A.getText());
                B = Double.parseDouble(jTextField_B.getText());
                C = Double.parseDouble(jTextField_C.getText());
                D = Double.parseDouble(jTextField_D.getText());
                E = Double.parseDouble(jTextField_E.getText());
                EquacaoQuartoGrau eqg = new EquacaoQuartoGrau(A, B, C, D, E);
                jTextArea_Resolucao.setText(eqg.resolverEquacao());
            }
            default -> {
                jLabel_Selecionado.setText("");
                setCamposHabilitados(false, false, false, false, false);
            }
        }
    }//GEN-LAST:event_jButton_CalcularEquacaoActionPerformed

    private void jComboBox_SelecionarEquacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SelecionarEquacaoActionPerformed
        String itemSelecionado = (String) jComboBox_SelecionarEquacao.getSelectedItem();

        switch (itemSelecionado) {
            case "Equação do 1° Grau" -> {
                jLabel_Selecionado.setText("ax + b = 0");
                setCamposHabilitados(true, true, false, false, false);
                jTextField_A.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_B.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_C.setBackground(new java.awt.Color(45, 45, 48));
                jTextField_D.setBackground(new java.awt.Color(45, 45, 48));
                jTextField_E.setBackground(new java.awt.Color(45, 45, 48));
                jTextField_A.setText("");
                jTextField_B.setText("");
                jTextField_C.setText("");
                jTextField_D.setText("");
                jTextField_E.setText("");
                jTextArea_Resolucao.setText("");
                jTextField_A.requestFocus();
            }
            case "Equação do 2° Grau" -> {
                jLabel_Selecionado.setText("ax² + bx + c = 0");
                setCamposHabilitados(true, true, true, false, false);
                jTextField_A.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_B.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_C.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_D.setBackground(new java.awt.Color(45, 45, 48));
                jTextField_E.setBackground(new java.awt.Color(45, 45, 48));
                jTextField_A.setText("");
                jTextField_B.setText("");
                jTextField_C.setText("");
                jTextField_D.setText("");
                jTextField_E.setText("");
                jTextArea_Resolucao.setText("");
                jTextField_A.requestFocus();
            }
            case "Equação do 3° Grau" -> {
                jLabel_Selecionado.setText("ax³ + bx² + cx + d = 0");
                setCamposHabilitados(true, true, true, true, false);
                jTextField_A.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_B.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_C.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_D.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_E.setBackground(new java.awt.Color(45, 45, 48));
                jTextField_A.setText("");
                jTextField_B.setText("");
                jTextField_C.setText("");
                jTextField_D.setText("");
                jTextField_E.setText("");
                jTextArea_Resolucao.setText("");
                jTextField_A.requestFocus();
            }
            case "Equação do 4° Grau" -> {
                jLabel_Selecionado.setText("ax⁴ + bx³ + cx² + dx + e = 0");
                setCamposHabilitados(true, true, true, true, true);
                jTextField_A.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_B.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_C.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_D.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_E.setBackground(new java.awt.Color(60, 63, 65));
                jTextField_A.setText("");
                jTextField_B.setText("");
                jTextField_C.setText("");
                jTextField_D.setText("");
                jTextField_E.setText("");
                jTextArea_Resolucao.setText("");
                jTextField_A.requestFocus();
            }
            default -> {
                jLabel_Selecionado.setText("");
                setCamposHabilitados(false, false, false, false, false);
            }
        }
    }//GEN-LAST:event_jComboBox_SelecionarEquacaoActionPerformed

    private void jTextField_AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            JTextField source = (JTextField) evt.getSource();
//            source.setBackground(new Color(255, 0, 102));
//
//            switch (source.getName()) {
//                case "jTextField_A" ->
//                    jTextField_B.requestFocus();
//                case "jTextField_B" ->
//                    jTextField_C.requestFocus();
//                case "jTextField_C" ->
//                    jTextField_D.requestFocus();
//                case "jTextField_D" ->
//                    jTextField_E.requestFocus();
//                case "jTextField_E" ->
//                    jButton_CalcularEquacao.requestFocus(); // ou qualquer outro componente apropriado
//                default -> {
//                }
//            }
//        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_B.requestFocus();
        }
    }//GEN-LAST:event_jTextField_AKeyPressed

    private void jButton_LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparCamposActionPerformed
        jTextField_A.setText("");
        jTextField_B.setText("");
        jTextField_C.setText("");
        jTextField_D.setText("");
        jTextField_E.setText("");
        jTextArea_Resolucao.setText("");

        jTextField_A.requestFocus();
    }//GEN-LAST:event_jButton_LimparCamposActionPerformed

    private void setCamposHabilitados(boolean a, boolean b, boolean c, boolean d, boolean e) {
        jTextField_A.setEnabled(a);
        jTextField_B.setEnabled(b);
        jTextField_C.setEnabled(c);
        jTextField_D.setEnabled(d);
        jTextField_E.setEnabled(e);
    }

    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(Equacao.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Equacao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CalcularEquacao;
    private javax.swing.JButton jButton_LimparCampos;
    private javax.swing.JComboBox<String> jComboBox_SelecionarEquacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Selecionado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Resolucao;
    private javax.swing.JTextField jTextField_A;
    private javax.swing.JTextField jTextField_B;
    private javax.swing.JTextField jTextField_C;
    private javax.swing.JTextField jTextField_D;
    private javax.swing.JTextField jTextField_E;
    // End of variables declaration//GEN-END:variables

}
