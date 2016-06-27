/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.visao;

import javax.swing.JOptionPane;
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.exceptions.ExceptionArmazenarInformacoes;
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

        if (txtRuaCliente.getText().isEmpty()
                || txtCepCliente.getText().isEmpty()
                || txtCidade.getText().isEmpty()
                || comboEstadoCliente.getSelectedItem().toString().isEmpty()) {
            return null;
        } else {
            endereco.setRua(txtRuaCliente.getText());
            endereco.setCep(txtCepCliente.getText());
            endereco.setCidade(txtCidade.getText());
            endereco.setEstado(comboEstadoCliente.getSelectedItem().toString());
            limparCampos();
            return endereco;
        }

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
        txtRuaCliente = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JTextField();
        comboEstadoCliente = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();

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
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRuaCliente)
                    .addComponent(txtCidade)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(comboEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
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
                .addGap(32, 32, 32))
        );

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void comboEstadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoClienteActionPerformed

    }//GEN-LAST:event_comboEstadoClienteActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxFeminino;
    private javax.swing.JCheckBox checkBoxMasculino;
    private javax.swing.JComboBox<String> comboEstadoCliente;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCepCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtRgCliente;
    private javax.swing.JTextField txtRuaCliente;
    // End of variables declaration//GEN-END:variables
}
