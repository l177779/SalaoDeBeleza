/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import application.Cliente;
import application.Prestador;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ArquivoCliente;
import model.ArquivoPrestador;
import model.CadastroCliente;
import model.CadastroPrestador;

/**
 *
 * @author lais
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPessoa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblConsulta = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        rdCliente = new javax.swing.JRadioButton();
        rdPrestador = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblConsulta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblConsulta.setText("Consulta");

        lblNome.setText("Nome:");

        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tipoPessoa.add(rdCliente);
        rdCliente.setText("Cliente");
        rdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdClienteActionPerformed(evt);
            }
        });

        tipoPessoa.add(rdPrestador);
        rdPrestador.setText("Prestador");

        btnConsultar.setText("Consultar");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("E-mail");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Telefone");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblConsulta)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdPrestador)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnVoltar)
                                .addGap(27, 27, 27)
                                .addComponent(btnConsultar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdCliente)
                    .addComponent(rdPrestador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConsultar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void rdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdClienteActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        // TODO add your handling code here:                
        
        String erro = "";
        
        //verifica se o usuário selecionou um tipo de pessoa (cliente/prestador)
        if(!rdCliente.isSelected() && !rdPrestador.isSelected()){
            erro = "- É necessário selecionar o tipo de consulta: Cliente ou Prestador.\n";
        }
        
        //verifica se o nome do cliente/prestador foi informado
        if(txtNome.getText().equals("")){
            erro += "- É necessário informar o nome a ser pesquisado.";            
        }
        
        //se não teve erro
        if(erro.equals("")){
            if(rdCliente.isSelected()){

                try {

                    // cria objetos de arquivo
                    ArquivoCliente arq = new ArquivoCliente();
                    CadastroCliente obj = arq.load();

                    //Lista de Prestadores
                    List<Cliente> lista = new ArrayList<>();
                    lista = obj.getListaCliente();

                    DefaultTableModel modelo = new DefaultTableModel(null,
                            new String[]{"Nome", "CPF", "E-mail", "Telefone"});

                    for (int i = 0; i < lista.size(); i++) {                                               
                        
                        if(txtNome.getText().equals(lista.get(i).getNome())){
                            String dados[] = new String[5];
                            dados[0] = lista.get(i).getNome();
                            dados[1] = lista.get(i).getCpf();
                            dados[2] = lista.get(i).getEmail();
                            dados[3] = lista.get(i).getTelefone();
                            modelo.addRow(dados);
                        }
                    }
                    
                    if(modelo.getRowCount() == 0){
                        jTable1.setModel(modelo);
                        JOptionPane.showMessageDialog(null, "Não há nenhum cliente com o nome informado.", "", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        jTable1.setModel(modelo);
                    }
                    
                } catch (Exception e) {
                    Logger LOGGER = Logger.getLogger(Inicial.class.getName());
                    LOGGER.log(Level.SEVERE, "busca cliente", e);
                    JOptionPane.showMessageDialog(null, "Houve um erro ao realizar a busca, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }else{
                try {

                    // cria objetos de arquivo
                    ArquivoPrestador arqP = new ArquivoPrestador();
                    CadastroPrestador objP = arqP.load();

                    // Lista de Prestadores
                    List<Prestador> listaP = new ArrayList<>();
                    listaP = objP.getListaPrestador();

                    DefaultTableModel modelo = new DefaultTableModel(null,
                            new String[]{"Nome", "E-mail", "Telefone", "Comissão"});

                    for (int i = 0; i < listaP.size(); i++) {
                        
                        if(txtNome.getText().equals(listaP.get(i).getNome())){
                            String dados[] = new String[5];
                            dados[0] = listaP.get(i).getNome();
                            dados[1] = listaP.get(i).getEmail();
                            dados[2] = listaP.get(i).getTelefone();
                            dados[3] = Double.toString(listaP.get(i).getComissao());
                            modelo.addRow(dados);
                        }
                    }
                    
                    if(modelo.getRowCount() == 0){
                        jTable1.setModel(modelo);
                        JOptionPane.showMessageDialog(null, "Não há nenhum prestador com o nome informado.", "", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        jTable1.setModel(modelo);
                    }
                    
                } catch (Exception e) {
                    Logger LOGGER = Logger.getLogger(Inicial.class.getName());
                    LOGGER.log(Level.SEVERE, "busca prestador", e);
                    JOptionPane.showMessageDialog(null, "Houve um erro ao realizar a busca, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        //se teve, exibe erro   
        }else{
            JOptionPane.showMessageDialog(null, erro, "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarMouseClicked

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton rdCliente;
    private javax.swing.JRadioButton rdPrestador;
    private javax.swing.ButtonGroup tipoPessoa;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
