/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vindiesel.view;

import br.com.vindiesel.control.TelaEntregaControl;
import br.com.vindiesel.uteis.InterfaceJanela;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author ADJ-PC
 */
public class TelaEntregaFicha extends javax.swing.JDialog {

    TelaEntregaControl telaEntregaControl;

    /**
     * Creates new form TelaEntregaFicha
     */
    public TelaEntregaFicha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TelaEntregaFicha(JInternalFrame parent, boolean modal, TelaEntregaControl control) {
        initComponents();
        this.setLocationRelativeTo(parent);
        this.setModal(modal);
        telaEntregaControl = control;
        InterfaceJanela.alteraIconePrincipalDoFrame(this, "/br/com/vindiesel/img/delivery_truck_16x16.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        lblCodigoEncomenda = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblValorEncomenda = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lblPesoEncomenda = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lblLarguraEncomenda = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lblAlturaEncomenda = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lblProfundidadeEncomenda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDataEntrega = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCodigoPessoaRemetente = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblNomeRemetente = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblCidadeRemetente = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblBairroRemetente = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblRuaRemetente = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblComplementoRemetente = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblCepRemetente = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lblTelefoneRemetente = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblEstadoRemetente = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblNumeroRemetente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCodigoPessoaDestinatario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNomeDestinatario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCepDestinatario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblEstadoDestinatario = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNumeroDestinatario = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblCidadeDestinatario = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblBairroDestinatario = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblRuaDestinatario = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblComplementoDestinatario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha de Entrega");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encomenda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Codigo:");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 43, -1, -1));

        lblCodigoEncomenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCodigoEncomenda.setText("[Codigo]");
        jPanel4.add(lblCodigoEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 43, -1, -1));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setText("Valor:");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 68, -1, -1));

        lblValorEncomenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblValorEncomenda.setText("[Valor]");
        jPanel4.add(lblValorEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 68, -1, -1));

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel44.setText("Peso:");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 93, -1, -1));

        lblPesoEncomenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPesoEncomenda.setText("[Peso]");
        jPanel4.add(lblPesoEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 93, -1, -1));

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("Largura:");
        jPanel4.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 118, -1, -1));

        lblLarguraEncomenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLarguraEncomenda.setText("[Largura]");
        jPanel4.add(lblLarguraEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 118, -1, -1));

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setText("Altura:");
        jPanel4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 143, -1, -1));

        lblAlturaEncomenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlturaEncomenda.setText("[Altura]");
        jPanel4.add(lblAlturaEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 143, -1, -1));

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setText("Profundidade:");
        jPanel4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 168, -1, -1));

        lblProfundidadeEncomenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProfundidadeEncomenda.setText("[Profundidade]");
        jPanel4.add(lblProfundidadeEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 168, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Data Cadastro:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 193, -1, -1));

        lblDataCadastro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDataCadastro.setText("[DataCadastro]");
        jPanel4.add(lblDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 193, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Data Entrega:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 218, -1, -1));

        lblDataEntrega.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDataEntrega.setText("[DataEntrega]");
        jPanel4.add(lblDataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 218, -1, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 230, 250));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remetente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Codigo Pessoa:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        lblCodigoPessoaRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCodigoPessoaRemetente.setText("[CodigoPessoa]");
        jPanel3.add(lblCodigoPessoaRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 24, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Nome:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 49, -1, -1));

        lblNomeRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNomeRemetente.setText("[Nome]");
        jPanel3.add(lblNomeRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 49, -1, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("Cidade:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 99, -1, -1));

        lblCidadeRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCidadeRemetente.setText("[Cidade]");
        jPanel3.add(lblCidadeRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 99, -1, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("Bairro:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 124, -1, -1));

        lblBairroRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBairroRemetente.setText("[Bairro]");
        jPanel3.add(lblBairroRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 124, -1, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Rua:");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 149, -1, -1));

        lblRuaRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRuaRemetente.setText("[Rua]");
        jPanel3.add(lblRuaRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 149, -1, -1));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Complemento:");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 174, -1, -1));

        lblComplementoRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblComplementoRemetente.setText("[Complemento]");
        jPanel3.add(lblComplementoRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 174, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("Cep:");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 74, -1, -1));

        lblCepRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCepRemetente.setText("[Cep]");
        jPanel3.add(lblCepRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 74, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Telefone:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        lblTelefoneRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTelefoneRemetente.setText("[Telefone]");
        jPanel6.add(lblTelefoneRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Estado:");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 20));

        lblEstadoRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEstadoRemetente.setText("[Estado]");
        jPanel6.add(lblEstadoRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, 20));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Numero:");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));

        lblNumeroRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNumeroRemetente.setText("[Numero]");
        jPanel6.add(lblNumeroRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 240, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 610, 210));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ficha de Entrega");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 76));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 890, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destinátario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Pessoa:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        lblCodigoPessoaDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCodigoPessoaDestinatario.setText("[CodigoPessoa]");
        jPanel2.add(lblCodigoPessoaDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 24, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 49, -1, -1));

        lblNomeDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNomeDestinatario.setText("[Nome]");
        jPanel2.add(lblNomeDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 49, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Cep:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 74, -1, -1));

        lblCepDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCepDestinatario.setText("[Cep]");
        jPanel2.add(lblCepDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 74, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Estado:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 74, -1, -1));

        lblEstadoDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEstadoDestinatario.setText("[Estado]");
        jPanel2.add(lblEstadoDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 74, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Numero:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 99, -1, -1));

        lblNumeroDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNumeroDestinatario.setText("[Numero]");
        jPanel2.add(lblNumeroDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 99, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Cidade:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 99, -1, -1));

        lblCidadeDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCidadeDestinatario.setText("[Cidade]");
        jPanel2.add(lblCidadeDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 99, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Bairro:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 124, -1, -1));

        lblBairroDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBairroDestinatario.setText("[Bairro]");
        jPanel2.add(lblBairroDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 124, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Rua:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 149, -1, -1));

        lblRuaDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRuaDestinatario.setText("[Rua]");
        jPanel2.add(lblRuaDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 149, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Complemento:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 174, -1, -1));

        lblComplementoDestinatario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblComplementoDestinatario.setText("[Complemento]");
        jPanel2.add(lblComplementoDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 174, -1, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 610, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(TelaEntregaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntregaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntregaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntregaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEntregaFicha dialog = new TelaEntregaFicha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAlturaEncomenda;
    private javax.swing.JLabel lblBairroDestinatario;
    private javax.swing.JLabel lblBairroRemetente;
    private javax.swing.JLabel lblCepDestinatario;
    private javax.swing.JLabel lblCepRemetente;
    private javax.swing.JLabel lblCidadeDestinatario;
    private javax.swing.JLabel lblCidadeRemetente;
    private javax.swing.JLabel lblCodigoEncomenda;
    private javax.swing.JLabel lblCodigoPessoaDestinatario;
    private javax.swing.JLabel lblCodigoPessoaRemetente;
    private javax.swing.JLabel lblComplementoDestinatario;
    private javax.swing.JLabel lblComplementoRemetente;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblDataEntrega;
    private javax.swing.JLabel lblEstadoDestinatario;
    private javax.swing.JLabel lblEstadoRemetente;
    private javax.swing.JLabel lblLarguraEncomenda;
    private javax.swing.JLabel lblNomeDestinatario;
    private javax.swing.JLabel lblNomeRemetente;
    private javax.swing.JLabel lblNumeroDestinatario;
    private javax.swing.JLabel lblNumeroRemetente;
    private javax.swing.JLabel lblPesoEncomenda;
    private javax.swing.JLabel lblProfundidadeEncomenda;
    private javax.swing.JLabel lblRuaDestinatario;
    private javax.swing.JLabel lblRuaRemetente;
    private javax.swing.JLabel lblTelefoneRemetente;
    private javax.swing.JLabel lblValorEncomenda;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblAlturaEncomenda() {
        return lblAlturaEncomenda;
    }

    public void setLblAlturaEncomenda(JLabel lblAlturaEncomenda) {
        this.lblAlturaEncomenda = lblAlturaEncomenda;
    }

    public JLabel getLblBairroDestinatario() {
        return lblBairroDestinatario;
    }

    public void setLblBairroDestinatario(JLabel lblBairroDestinatario) {
        this.lblBairroDestinatario = lblBairroDestinatario;
    }

    public JLabel getLblBairroRemetente() {
        return lblBairroRemetente;
    }

    public void setLblBairroRemetente(JLabel lblBairroRemetente) {
        this.lblBairroRemetente = lblBairroRemetente;
    }

    public JLabel getLblCepDestinatario() {
        return lblCepDestinatario;
    }

    public void setLblCepDestinatario(JLabel lblCepDestinatario) {
        this.lblCepDestinatario = lblCepDestinatario;
    }

    public JLabel getLblCepRemetente() {
        return lblCepRemetente;
    }

    public void setLblCepRemetente(JLabel lblCepRemetente) {
        this.lblCepRemetente = lblCepRemetente;
    }

    public JLabel getLblCidadeDestinatario() {
        return lblCidadeDestinatario;
    }

    public void setLblCidadeDestinatario(JLabel lblCidadeDestinatario) {
        this.lblCidadeDestinatario = lblCidadeDestinatario;
    }

    public JLabel getLblCidadeRemetente() {
        return lblCidadeRemetente;
    }

    public void setLblCidadeRemetente(JLabel lblCidadeRemetente) {
        this.lblCidadeRemetente = lblCidadeRemetente;
    }

    public JLabel getLblCodigoEncomenda() {
        return lblCodigoEncomenda;
    }

    public void setLblCodigoEncomenda(JLabel lblCodigoEncomenda) {
        this.lblCodigoEncomenda = lblCodigoEncomenda;
    }

    public JLabel getLblCodigoPessoaDestinatario() {
        return lblCodigoPessoaDestinatario;
    }

    public void setLblCodigoPessoaDestinatario(JLabel lblCodigoPessoaDestinatario) {
        this.lblCodigoPessoaDestinatario = lblCodigoPessoaDestinatario;
    }

    public JLabel getLblCodigoPessoaRemetente() {
        return lblCodigoPessoaRemetente;
    }

    public void setLblCodigoPessoaRemetente(JLabel lblCodigoPessoaRemetente) {
        this.lblCodigoPessoaRemetente = lblCodigoPessoaRemetente;
    }

    public JLabel getLblComplementoDestinatario() {
        return lblComplementoDestinatario;
    }

    public void setLblComplementoDestinatario(JLabel lblComplementoDestinatario) {
        this.lblComplementoDestinatario = lblComplementoDestinatario;
    }

    public JLabel getLblComplementoRemetente() {
        return lblComplementoRemetente;
    }

    public void setLblComplementoRemetente(JLabel lblComplementoRemetente) {
        this.lblComplementoRemetente = lblComplementoRemetente;
    }

    public JLabel getLblEstadoDestinatario() {
        return lblEstadoDestinatario;
    }

    public void setLblEstadoDestinatario(JLabel lblEstadoDestinatario) {
        this.lblEstadoDestinatario = lblEstadoDestinatario;
    }

    public JLabel getLblEstadoRemetente() {
        return lblEstadoRemetente;
    }

    public void setLblEstadoRemetente(JLabel lblEstadoRemetente) {
        this.lblEstadoRemetente = lblEstadoRemetente;
    }

    public JLabel getLblLarguraEncomenda() {
        return lblLarguraEncomenda;
    }

    public void setLblLarguraEncomenda(JLabel lblLarguraEncomenda) {
        this.lblLarguraEncomenda = lblLarguraEncomenda;
    }

    public JLabel getLblNomeDestinatario() {
        return lblNomeDestinatario;
    }

    public void setLblNomeDestinatario(JLabel lblNomeDestinatario) {
        this.lblNomeDestinatario = lblNomeDestinatario;
    }

    public JLabel getLblNomeRemetente() {
        return lblNomeRemetente;
    }

    public void setLblNomeRemetente(JLabel lblNomeRemetente) {
        this.lblNomeRemetente = lblNomeRemetente;
    }

    public JLabel getLblNumeroDestinatario() {
        return lblNumeroDestinatario;
    }

    public void setLblNumeroDestinatario(JLabel lblNumeroDestinatario) {
        this.lblNumeroDestinatario = lblNumeroDestinatario;
    }

    public JLabel getLblNumeroRemetente() {
        return lblNumeroRemetente;
    }

    public void setLblNumeroRemetente(JLabel lblNumeroRemetente) {
        this.lblNumeroRemetente = lblNumeroRemetente;
    }

    public JLabel getLblPesoEncomenda() {
        return lblPesoEncomenda;
    }

    public void setLblPesoEncomenda(JLabel lblPesoEncomenda) {
        this.lblPesoEncomenda = lblPesoEncomenda;
    }

    public JLabel getLblProfundidadeEncomenda() {
        return lblProfundidadeEncomenda;
    }

    public void setLblProfundidadeEncomenda(JLabel lblProfundidadeEncomenda) {
        this.lblProfundidadeEncomenda = lblProfundidadeEncomenda;
    }

    public JLabel getLblRuaDestinatario() {
        return lblRuaDestinatario;
    }

    public void setLblRuaDestinatario(JLabel lblRuaDestinatario) {
        this.lblRuaDestinatario = lblRuaDestinatario;
    }

    public JLabel getLblRuaRemetente() {
        return lblRuaRemetente;
    }

    public void setLblRuaRemetente(JLabel lblRuaRemetente) {
        this.lblRuaRemetente = lblRuaRemetente;
    }

    public JLabel getLblValorEncomenda() {
        return lblValorEncomenda;
    }

    public void setLblValorEncomenda(JLabel lblValorEncomenda) {
        this.lblValorEncomenda = lblValorEncomenda;
    }

    public JLabel getLblTelefoneRemetente() {
        return lblTelefoneRemetente;
    }

    public void setLblTelefoneRemetente(JLabel lblTelefoneRemetente) {
        this.lblTelefoneRemetente = lblTelefoneRemetente;
    }

    public JLabel getLblDataCadastro() {
        return lblDataCadastro;
    }

    public void setLblDataCadastro(JLabel lblDataCadastro) {
        this.lblDataCadastro = lblDataCadastro;
    }

    public JLabel getLblDataEntrega() {
        return lblDataEntrega;
    }

    public void setLblDataEntrega(JLabel lblDataEntrega) {
        this.lblDataEntrega = lblDataEntrega;
    }

}
