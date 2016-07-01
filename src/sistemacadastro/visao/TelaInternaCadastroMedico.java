
package sistemacadastro.visao;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import sistemacadastro.arquivos.Medico;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.listener.ListenerTelaInternaCadastroMedico;

/**
 *
 * @author Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class TelaInternaCadastroMedico extends javax.swing.JInternalFrame {
    
    Medico medico = new Medico();
    
    private ListenerTelaInternaCadastroMedico listener = new ListenerTelaInternaCadastroMedico(this);
    public TelaInternaCadastroMedico() {
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
            jFormattedTextFieldCep.setFormatterFactory(new DefaultFormatterFactory(formCep));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar mascara frm Cliente linha 393 \nERRO:" + ex);
        }
    }
    
    public void getLista(java.util.List<Pessoa> listaPessoas) {
        jTextAreaDados.append("Código  |   Nome      |      CPF     |     RG    |      ESPECIALIZAÇÃO    | \n");
         for (int i = 0; i < listaPessoas.size(); i++){
            jTextAreaDados.append(listaPessoas.get(i).toString() + "\n");
        }
    }
    
    public Medico setInfoMedico(){
        medico.setNome(txtNomeMedico.getText());
        medico.setCpf(jFormattedTextFieldCpf.getText());
        medico.setRG(jFormattedTextFieldRg.getText());
        medico.setCRM(txtCRMMedico.getText());
        medico.setEmail(txtEmailMedico.getText());
        medico.setRua(txtRuaCliente.getText());
        medico.setCidade(txtCidadeCliente.getText());
        medico.setCep(jFormattedTextFieldCep.getText());
        medico.setEstado(String.valueOf(JcomboBoxEstadoMedico.getSelectedItem()));
        medico.setEspecializacao(txtEspecializacaoMedico.getText());
        limparCampos();
        return medico;
    }
    
    public Medico setInfoTotal(){
        medico.setNome(txtNomeMedico.getText());
        medico.setCpf(jFormattedTextFieldCpf.getText());
        medico.setRG(jFormattedTextFieldRg.getText());
        medico.setCRM(txtCRMMedico.getText());
        medico.setEmail(txtEmailMedico.getText());
        medico.setRua(txtRuaCliente.getText());
        medico.setCidade(txtCidadeCliente.getText());
        medico.setCep(jFormattedTextFieldCep.getText());
        medico.setEstado(String.valueOf(JcomboBoxEstadoMedico.getSelectedItem()));
        medico.setEspecializacao(txtEspecializacaoMedico.getText());
        limparCampos();
        return medico;
    }
    
    public Medico setID(){
        medico.setId(Integer.parseInt(jTextFieldCod.getText()));
        return medico;
    }
    
    public void getInfo(Medico med){
        jTextFieldCod.setText(String.valueOf(med.getId()));
        txtCRMMedico.setText(med.getCRM());
        jFormattedTextFieldCep.setText(med.getCep());
        txtCidadeCliente.setText(med.getCidade());
        jFormattedTextFieldCpf.setText(med.getCpf());
        txtEmailMedico.setText(med.getEmail());
        txtEspecializacaoMedico.setText(med.getEspecializacao());
        txtNomeMedico.setText(med.getNome());
        jFormattedTextFieldRg.setText(med.getRG());
        txtRuaCliente.setText(med.getRua()); 
    }
    
    public void limparCampos() {
        txtNomeMedico.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldRg.setText("");
        txtRuaCliente.setText("");
        jFormattedTextFieldCep.setText("");
        txtCidadeCliente.setText("");
        txtCRMMedico.setText("");
        txtEmailMedico.setText("");
        txtEspecializacaoMedico.setText("");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCRMMedico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEspecializacaoMedico = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmailMedico = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRuaCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        JcomboBoxEstadoMedico = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDados = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Médico");

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

        jButtonEditar.setText("Editar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Médico"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        txtCRMMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRMMedicoActionPerformed(evt);
            }
        });

        jLabel9.setText("CRM:");

        jLabel10.setText("Especilalização:");

        txtEspecializacaoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecializacaoMedicoActionPerformed(evt);
            }
        });

        jLabel11.setText("E- mail:");

        txtEmailMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailMedicoActionPerformed(evt);
            }
        });

        jLabel8.setText("Codigo:");

        jTextFieldCod.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addComponent(txtCRMMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeMedico)
                            .addComponent(jFormattedTextFieldRg)
                            .addComponent(jFormattedTextFieldCpf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEspecializacaoMedico))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmailMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecializacaoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCRMMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        jLabel4.setText("Rua:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("CEP:");

        JcomboBoxEstadoMedico.addItem("AL");
        JcomboBoxEstadoMedico.addItem("AM");
        JcomboBoxEstadoMedico.addItem("BA");
        JcomboBoxEstadoMedico.addItem("CE");
        JcomboBoxEstadoMedico.addItem("DF");
        JcomboBoxEstadoMedico.addItem("ES");
        JcomboBoxEstadoMedico.addItem("GO");
        JcomboBoxEstadoMedico.addItem("MA");
        JcomboBoxEstadoMedico.addItem("MT");
        JcomboBoxEstadoMedico.addItem("MS");
        JcomboBoxEstadoMedico.addItem("MG");
        JcomboBoxEstadoMedico.addItem("PA");
        JcomboBoxEstadoMedico.addItem("PB");
        JcomboBoxEstadoMedico.addItem("PR");
        JcomboBoxEstadoMedico.addItem("PE");
        JcomboBoxEstadoMedico.addItem("PI");
        JcomboBoxEstadoMedico.addItem("RJ");
        JcomboBoxEstadoMedico.addItem("RN");
        JcomboBoxEstadoMedico.addItem("RS");
        JcomboBoxEstadoMedico.addItem("RO");
        JcomboBoxEstadoMedico.addItem("RR");
        JcomboBoxEstadoMedico.addItem("SC");
        JcomboBoxEstadoMedico.addItem("SP");
        JcomboBoxEstadoMedico.addItem("SE");
        JcomboBoxEstadoMedico.addItem("TO");
        JcomboBoxEstadoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboBoxEstadoMedicoActionPerformed(evt);
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
                        .addComponent(txtRuaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldCep)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JcomboBoxEstadoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcomboBoxEstadoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextAreaDados.setColumns(20);
        jTextAreaDados.setRows(5);
        jTextAreaDados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaDados.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaDados);

        jLabel12.setText("Dados:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("Buscar");
        jButtonBuscar.addActionListener(listener);

        jButtonNovo.setText("Novo");
        jButtonNovo.setActionCommand("Novo");
        jButtonNovo.addActionListener(listener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonNovo)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonBuscar)))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonNovo))
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void JcomboBoxEstadoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboBoxEstadoMedicoActionPerformed
    }//GEN-LAST:event_JcomboBoxEstadoMedicoActionPerformed

    private void txtCRMMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRMMedicoActionPerformed
    }//GEN-LAST:event_txtCRMMedicoActionPerformed

    private void txtEspecializacaoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecializacaoMedicoActionPerformed
    }//GEN-LAST:event_txtEspecializacaoMedicoActionPerformed

    private void txtEmailMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailMedicoActionPerformed
    }//GEN-LAST:event_txtEmailMedicoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboBoxEstadoMedico;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDados;
    public javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField txtCRMMedico;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtEmailMedico;
    private javax.swing.JTextField txtEspecializacaoMedico;
    public javax.swing.JTextField txtNomeMedico;
    private javax.swing.JTextField txtRuaCliente;
    // End of variables declaration//GEN-END:variables
}
