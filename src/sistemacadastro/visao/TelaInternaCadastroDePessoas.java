/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.visao;

import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.controle.Conexao;
import sistemacadastro.exceptions.ExceptionArmazenarInformacoes;
import sistemacadastro.listener.ListenerTelaInternaCadastroDePessoas;

public class TelaInternaCadastroDePessoas extends javax.swing.JInternalFrame {

    private ListenerTelaInternaCadastroDePessoas listener = new ListenerTelaInternaCadastroDePessoas(this);
    Pessoa pessoa = new Pessoa();
    Endereco endereco = new Endereco();
    Conexao conn = new Conexao();
    String sexo;

    public TelaInternaCadastroDePessoas() {
        this.setVisible(true);
        initComponents();
    }
    

    public Pessoa setInformacoesPessoa() throws ExceptionArmazenarInformacoes {

        String teste = txtNomeCliente.getText();
        if (txtNomeCliente.getText().isEmpty()
                || txtCpfCliente.getText().isEmpty()
                || txtNomeCliente.getText().isEmpty()
                || txtRgCliente.getText().isEmpty()
                || sexo.isEmpty()) {
            return null;

        } else {
            pessoa.setNome(txtNomeCliente.getText());
            pessoa.setCpf(txtCpfCliente.getText());
            pessoa.setRg(txtRgCliente.getText());
            pessoa.setSexo(this.sexo);
            limparCampos();
            return pessoa;                        
        }
    }

    public Endereco setInformacoesEndereco() throws ExceptionArmazenarInformacoes {

        if (jTextFieldRua.getText().isEmpty()
                || jTextFieldCep.getText().isEmpty()
                || jTextFieldCidade.getText().isEmpty()
                || jComboBoxEstado.getSelectedItem().toString().isEmpty()) {
            return null;
        } else {
            
            endereco.setRua(jTextFieldRua.getText());
            endereco.setCep(jTextFieldCep.getText());
            endereco.setCidade(jTextFieldCidade.getText());
            endereco.setEstado(jComboBoxEstado.getSelectedItem().toString());
            limparCampos();
            return endereco;
        }
    }
    

    public void limparCampos() {
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtRgCliente.setText("");
//        jtxtRuaClient.setText("");
//        txtCepCliente.setText("");
//        txtCidade.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRgCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        checkBoxMasculino = new javax.swing.JCheckBox();
        checkBoxFeminino = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldCep = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();

        setClosable(true);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setActionCommand("Salvar");
        jButtonSalvar.addActionListener(listener);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");

        jButtonEditar.setText("Editar");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("Buscar");
        jButtonBuscar.addActionListener(listener);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paciente"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        txtRgCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("RG:");

        checkBoxMasculino.setText("Masculino");
        checkBoxMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMasculinoActionPerformed(evt);
            }
        });

        checkBoxFeminino.setText("Feminino");
        checkBoxFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFemininoActionPerformed(evt);
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
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkBoxMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxFeminino)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNomeCliente)
                    .addComponent(txtCpfCliente)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        jLabel4.setText("Rua:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("CEP:");

        jLabel7.setText("Estado:");

        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCep, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldCidade))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jComboBoxEstado.addItem("AL");
        jComboBoxEstado.addItem("AM");
        jComboBoxEstado.addItem("BA");
        jComboBoxEstado.addItem("CE");
        jComboBoxEstado.addItem("DF");
        jComboBoxEstado.addItem("ES");
        jComboBoxEstado.addItem("GO");
        jComboBoxEstado.addItem("MA");
        jComboBoxEstado.addItem("MT");
        jComboBoxEstado.addItem("MS");
        jComboBoxEstado.addItem("MG");
        jComboBoxEstado.addItem("PA");
        jComboBoxEstado.addItem("PB");
        jComboBoxEstado.addItem("PR");
        jComboBoxEstado.addItem("PE");
        jComboBoxEstado.addItem("PI");
        jComboBoxEstado.addItem("RJ");
        jComboBoxEstado.addItem("RN");
        jComboBoxEstado.addItem("RS");
        jComboBoxEstado.addItem("RO");
        jComboBoxEstado.addItem("RR");
        jComboBoxEstado.addItem("SC");
        jComboBoxEstado.addItem("SP");
        jComboBoxEstado.addItem("SE");
        jComboBoxEstado.addItem("TO");

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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jButtonBuscar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void checkBoxFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFemininoActionPerformed
        if (checkBoxFeminino.isSelected()) {
            checkBoxMasculino.setSelected(false);
            sexo = "Feminino";
        }
    }//GEN-LAST:event_checkBoxFemininoActionPerformed

    private void checkBoxMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMasculinoActionPerformed
        if (checkBoxMasculino.isSelected()) {
            checkBoxFeminino.setSelected(false);
            sexo = "Masculino";
        }
    }//GEN-LAST:event_checkBoxMasculinoActionPerformed

    private void txtRgClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgClienteActionPerformed

    }//GEN-LAST:event_txtRgClienteActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxFeminino;
    private javax.swing.JCheckBox checkBoxMasculino;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField txtCpfCliente;
    public javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtRgCliente;
    // End of variables declaration//GEN-END:variables
}
