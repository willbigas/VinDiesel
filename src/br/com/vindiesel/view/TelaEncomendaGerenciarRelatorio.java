/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vindiesel.view;

import br.com.vindiesel.control.report.TelaEncomendaGerenciarRelatorioControl;
import br.com.vindiesel.uteis.InterfaceJanela;
import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class TelaEncomendaGerenciarRelatorio extends javax.swing.JInternalFrame {

    TelaEncomendaGerenciarRelatorioControl encomendaGerenciarRelatorioControl;

    /**
     * Creates new form TelaDestinatarioGerenciarRelatorio
     */
    public TelaEncomendaGerenciarRelatorio() {
        initComponents();
    }

    public TelaEncomendaGerenciarRelatorio(TelaEncomendaGerenciarRelatorioControl control) {
        initComponents();
        initComponents();
        encomendaGerenciarRelatorioControl = control;
        InterfaceJanela.alteraIconePrincipaldoJInternalFrame(this, "br/com/vindiesel/img/delivery_truck_16x16.png");
        InterfaceJanela.centralizarInternalFrame(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoRastreio = new javax.swing.JTextField();
        btGerarRelatorio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Relatório de Encomendas");

        jLabel2.setText("Codigo Rastreio:");

        btGerarRelatorio.setText("Gerar");
        btGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoRastreio, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btGerarRelatorio)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigoRastreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btGerarRelatorio)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarRelatorioActionPerformed
        // TODO add your handling code here:
        encomendaGerenciarRelatorioControl.acionarRelatorioAction();

    }//GEN-LAST:event_btGerarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfCodigoRastreio;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfCodigoRastreio() {
        return tfCodigoRastreio;
    }

    public void setTfCodigoRastreio(JTextField tfCodigoRastreio) {
        this.tfCodigoRastreio = tfCodigoRastreio;
    }

}
