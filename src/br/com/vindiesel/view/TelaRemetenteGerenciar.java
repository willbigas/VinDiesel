/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vindiesel.view;

import br.com.vindiesel.control.TelaRemetenteGerenciarControl;
import br.com.vindiesel.uteis.InterfaceJanela;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Will
 */
public class TelaRemetenteGerenciar extends javax.swing.JInternalFrame {

    TelaRemetenteGerenciarControl fornecedorGerenciarControl;

    /**
     * Creates new form TelaFornecedorGerenciar
     */
    public TelaRemetenteGerenciar() {
        initComponents();
    }

    public TelaRemetenteGerenciar(TelaRemetenteGerenciarControl control) {
        initComponents();
        fornecedorGerenciarControl = control;
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btVisualizar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        btDesativar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tfCep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRemetente = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfCodigoPessoa = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vindiesel/img/lupa_32x32.png"))); // NOI18N
        jLabel5.setText("Pesquisar:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Gerenciar Remetentes");

        tfPesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("NOME:");

        btVisualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vindiesel/img/visualizar_32x32.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setBorder(null);
        btVisualizar.setBorderPainted(false);
        btVisualizar.setContentAreaFilled(false);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        tfNome.setColumns(15);
        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btDesativar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vindiesel/img/desativar_32x32.png"))); // NOI18N
        btDesativar.setText("Desativar");
        btDesativar.setBorder(null);
        btDesativar.setBorderPainted(false);
        btDesativar.setContentAreaFilled(false);
        btDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesativarActionPerformed(evt);
            }
        });

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vindiesel/img/save_32x32.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.setBorder(null);
        btGravar.setBorderPainted(false);
        btGravar.setContentAreaFilled(false);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        tfCep.setColumns(15);
        tfCep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCep.setToolTipText("Clicando enter busca o Cep automaticamente, caso não encontrar é necessário digitar o endereço completo.");
        tfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCepKeyReleased(evt);
            }
        });

        tblRemetente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblRemetente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRemetente);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("TEL");

        tfTelefone.setColumns(15);
        tfTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CEP:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("RUA:");

        tfRua.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tfBairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tfCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tfNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tfComplemento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfComplemento.setToolTipText("Campo nao obrigatorio");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ESTADO:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("BAIRRO:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("CIDADE:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("COMPL:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("NUM:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel12.setText("[Buscador de Cep]");

        cbEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel13.setText("[Informações de Endereço]");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel14.setText("[Enter para buscar]");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("CPF/CNPJ");

        tfCodigoPessoa.setColumns(15);
        tfCodigoPessoa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jScrollPane1)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btDesativar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel15)
                                .addGap(6, 6, 6)
                                .addComponent(tfCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(180, 180, 180))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel11)
                                .addGap(6, 6, 6)
                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel10)
                                .addGap(5, 5, 5)
                                .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15))
                    .addComponent(tfCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVisualizar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDesativar)
                        .addComponent(btGravar)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        fornecedorGerenciarControl.gravarFornecedorAction();
    }//GEN-LAST:event_btGravarActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        fornecedorGerenciarControl.carregarFornecedorAction();
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void btDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesativarActionPerformed
        fornecedorGerenciarControl.desativarFornecedorAction();
    }//GEN-LAST:event_btDesativarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        fornecedorGerenciarControl.pesquisarFornecedorAction();
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void tfCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCepKeyReleased
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fornecedorGerenciarControl.buscarCepAction();
        }
    }//GEN-LAST:event_tfCepKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDesativar;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblRemetente;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigoPessoa;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables


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

    public JTextField getTfTelefone() {
        return tfTelefone;
    }

    public void setTfTelefone(JTextField tfTelefone) {
        this.tfTelefone = tfTelefone;
    }

    public JTextField getTfBairro() {
        return tfBairro;
    }

    public void setTfBairro(JTextField tfBairro) {
        this.tfBairro = tfBairro;
    }

    public JTextField getTfCep() {
        return tfCep;
    }

    public void setTfCep(JTextField tfCep) {
        this.tfCep = tfCep;
    }

    public JTextField getTfCidade() {
        return tfCidade;
    }

    public void setTfCidade(JTextField tfCidade) {
        this.tfCidade = tfCidade;
    }

    public JTextField getTfComplemento() {
        return tfComplemento;
    }

    public void setTfComplemento(JTextField tfComplemento) {
        this.tfComplemento = tfComplemento;
    }

    public JComboBox<String> getCbEstado() {
        return cbEstado;
    }

    public void setCbEstado(JComboBox<String> cbEstado) {
        this.cbEstado = cbEstado;
    }

    public JTextField getTfNumero() {
        return tfNumero;
    }

    public void setTfNumero(JTextField tfNumero) {
        this.tfNumero = tfNumero;
    }

    public JTextField getTfRua() {
        return tfRua;
    }

    public void setTfRua(JTextField tfRua) {
        this.tfRua = tfRua;
    }

    public JTextField getTfCodigoPessoa() {
        return tfCodigoPessoa;
    }

    public void setTfCodigoPessoa(JTextField tfCodigoPessoa) {
        this.tfCodigoPessoa = tfCodigoPessoa;
    }

    public JTable getTblRemetente() {
        return tblRemetente;
    }

    public void setTblRemetente(JTable tblRemetente) {
        this.tblRemetente = tblRemetente;
    }
    
    
    
    

}
