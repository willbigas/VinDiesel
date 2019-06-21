package br.com.vindiesel.view;

import br.com.vindiesel.control.TelaTipoUsuarioGerenciarControl;
import br.com.vindiesel.model.TipoPermissao;
import br.com.vindiesel.uteis.InterfaceJanela;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author william.mauro
 */
public class TelaTipoUsuarioGerenciar extends javax.swing.JInternalFrame {

    TelaTipoUsuarioGerenciarControl tipoUsuarioGerenciarControl;

    /**
     * Creates new form TelaTipoFuncionarioGerenciar
     */
    public TelaTipoUsuarioGerenciar() {
        initComponents();
    }

    public TelaTipoUsuarioGerenciar(TelaTipoUsuarioGerenciarControl control) {
        initComponents();
        tipoUsuarioGerenciarControl = control;  
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

        jLabel3 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btCarregar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        checkAtivo = new javax.swing.JCheckBox();
        btGravar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoUsuario = new javax.swing.JTable();
        cbPermissao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Pesquisar:");

        tfPesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("NOME:");

        btCarregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vindiesel/img/visualizar_32x32.png"))); // NOI18N
        btCarregar.setText("Visualizar");
        btCarregar.setBorder(null);
        btCarregar.setBorderPainted(false);
        btCarregar.setContentAreaFilled(false);
        btCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarActionPerformed(evt);
            }
        });

        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        checkAtivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkAtivo.setText("ATIVO");

        btGravar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        tblTipoUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblTipoUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTipoUsuario);

        cbPermissao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbPermissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbPermissaoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TIPO PERMISSAO:");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vindiesel/img/desativar_32x32.png"))); // NOI18N
        jButton1.setText("Desativar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(183, 28, 28));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gerenciar Tipo de Usuário");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNome)
                    .addComponent(cbPermissao, 0, 217, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(checkAtivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(btCarregar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(17, 17, 17))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAtivo))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addComponent(btGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCarregar)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        // TODO add your handling code here:
        tipoUsuarioGerenciarControl.gravarTipoUsuarioAction();
    }//GEN-LAST:event_btGravarActionPerformed

    private void btCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarActionPerformed
        // TODO add your handling code here:
        tipoUsuarioGerenciarControl.carregarTipoUsuarioAction();
    }//GEN-LAST:event_btCarregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tipoUsuarioGerenciarControl.desativarTipoUsuarioAction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbPermissaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbPermissaoKeyReleased
        // TODO add your handling code here:
        tipoUsuarioGerenciarControl.pesquisarItensNaComboTipoUsuario();
    }//GEN-LAST:event_cbPermissaoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarregar;
    private javax.swing.JButton btGravar;
    private javax.swing.JComboBox<TipoPermissao> cbPermissao;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTipoUsuario;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

    public JComboBox<TipoPermissao> getCbPermissao() {
        return cbPermissao;
    }

    public void setCbPermissao(JComboBox<TipoPermissao> cbPermissao) {
        this.cbPermissao = cbPermissao;
    }

    public JCheckBox getCheckAtivo() {
        return checkAtivo;
    }

    public void setCheckAtivo(JCheckBox checkAtivo) {
        this.checkAtivo = checkAtivo;
    }

    public JTable getTblTipoUsuario() {
        return tblTipoUsuario;
    }

    public void setTblTipoUsuario(JTable tblTipoUsuario) {
        this.tblTipoUsuario = tblTipoUsuario;
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

    
    
}
