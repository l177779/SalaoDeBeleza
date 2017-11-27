/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import application.Cliente;
import application.Prestador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import model.ArquivoCliente;
import model.ArquivoPrestador;
import model.CadastroCliente;
import model.CadastroPrestador;

/**
 *
 * @author lais
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public Inicial() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAgendamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Bem-vindo ao Salão de Beleza!");

        jLabel2.setText("Para começar, selecione uma opção:");

        btnCadastro.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnCadastro.setText("Cadastro");
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroMouseClicked(evt);
            }
        });
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnConsultar.setText("Consulta");
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

        btnAgendamento.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAgendamento.setText("Agendar Horário");
        btnAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendamentoMouseClicked(evt);
            }
        });
        btnAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgendamento)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addGap(32, 60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro)
                    .addComponent(btnConsultar))
                .addGap(31, 31, 31)
                .addComponent(btnAgendamento)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendamentoActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseClicked
        // TODO add your handling code here:
        Cadastro cad = new Cadastro();
        cad.setVisible(true);
    }//GEN-LAST:event_btnCadastroMouseClicked

    private void btnAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendamentoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Esta funcionalidade está em desenvolvimento, em breve teremos novidades!");
        /*AgendarHorario ah = new AgendarHorario();
        ah.setVisible(true);*/
    }//GEN-LAST:event_btnAgendamentoMouseClicked

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        // TODO add your handling code here:
        Consulta cons = new Consulta();
        cons.setVisible(true);
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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
        
//        System.out.println("\n\nBuscando um Cliente no arquivo: \n");
//        // cria objetos de arquivo
//        ArquivoCliente arq = new ArquivoCliente();
//        CadastroCliente obj = arq.load();
//
//        // cria um array de strings com os dados do Cliente do index 0 e exibe
//        String cliente[] = new String[7];
//        cliente = obj.getCliente(0);
//        System.out.println(Arrays.toString(cliente));
        
        // quantidade atual da lista
//        System.out.println("\nQuantidade Clientes: " + obj.getListaCliente().size());
        
//        // Lista de Prestadores
//        List<Cliente> lista = new ArrayList<>();
//        lista = obj.getListaCliente();
//        int i = 0;
//        for (i = 0; i < lista.size(); i++) {
//            System.out.println("Nome: " + lista.get(i).getNome());
//        };
        
        // Exemplo de insercao de Cliente
//        Cliente teste = new Cliente("Pogba", "99999999944", "c9@gmail.com", "2929-9292", 'm', "09/09/2009");
//        obj.insereCliente(teste);
//        System.out.println("\nQuantidade Clientes: " + obj.getQuantidadeClientes());

        // Salva arquivo
//        arq.save(obj);
    
        
//        System.out.println("\n\nBuscando um Prestador no arquivo: \n");
//        // cria objetos de arquivo
//        ArquivoPrestador arqP = new ArquivoPrestador();
//        CadastroPrestador objP = arqP.load();
//        
//        // cria um array de strings com os dados do Prestador do index 0 e exibe
//        String prestador[] = new String[8];
//        prestador = objP.getPrestador(0);
//        System.out.println(Arrays.toString(prestador));
//        
//        // quantidade atual da lista
//        System.out.println("\nQuantidade Prestadores: " + objP.getListaPrestador().size());
//        
//        // Lista de Prestadores
//        List<Prestador> listaP = new ArrayList<>();
//        listaP = objP.getListaPrestador();
//        for (int i = 0; i < listaP.size(); i++) {
//            System.out.println("Nome: " + listaP.get(i).getNome());
//        }
//        
//        // salva o arquivo
//        arqP.save(objP);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendamento;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
