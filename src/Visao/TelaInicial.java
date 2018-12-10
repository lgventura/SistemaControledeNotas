/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControleAlmoxarifado;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lgustavo
 */
public class TelaInicial extends javax.swing.JFrame {

    CadFornecedor fornecedor = null;
    CadAlmoxarifado almoxarifado = null;
    AddNotaEntrada nota_entrada = null;
    ControleAlmoxarifado almo = null;
    ResultSet rs = null;
    
    public TelaInicial() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        fornecedor = new CadFornecedor();
        almoxarifado = new CadAlmoxarifado();
        nota_entrada = new AddNotaEntrada();
        almo = new ControleAlmoxarifado();
        panel2.setVisible(false);
        panel1.setVisible(false);
        
        rs = almo.consultar();
        try {
            while(rs.next()){
            
                ComboDep.addItem(rs.getString("nome"));
            }
        } catch (SQLException ex) {}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exercicio = new javax.swing.JLabel();
        depe = new javax.swing.JLabel();
        btnDependencia = new javax.swing.JButton();
        btnExercicio = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        btnOKK = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ComboDep = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuAddNota = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFornecedor = new javax.swing.JMenuItem();
        menuAlmoxarifado = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("EXERCÍCIO:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setText("DEPENDENCIA:");

        exercicio.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        depe.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        btnDependencia.setText("Alterar Dependencia");
        btnDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDependenciaActionPerformed(evt);
            }
        });

        btnExercicio.setText("Alterar Exercicio");
        btnExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicioActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        btnOKK.setText("OK");
        btnOKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKKActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escolha o exercício");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnOKK))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addComponent(btnOKK)
                .addGap(17, 17, 17))
        );

        panel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Escolha a Dependencia:");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(ComboDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jMenu3.setText("Nota de Entrada");

        menuAddNota.setText("+ Adicionar Nota de Entrada");
        menuAddNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNotaActionPerformed(evt);
            }
        });
        jMenu3.add(menuAddNota);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Cadastros");

        menuFornecedor.setText("Fornecedor");
        menuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedorActionPerformed(evt);
            }
        });
        jMenu2.add(menuFornecedor);

        menuAlmoxarifado.setText("Almoxarifado");
        menuAlmoxarifado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlmoxarifadoActionPerformed(evt);
            }
        });
        jMenu2.add(menuAlmoxarifado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExercicio)
                                .addGap(29, 29, 29)
                                .addComponent(btnDependencia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(exercicio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(depe))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExercicio)
                    .addComponent(btnDependencia))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(exercicio))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(depe))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedorActionPerformed
        janelas(fornecedor);
    }//GEN-LAST:event_menuFornecedorActionPerformed

    private void menuAlmoxarifadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlmoxarifadoActionPerformed
        janelas(almoxarifado);
    }//GEN-LAST:event_menuAlmoxarifadoActionPerformed

    private void menuAddNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNotaActionPerformed
        if(exercicio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione Um Ano de Exercicio", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else if(depe.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione uma Dependencia", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else {
            janelas(nota_entrada);
            nota_entrada.getLblDep().setText(depe.getText());
            nota_entrada.getLblEx().setText(exercicio.getText());
        }
    }//GEN-LAST:event_menuAddNotaActionPerformed

    private void btnExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicioActionPerformed
        panel1.setVisible(true);
    }//GEN-LAST:event_btnExercicioActionPerformed

    private void btnOKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKKActionPerformed

        panel1.setVisible(false);
        panel1.setEnabled(false);

        exercicio.setText(Integer.toString(anoC.getYear()));
        
        this.setVisible(true);
        this.setEnabled(true);
        
        
    }//GEN-LAST:event_btnOKKActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        panel2.setVisible(false);
        panel2.setEnabled(false);

        depe.setText(ComboDep.getSelectedItem().toString());
        
        this.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDependenciaActionPerformed
        panel2.setVisible(true);
        panel2.setEnabled(true);

    }//GEN-LAST:event_btnDependenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    
    private void janelas(JFrame janelaAberta){
        
        fornecedor.dispose();
        almoxarifado.dispose();
        
        janelaAberta.setEnabled(true);
        janelaAberta.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDep;
    private javax.swing.JButton btnDependencia;
    private javax.swing.JButton btnExercicio;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnOKK;
    private javax.swing.JLabel depe;
    private javax.swing.JLabel exercicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuAddNota;
    private javax.swing.JMenuItem menuAlmoxarifado;
    private javax.swing.JMenuItem menuFornecedor;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables

}
