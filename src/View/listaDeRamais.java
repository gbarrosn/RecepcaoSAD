/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.DAO;
import Model.Pavimento;
import Model.Ramal;
import Model.Unidade;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gbarrosn
 */
public class listaDeRamais extends javax.swing.JFrame {

    /**
     * Creates new form listaDeRamais
     */
    static String login = new String();
    public listaDeRamais(String login) {
        initComponents();
        try {
            // Call the getPavimentos method from the DAO class to retrieve the pavimentos from the database
            List<Pavimento> pavimentos = DAO.getPavimentos();
            
            // Clear the existing items in the jComboBoxPavimento
            jComboBoxPavimento.removeAllItems();
            jComboBoxPavimento.addItem("Pavimento");
            // Populate the jComboBoxPavimento with the retrieved pavimentos
            for (Pavimento pavimento : pavimentos) {
                jComboBoxPavimento.addItem(pavimento.getPavimento());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // Call the getUnidades method from the DAO class to retrieve the unidades from the database
            List<Unidade> unidades = DAO.getUnidades();
            
            // Clear the existing items in the jComboBoxUnidade
            jComboBoxUnidade.removeAllItems();
            jComboBoxUnidade.addItem("Unidade");
            // Populate the jComboBoxUnidade with the retrieved unidades
            for (Unidade unidade : unidades) {
                jComboBoxUnidade.addItem(unidade.getUnidade());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPavimento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxUnidade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/GovPERGBpequeno1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Ramais SAD - PE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ramal", "Nome", "Unidade", "Pavimento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jComboBoxPavimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPavimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxPavimentoMouseClicked(evt);
            }
        });
        jComboBoxPavimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPavimentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Pavimento");

        jComboBoxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxUnidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxUnidadeMouseClicked(evt);
            }
        });
        jComboBoxUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUnidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Unidade");

        jButton2.setText("Tela Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNome)
                            .addComponent(jComboBoxUnidade, 0, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(103, 103, 103))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jComboBoxPavimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldNome)
                    .addComponent(jComboBoxPavimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if (jComboBoxPavimento.getSelectedItem() == "Pavimento" && jComboBoxUnidade.getSelectedItem() == "Unidade" && jTextFieldNome.getText().equals("")) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing rows

            // Call the getRamais method from the DAO class to retrieve the ramais from the database
            List<Ramal> ramais = null;
            try {
                ramais = DAO.getRamais();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Populate the table with the retrieved ramais
            for (Ramal ramal : ramais) {
                Object[] rowData = {ramal.getRamal(), ramal.getNome(), ramal.getGerencia(), ramal.getPavimento()};
                model.addRow(rowData);
            }
        } else { //TODO: aqui o filtro usa o index do combobox para popular a tabela, mas só funciona pq o index ta igual ao banco de dados. 
            //se deletar alguma unidade no banco de dados, o index vai mudar e o filtro vai parar de funcionar
            // Call the getRamaisFiltro method from the DAO class to retrieve the filtered ramais from the database
            List<Ramal> ramais = null;
            try {
                int idPavimento = jComboBoxPavimento.getSelectedIndex() - 1; // Assuming the index represents the id_pavimento
                int idUnidade = jComboBoxUnidade.getSelectedIndex() - 1; // Assuming the index represents the id_unidade
                String nome = jTextFieldNome.getText();
                
                if (nome.equals("")) {
                    nome = "shalom";
                }
                ramais = DAO.getRamaisFiltro(idPavimento, idUnidade, nome);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Populate the table with the retrieved filtered ramais
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing rows
            for (Ramal ramal : ramais) {
                Object[] rowData = {ramal.getRamal(), ramal.getNome(), ramal.getGerencia(), ramal.getPavimento()};
                model.addRow(rowData);
            }
        }
        
        try {
            // Call the getPavimentos method from the DAO class to retrieve the pavimentos from the database
            List<Pavimento> pavimentos = DAO.getPavimentos();
            
            // Clear the existing items in the jComboBoxPavimento
            jComboBoxPavimento.removeAllItems();
            jComboBoxPavimento.addItem("Pavimento");
            // Populate the jComboBoxPavimento with the retrieved pavimentos
            for (Pavimento pavimento : pavimentos) {
                jComboBoxPavimento.addItem(pavimento.getPavimento());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // Call the getUnidades method from the DAO class to retrieve the unidades from the database
            List<Unidade> unidades = DAO.getUnidades();
            
            // Clear the existing items in the jComboBoxUnidade
            jComboBoxUnidade.removeAllItems();
            jComboBoxUnidade.addItem("Unidade");
            // Populate the jComboBoxUnidade with the retrieved unidades
            for (Unidade unidade : unidades) {
                jComboBoxUnidade.addItem(unidade.getUnidade());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldNome.setText("");
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        TelaPrincipal tela = new TelaPrincipal(login);
        tela.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxPavimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPavimentoActionPerformed
        
    }//GEN-LAST:event_jComboBoxPavimentoActionPerformed

    private void jComboBoxUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUnidadeActionPerformed

    private void jComboBoxPavimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxPavimentoMouseClicked
        // TODO add your handling code here:
        jComboBoxUnidadeMouseClicked(evt);
        try {
            // Call the getPavimentos method from the DAO class to retrieve the pavimentos from the database
            List<Pavimento> pavimentos = DAO.getPavimentos();
            
            // Clear the existing items in the jComboBoxPavimento
            jComboBoxPavimento.removeAllItems();
            jComboBoxPavimento.addItem("Pavimento");
            // Populate the jComboBoxPavimento with the retrieved pavimentos
            for (Pavimento pavimento : pavimentos) {
                jComboBoxPavimento.addItem(pavimento.getPavimento());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxPavimentoMouseClicked

    private void jComboBoxUnidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxUnidadeMouseClicked
        // TODO add your handling code here:
        try {
            // Call the getUnidades method from the DAO class to retrieve the unidades from the database
            List<Unidade> unidades = DAO.getUnidades();
            
            // Clear the existing items in the jComboBoxUnidade
            jComboBoxUnidade.removeAllItems();
            jComboBoxUnidade.addItem("Unidade");
            // Populate the jComboBoxUnidade with the retrieved unidades
            for (Unidade unidade : unidades) {
                jComboBoxUnidade.addItem(unidade.getUnidade());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaDeRamais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxUnidadeMouseClicked

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
            java.util.logging.Logger.getLogger(listaDeRamais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaDeRamais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaDeRamais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaDeRamais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaDeRamais(login).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxPavimento;
    private javax.swing.JComboBox<String> jComboBoxUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
