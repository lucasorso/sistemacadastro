package sistemacadastro.visao;

import sistemacadastro.arquivos.Arquivo;
import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @authors Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
       
        initComponents();
        setExtendedState(TelaPrincipal.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        Procurar_JInternalFrame = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        cadastroUsuario_MenuItem = new javax.swing.JMenuItem();
        sair_MenuItem = new javax.swing.JMenuItem();
        Pacientes = new javax.swing.JMenu();
        cadastrarPessoa_MenuItem = new javax.swing.JMenuItem();
        procurar_MenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cadastrarMedico_MenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        desenvolvedores_MenuItem = new javax.swing.JMenuItem();
        sobreSistema_MenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Procurar_JInternalFrame.setClosable(true);
        Procurar_JInternalFrame.setIconifiable(true);
        Procurar_JInternalFrame.setMaximizable(true);
        Procurar_JInternalFrame.setResizable(true);
        Procurar_JInternalFrame.setVisible(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisar"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Nome:");

        jButton5.setText("buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));

        jLabel10.setText("Nome:");

        jTextField8.setEnabled(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ultima consulta:");

        jTextField9.setEnabled(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Laudo"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap())
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Procurar_JInternalFrameLayout = new javax.swing.GroupLayout(Procurar_JInternalFrame.getContentPane());
        Procurar_JInternalFrame.getContentPane().setLayout(Procurar_JInternalFrameLayout);
        Procurar_JInternalFrameLayout.setHorizontalGroup(
            Procurar_JInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Procurar_JInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Procurar_JInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Procurar_JInternalFrameLayout.setVerticalGroup(
            Procurar_JInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Procurar_JInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.add(Procurar_JInternalFrame);
        Procurar_JInternalFrame.setBounds(120, 20, 450, 350);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/computer.png"))); // NOI18N
        Menu.setMnemonic('f');
        Menu.setText("Sistema");

        cadastroUsuario_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/user.png"))); // NOI18N
        cadastroUsuario_MenuItem.setText("Cadastrar Usuarios");
        cadastroUsuario_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuario_MenuItemActionPerformed(evt);
            }
        });
        Menu.add(cadastroUsuario_MenuItem);

        sair_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/cancel.png"))); // NOI18N
        sair_MenuItem.setMnemonic('x');
        sair_MenuItem.setText("Sair");
        sair_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_MenuItemActionPerformed(evt);
            }
        });
        Menu.add(sair_MenuItem);

        menuBar.add(Menu);

        Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/group.png"))); // NOI18N
        Pacientes.setMnemonic('e');
        Pacientes.setText("Pacientes");

        cadastrarPessoa_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/application_form_add.png"))); // NOI18N
        cadastrarPessoa_MenuItem.setMnemonic('t');
        cadastrarPessoa_MenuItem.setText("Cadastrar");
        cadastrarPessoa_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPessoa_MenuItemActionPerformed(evt);
            }
        });
        Pacientes.add(cadastrarPessoa_MenuItem);

        procurar_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/application_form_magnify.png"))); // NOI18N
        procurar_MenuItem.setMnemonic('p');
        procurar_MenuItem.setText("Procurar");
        procurar_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurar_MenuItemActionPerformed(evt);
            }
        });
        Pacientes.add(procurar_MenuItem);

        menuBar.add(Pacientes);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/user_suit.png"))); // NOI18N
        jMenu1.setText("Medicos");

        cadastrarMedico_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/user_gray.png"))); // NOI18N
        cadastrarMedico_MenuItem.setText("Cadastrar");
        cadastrarMedico_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarMedico_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarMedico_MenuItem);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/table_multiple.png"))); // NOI18N
        jMenuItem2.setText("Consulta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/application.png"))); // NOI18N
        Sobre.setMnemonic('h');
        Sobre.setText("Sobre");

        desenvolvedores_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/application_osx_terminal.png"))); // NOI18N
        desenvolvedores_MenuItem.setMnemonic('c');
        desenvolvedores_MenuItem.setText("Desenvolvedores");
        desenvolvedores_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenvolvedores_MenuItemActionPerformed(evt);
            }
        });
        Sobre.add(desenvolvedores_MenuItem);

        sobreSistema_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemacadastro/icones/computer.png"))); // NOI18N
        sobreSistema_MenuItem.setMnemonic('a');
        sobreSistema_MenuItem.setText("Sobre o Sistema");
        sobreSistema_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreSistema_MenuItemActionPerformed(evt);
            }
        });
        Sobre.add(sobreSistema_MenuItem);

        menuBar.add(Sobre);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sair_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_MenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sair_MenuItemActionPerformed

    private void cadastrarPessoa_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPessoa_MenuItemActionPerformed
        TelaInternaCadastroDePessoas cadastrar = new TelaInternaCadastroDePessoas();
        desktopPane.add(cadastrar);
    }//GEN-LAST:event_cadastrarPessoa_MenuItemActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void procurar_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurar_MenuItemActionPerformed
        TelaInternaProcurar procurar = new TelaInternaProcurar();
        desktopPane.add(procurar);
    }//GEN-LAST:event_procurar_MenuItemActionPerformed

    private void sobreSistema_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreSistema_MenuItemActionPerformed

        TelaInternaSobreSistema sobre = new TelaInternaSobreSistema();
        desktopPane.add(sobre);
        sobre.setVisible(true);
    }//GEN-LAST:event_sobreSistema_MenuItemActionPerformed

    private void desenvolvedores_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenvolvedores_MenuItemActionPerformed
        TelainternaDesenvolvedores desenvolvedores = new TelainternaDesenvolvedores();
        desktopPane.add(desenvolvedores);
        desenvolvedores.setVisible(true);
        
    }//GEN-LAST:event_desenvolvedores_MenuItemActionPerformed

    private void cadastroUsuario_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuario_MenuItemActionPerformed
        TelaInternaCadastoUsuario cadastroUsuario = new TelaInternaCadastoUsuario();
        desktopPane.add(cadastroUsuario);
        //cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_cadastroUsuario_MenuItemActionPerformed

    private void cadastrarMedico_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarMedico_MenuItemActionPerformed
        TelaInternaCadastroMedico cadastroMedico = new TelaInternaCadastroMedico();
        desktopPane.add(cadastroMedico);
    }//GEN-LAST:event_cadastrarMedico_MenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaInternaConsulta cadastroConsulta= new TelaInternaConsulta();
        desktopPane.add(cadastroConsulta);
        cadastroConsulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu Pacientes;
    private javax.swing.JInternalFrame Procurar_JInternalFrame;
    private javax.swing.JMenu Sobre;
    private javax.swing.JMenuItem cadastrarMedico_MenuItem;
    private javax.swing.JMenuItem cadastrarPessoa_MenuItem;
    private javax.swing.JMenuItem cadastroUsuario_MenuItem;
    private javax.swing.JMenuItem desenvolvedores_MenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem procurar_MenuItem;
    private javax.swing.JMenuItem sair_MenuItem;
    private javax.swing.JMenuItem sobreSistema_MenuItem;
    // End of variables declaration//GEN-END:variables
}
