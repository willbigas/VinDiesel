/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercado.view;

import br.com.mercado.control.TelaCategoriaGerenciarControl;
import br.com.mercado.factory.Conexao;
import br.com.mercado.uteis.InterfaceJanela;
import br.com.mercado.uteis.Relatorio;
import java.sql.Connection;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author william.mauro
 */
public class TelaCategoriaGerenciar extends javax.swing.JInternalFrame {

    TelaCategoriaGerenciarControl categoriaGerenciarControl;

    /**
     * Creates new form TelaCategoriaGerenciar
     */
    public TelaCategoriaGerenciar() {
        initComponents();
    }

    public TelaCategoriaGerenciar(TelaCategoriaGerenciarControl control) {
        initComponents();
        categoriaGerenciarControl = control;
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

        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        checkAtivo = new javax.swing.JCheckBox();
        btGravar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        btCarregar = new javax.swing.JButton();
        btDesativar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        checkAtivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkAtivo.setText("Ativo");
        checkAtivo.setToolTipText("Permite indicar a ativação do produto no sistema e habilitalo para venda");

        btGravar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mercado/img/save_32x32.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.setBorder(null);
        btGravar.setBorderPainted(false);
        btGravar.setContentAreaFilled(false);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCategoria);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Pesquisar:");

        tfPesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        btCarregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mercado/img/visualizar_32x32.png"))); // NOI18N
        btCarregar.setText("Visualizar");
        btCarregar.setBorder(null);
        btCarregar.setBorderPainted(false);
        btCarregar.setContentAreaFilled(false);
        btCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarActionPerformed(evt);
            }
        });

        btDesativar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mercado/img/desativar_32x32.png"))); // NOI18N
        btDesativar.setText("Desativar");
        btDesativar.setBorder(null);
        btDesativar.setBorderPainted(false);
        btDesativar.setContentAreaFilled(false);
        btDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesativarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 112, 13));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gerenciamento de Categorias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setText("[F4 - ATUALIZAR TABELA]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCarregar)
                        .addGap(18, 18, 18)
                        .addComponent(btDesativar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkAtivo))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCarregar)
                            .addComponent(btDesativar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btGravar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        categoriaGerenciarControl.gravarCategoriaAction();
    }//GEN-LAST:event_btGravarActionPerformed

    private void btCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarActionPerformed
            categoriaGerenciarControl.carregarCategoriaAction();
    }//GEN-LAST:event_btCarregarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        categoriaGerenciarControl.pesquisarCategoriaAction();
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void btDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesativarActionPerformed
        // TODO add your handling code here:
        categoriaGerenciarControl.desativarCategoriaAction();
    }//GEN-LAST:event_btDesativarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarregar;
    private javax.swing.JButton btDesativar;
    private javax.swing.JButton btGravar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

    public JCheckBox getCheckAtivo() {
        return checkAtivo;
    }

    public void setCheckAtivo(JCheckBox checkAtivo) {
        this.checkAtivo = checkAtivo;
    }

    public JTable getTblCategoria() {
        return tblCategoria;
    }

    public void setTblCategoria(JTable tblCategoria) {
        this.tblCategoria = tblCategoria;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public JTextField getTfPesquisar() {
        return tfPesquisar;
    }

    public void setTfPesquisar(JTextField tfPesquisar) {
        this.tfPesquisar = tfPesquisar;
    }

    private JasperViewer JasperViewer(JasperPrint jasperPrint, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
