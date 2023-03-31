package teste;

import classes.EquacaoPrimeiroGrau;
import com.formdev.flatlaf.IntelliJTheme;
import equacionando.Equacao;
import javax.swing.JOptionPane;

public class JTextPane extends javax.swing.JFrame {

    public JTextPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox_Selecao = new javax.swing.JComboBox<>();
        jButton_Calcule = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_Info = new javax.swing.JTextPane();
        jLabel_Tipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jComboBox_Selecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRE COM EQUAÇÃO", "Eq 1° Grau" }));
        jComboBox_Selecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SelecaoActionPerformed(evt);
            }
        });

        jButton_Calcule.setText("Calcule");
        jButton_Calcule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CalculeActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane_Info);

        jLabel_Tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_Selecao, 0, 167, Short.MAX_VALUE)
                            .addComponent(jLabel_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 368, Short.MAX_VALUE))
                            .addComponent(jButton_Calcule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Calcule, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Selecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CalculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CalculeActionPerformed
        int selectedIndex = jComboBox_Selecao.getSelectedIndex();
        double A, B;

        if (selectedIndex == 0) {
            JOptionPane.showMessageDialog(this, "É necessário escolher uma equação para calcular.!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        switch (selectedIndex) {
            case 1 -> {
                if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "É necessário entrar com valores nos campos.!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jTextField1.requestFocus();
                    return;
                }
                A = Double.parseDouble(jTextField1.getText());
                B = Double.parseDouble(jTextField2.getText());
                EquacaoPrimeiroGrau epg = new EquacaoPrimeiroGrau(A, B);
                jTextPane_Info.setText(epg.resolverEquacao());
            }
            default -> {
                jLabel_Tipo.setText("");
                setCamposHabilitados(false, false);
            }
        }
    }//GEN-LAST:event_jButton_CalculeActionPerformed

    private void jComboBox_SelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SelecaoActionPerformed
        String itemSelecionado = (String) jComboBox_Selecao.getSelectedItem();

        switch (itemSelecionado) {
            case "Eq 1° Grau" -> {
                jLabel_Tipo.setText("ax + b = 0");
                setCamposHabilitados(true, true);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextPane_Info.setText("");
                jTextField1.requestFocus();
            }
            default -> {
                jLabel_Tipo.setText("");
                setCamposHabilitados(false, false);
            }
        }
    }//GEN-LAST:event_jComboBox_SelecaoActionPerformed

    private void setCamposHabilitados(boolean a, boolean b) {
        jTextField1.setEnabled(a);
        jTextField1.setEnabled(b);
    }

    public static void main(String args[]) {

        try {
            IntelliJTheme.setup(Equacao.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JTextPane().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Calcule;
    private javax.swing.JComboBox<String> jComboBox_Selecao;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane_Info;
    // End of variables declaration//GEN-END:variables
}
