/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercado.view;

import br.com.mercado.control.TelaCategoriaRelatorioControl;
import br.com.mercado.model.Categoria;
import br.com.mercado.uteis.InterfaceJanela;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class TelaCategoriaRelatorio extends javax.swing.JInternalFrame {
    
    TelaCategoriaRelatorioControl categoriaRelatorioControl;

    /**
     * Creates new form TelaCategoriaRelatorio
     */
    public TelaCategoriaRelatorio() {
        initComponents();
    }
    public TelaCategoriaRelatorio(TelaCategoriaRelatorioControl control) {
        initComponents();
        categoriaRelatorioControl = control;
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

        buttonGroupAtivo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioFalse = new javax.swing.JRadioButton();
        radioTrue = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btChamarRelatorio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Relatório de Categoria");

        radioFalse.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioFalse.setText("Desativado");

        radioTrue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioTrue.setText("Ativado");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ATIVO:");

        cbCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CATEGORIA:");

        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("NOME:");

        btChamarRelatorio.setText("Relatório");
        btChamarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChamarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome)
                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btChamarRelatorio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioTrue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioFalse)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioFalse)
                    .addComponent(radioTrue)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(btChamarRelatorio)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btChamarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChamarRelatorioActionPerformed
        // TODO add your handling code here:
        categoriaRelatorioControl.chamarRelatorioAction();
    }//GEN-LAST:event_btChamarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChamarRelatorio;
    private javax.swing.ButtonGroup buttonGroupAtivo;
    public static javax.swing.JComboBox<Categoria> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton radioFalse;
    private javax.swing.JRadioButton radioTrue;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getButtonGroupAtivo() {
        return buttonGroupAtivo;
    }

    public void setButtonGroupAtivo(ButtonGroup buttonGroupAtivo) {
        this.buttonGroupAtivo = buttonGroupAtivo;
    }

    public JRadioButton getRadioFalse() {
        return radioFalse;
    }

    public void setRadioFalse(JRadioButton radioFalse) {
        this.radioFalse = radioFalse;
    }

    public JRadioButton getRadioTrue() {
        return radioTrue;
    }

    public void setRadioTrue(JRadioButton radioTrue) {
        this.radioTrue = radioTrue;
    }

    public JComboBox<Categoria> getCbCategoria() {
        return cbCategoria;
    }

    public void setCbCategoria(JComboBox<Categoria> cbCategoria) {
        this.cbCategoria = cbCategoria;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }
    
    

}
