/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.visao;

import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.listener.ListenerTelaInternaCadastroDePessoas;


public class TelaInternaCadastroDePessoas extends javax.swing.JInternalFrame {

    private ListenerTelaInternaCadastroDePessoas listener = new ListenerTelaInternaCadastroDePessoas(this);
    Pessoa pessoa = new Pessoa();
    Endereco endereco = new Endereco();
    String sexo;

    public TelaInternaCadastroDePessoas() {
        this.setVisible(true);
        initComponents();
    }

    public Pessoa setInformacoesPessoa() {
        pessoa.setNome(txtNomeCliente.getText());
        pessoa.setCpf(txtCpfCliente.getText());
        pessoa.setRg(txtRgCliente.getText());
        pessoa.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        pessoa.setSexo(this.sexo);
        limparCampos();
        return pessoa;
    }

    public Endereco setInformacoesEndereco() {
        endereco.setRua(txtRuaCliente.getText());
        endereco.setCep(txtCepCliente.getText());
        endereco.setCidade(txtCidade.getText());
        endereco.setEstado(comboEstadoCliente.getSelectedItem().toString());
       // endereco.set(Integer.parseInt(jTextFieldCod.getText()));
        limparCampos();
        return endereco;
    }

    public void limparCampos() {
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtRgCliente.setText("");
        txtRuaCliente.setText("");
        txtCepCliente.setText("");
        txtCidade.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRgCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        checkBoxMasculino = new javax.swing.JCheckBox();
        checkBoxFeminino = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRuaCliente = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JTextField();
        comboEstadoCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();

        setClosable(true);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setActionCommand("Salvar");
        jButtonSalvar.addActionListener(listener);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setEnabled(false);
        jButtonBuscar.setActionCommand("Buscar");
        jButtonBuscar.addActionListener(listener);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Data e Hora: *****");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paciente"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        txtRgCliente.setEnabled(false);
        txtRgCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgClienteActionPerformed(evt);
            }
        });

        txtCpfCliente.setEnabled(false);

        txtNomeCliente.setEnabled(false);

        jLabel3.setText("RG:");

        checkBoxMasculino.setText("Masculino");
        checkBoxMasculino.setEnabled(false);
        checkBoxMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMasculinoActionPerformed(evt);
            }
        });

        checkBoxFeminino.setText("Feminino");
        checkBoxFeminino.setEnabled(false);
        checkBoxFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFemininoActionPerformed(evt);
            }
        });

        jLabel9.setText("Código");

        jTextFieldCod.setEditable(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente)
                    .addComponent(txtCpfCliente)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(checkBoxMasculino)
                .addGap(18, 18, 18)
                .addComponent(checkBoxFeminino)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxMasculino)
                    .addComponent(checkBoxFeminino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        jLabel4.setText("Rua:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("CEP:");

        txtRuaCliente.setEnabled(false);

        txtCidade.setEnabled(false);

        txtCepCliente.setEnabled(false);

        comboEstadoCliente.setEnabled(false);
        comboEstadoCliente.addItem("AL");
        comboEstadoCliente.addItem("AM");
        comboEstadoCliente.addItem("BA");
        comboEstadoCliente.addItem("CE");
        comboEstadoCliente.addItem("DF");
        comboEstadoCliente.addItem("ES");
        comboEstadoCliente.addItem("GO");
        comboEstadoCliente.addItem("MA");
        comboEstadoCliente.addItem("MT");
        comboEstadoCliente.addItem("MS");
        comboEstadoCliente.addItem("MG");
        comboEstadoCliente.addItem("PA");
        comboEstadoCliente.addItem("PB");
        comboEstadoCliente.addItem("PR");
        comboEstadoCliente.addItem("PE");
        comboEstadoCliente.addItem("PI");
        comboEstadoCliente.addItem("RJ");
        comboEstadoCliente.addItem("RN");
        comboEstadoCliente.addItem("RS");
        comboEstadoCliente.addItem("RO");
        comboEstadoCliente.addItem("RR");
        comboEstadoCliente.addItem("SC");
        comboEstadoCliente.addItem("SP");
        comboEstadoCliente.addItem("SE");
        comboEstadoCliente.addItem("TO");
        comboEstadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtRuaCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboEstadoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(146, 146, 146)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabel8)
                    .addComponent(jButtonNovo))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void txtRgClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgClienteActionPerformed

    }//GEN-LAST:event_txtRgClienteActionPerformed

    private void comboEstadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoClienteActionPerformed

    }//GEN-LAST:event_comboEstadoClienteActionPerformed

    private void checkBoxMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMasculinoActionPerformed
        if (checkBoxMasculino.isSelected()) {
            checkBoxFeminino.setSelected(false);
            sexo = "Masculino";
        }
    }//GEN-LAST:event_checkBoxMasculinoActionPerformed

    private void checkBoxFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFemininoActionPerformed
        if (checkBoxFeminino.isSelected()) {
            checkBoxMasculino.setSelected(false);
            sexo = "Feminino";
        }
    }//GEN-LAST:event_checkBoxFemininoActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        txtNomeCliente.setEnabled(true);
        txtCepCliente.setEnabled(true);
        txtCpfCliente.setEnabled(true);
        comboEstadoCliente.setEnabled(true);
        txtRgCliente.setEnabled(true);
        txtRuaCliente.setEnabled(true);
        comboEstadoCliente.setEnabled(true);
        checkBoxFeminino.setEnabled(true);
        checkBoxMasculino.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        txtCidade.setEnabled(true);       
        limparCampos();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxFeminino;
    private javax.swing.JCheckBox checkBoxMasculino;
    private javax.swing.JComboBox<String> comboEstadoCliente;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField txtCepCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpfCliente;
    public javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtRgCliente;
    private javax.swing.JTextField txtRuaCliente;
    // End of variables declaration//GEN-END:variables
}
