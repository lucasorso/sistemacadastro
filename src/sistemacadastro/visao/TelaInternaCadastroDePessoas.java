/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.visao;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.arquivos.Pessoa_endereco;
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
        formMask();
    }
    
    public void formMask() {
        try {
            MaskFormatter formCpf = new MaskFormatter("###.###.###-##");//elemento resp por criar o formato da mascara
            jFormattedTextFieldCpf.setFormatterFactory(new DefaultFormatterFactory(formCpf));// atribui a mascara ao campo, jformated
            MaskFormatter formRg = new MaskFormatter("##########");
            jFormattedTextFieldRg.setFormatterFactory(new DefaultFormatterFactory(formRg));
            MaskFormatter formCep = new MaskFormatter("##.###-###");
            jFormattedTextFieldCep00.setFormatterFactory(new DefaultFormatterFactory(formCep));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar mascara frm Cliente linha 393 \nERRO:" + ex);
        }
    }
    
    public void getLista(java.util.List<Pessoa> listaPessoas) {
        jTextAreaDados.append("Código  |   Nome      |      CPF     |     RG    |     Sexo      \n");
        for (int i = 0; i < listaPessoas.size(); i++) {
            jTextAreaDados.append(listaPessoas.get(i).toString() + "\n");
        }
    }
    
    public void getInfo(Pessoa p_e) {
        jTextFieldCod.setText(String.valueOf(p_e.getId()));
        txtNomeCliente.setText(p_e.getNome());
        jFormattedTextFieldCpf.setText(p_e.getCpf());
        jFormattedTextFieldRg.setText(p_e.getRg());
        jTextFieldRua00.setText(p_e.getRua());
        if (p_e.getSexo().equals("Masculino")) {
            checkBoxMasculino.setSelected(true);
        } else {
            checkBoxFeminino.setSelected(true);
        }
        jTextFieldCidade00.setText(p_e.getCidade());
        jFormattedTextFieldCep00.setText(p_e.getCep());
        jComboBoxEstado.setSelectedItem(p_e.getEstado());
        
    }
    
    public Pessoa setInformacoesPessoa() {

//        String teste = txtNomeCliente.getText();
        if ("".equals(txtNomeCliente.getText())
                || "   .   .   -  ".equals(jFormattedTextFieldCpf.getText())
                || "          ".equals(jFormattedTextFieldRg.getText())
                || "".equals(jTextFieldRua00.getText())
                || "".equals(jTextFieldCidade00.getText())
                || "".equals(jComboBoxEstado.getSelectedItem().toString())
                || sexo == null) {
            return null;
            
        } else {
            pessoa.setNome(txtNomeCliente.getText());
            pessoa.setCpf(jFormattedTextFieldCpf.getText());
            pessoa.setRg(jFormattedTextFieldRg.getText());
            pessoa.setSexo(this.sexo);
            pessoa.setRua(jTextFieldRua00.getText());
            pessoa.setCep(jFormattedTextFieldCep00.getText());
            pessoa.setCidade(jTextFieldCidade00.getText());
            pessoa.setEstado(jComboBoxEstado.getSelectedItem().toString());
            limparCampos();
            return pessoa;
        }
        
    }
    
    public Pessoa setInformacoesEdita() {
        pessoa.setId(Integer.parseInt(jTextFieldCod.getText()));
        pessoa.setNome(txtNomeCliente.getText());
        pessoa.setCpf(jFormattedTextFieldCpf.getText());
        pessoa.setRg(jFormattedTextFieldRg.getText());
        pessoa.setSexo(this.sexo);
        pessoa.setRua(jTextFieldRua00.getText());
        pessoa.setCep(jFormattedTextFieldCep00.getText());
        pessoa.setCidade(jTextFieldCidade00.getText());
        pessoa.setEstado(String.valueOf(jComboBoxEstado.getSelectedItem()));
        limparCampos();
        return pessoa;
    }
    
    public Pessoa setId() {
        pessoa.setId(Integer.parseInt(jTextFieldCod.getText()));
        limparCampos();
        return pessoa;
    }

//    public Endereco setInformacoesEndereco() {
//
////        if ("".equals(jTextFieldRua.getText()
//////                || jTextFieldCep.getText().isEmpty()
//////                || jTextFieldCidade.getText().isEmpty()
//////                || jComboBoxEstado.getSelectedItem().toString().isEmpty()) {
////                )){
////            return null;
////        } else {
//            
//
//            JOptionPane.showMessageDialog(rootPane, jTextFieldRua00.getText()+""+jTextFieldCidade00.getText()+""+jFormattedTextFieldCep00.getText());
//            limparCampos();
//            return endereco;
//        //s}
//    }
    public void limparCampos() {
        txtNomeCliente.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldRg.setText("");
        jTextFieldRua00.setText("");
        jFormattedTextFieldCep00.setText("");
        jTextFieldCidade00.setText("");
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
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        checkBoxMasculino = new javax.swing.JCheckBox();
        checkBoxFeminino = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDados = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBucar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldRua00 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldCidade00 = new javax.swing.JTextField();
        jFormattedTextFieldCep00 = new javax.swing.JFormattedTextField();

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
        jButtonExcluir.setActionCommand("Excluir");
        jButtonExcluir.addActionListener(listener);
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setActionCommand("Editar");
        jButtonEditar.addActionListener(listener);
        jButtonEditar.setEnabled(false);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("Buscar");
        jButtonBuscar.addActionListener(listener);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paciente"));

        jLabel1.setText("Nome: *");

        jLabel2.setText("CPF: *");

        jLabel3.setText("RG:*");

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

        jLabel9.setText("Codigo:");

        jTextFieldCod.setEnabled(false);

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
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFormattedTextFieldRg)
                    .addComponent(jFormattedTextFieldCpf))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(checkBoxMasculino)
                .addGap(18, 18, 18)
                .addComponent(checkBoxFeminino)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxMasculino)
                    .addComponent(checkBoxFeminino))
                .addContainerGap())
        );

        jTextAreaDados.setColumns(20);
        jTextAreaDados.setRows(5);
        jTextAreaDados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaDados.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaDados);

        jLabel8.setText("Dados:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        jLabel14.setText("Rua:*");

        jLabel15.setText("Cidade:*");

        jLabel16.setText("CEP:*");

        jLabel17.setText("Estado:");

        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCidade00)
                    .addComponent(jFormattedTextFieldCep00, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jTextFieldRua00))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel17)
                    .addGap(18, 18, 18)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldRua00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldCidade00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jFormattedTextFieldCep00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(37, Short.MAX_VALUE)))
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(101, 101, 101)
                        .addComponent(jTextFieldBucar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldBucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
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

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxFeminino;
    private javax.swing.JCheckBox checkBoxMasculino;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep00;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDados;
    public javax.swing.JTextField jTextFieldBucar;
    private javax.swing.JTextField jTextFieldCidade00;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldRua00;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
