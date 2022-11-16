/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conta
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesangue = new javax.swing.JTable();
        bancoadd = new javax.swing.JTextField();
        doadoradd = new javax.swing.JTextField();
        quantadd = new javax.swing.JTextField();
        cadtable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoadd = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        atualizatable = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        atttable = new javax.swing.JMenu();
        addtable = new javax.swing.JMenuItem();
        excluircampo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        tablesangue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Banco de Sangue", "Doador", "Tipo Sanguineo", "Quantidade(ml)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablesangue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablesangue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesangueMouseClicked(evt);
            }
        });
        tablesangue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablesangueKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablesangue);

        cadtable.setText("Cadastrar");
        cadtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadtableActionPerformed(evt);
            }
        });

        jLabel1.setText("Banco");

        jLabel2.setText("Doador");

        jLabel3.setText("Tipo");

        jLabel4.setText("Quantidade");

        tipoadd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        tipoadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoaddActionPerformed(evt);
            }
        });

        jLabel5.setText("OBS: Aba separa para o registro de informações na tabela não esta funcional no momento pois não há a implementação do banco de dados,");

        jLabel6.setText("Use os campos acima temporariamente.");

        atualizatable.setText("Atualizar");
        atualizatable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizatableActionPerformed(evt);
            }
        });

        atttable.setText("Tabela");

        addtable.setText("adicionar novo campo");
        addtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtableActionPerformed(evt);
            }
        });
        atttable.add(addtable);

        excluircampo.setText("excluir campo selecionado");
        excluircampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluircampoActionPerformed(evt);
            }
        });
        atttable.add(excluircampo);

        jMenuItem1.setText("atualizar campo selecionado");
        atttable.add(jMenuItem1);

        jMenuBar2.add(atttable);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadtable)
                        .addGap(18, 18, 18)
                        .addComponent(atualizatable))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bancoadd)
                                .addGap(7, 7, 7)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doadoradd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tipoadd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantadd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(54, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bancoadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doadoradd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadtable)
                    .addComponent(atualizatable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtableActionPerformed
        // TODO add your handling code here:
        new addMenu().setVisible(true);
    }//GEN-LAST:event_addtableActionPerformed

    private void cadtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadtableActionPerformed
        DefaultTableModel tabelaBanco = (DefaultTableModel) tablesangue.getModel();
        Object[] dados = new Object[]{
            bancoadd.getText(),doadoradd.getText(),tipoadd.getSelectedItem() ,quantadd.getText()
        };
        tabelaBanco.addRow(dados);
        
    }//GEN-LAST:event_cadtableActionPerformed

    private void tipoaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoaddActionPerformed

    private void excluircampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluircampoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabelaBanco = (DefaultTableModel) tablesangue.getModel();
        if(tablesangue.getSelectedRow()!=-1){
            tabelaBanco.removeRow(tablesangue.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha para ser excluida");
        }
    }//GEN-LAST:event_excluircampoActionPerformed

    private void tablesangueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesangueMouseClicked
        DefaultTableModel tabelaBanco = (DefaultTableModel) tablesangue.getModel();
        if(tablesangue.getSelectedRow()!=-1){
            bancoadd.setText(tablesangue.getValueAt(tablesangue.getSelectedRow(),0).toString());
            doadoradd.setText(tablesangue.getValueAt(tablesangue.getSelectedRow(),1).toString());
            tipoadd.setSelectedItem(tablesangue.getValueAt(tablesangue.getSelectedRow(),2).toString());
            quantadd.setText(tablesangue.getValueAt(tablesangue.getSelectedRow(),3).toString());
        }else{ 
            JOptionPane.showMessageDialog(null,"Selecione uma linha para ser excluida");
        }
    }//GEN-LAST:event_tablesangueMouseClicked

    private void atualizatableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizatableActionPerformed
        if(tablesangue.getSelectedRow()!=-1){
            tablesangue.setValueAt(bancoadd.getText(),tablesangue.getSelectedRow(),0);
            tablesangue.setValueAt(doadoradd.getText(),tablesangue.getSelectedRow(),1);
            tablesangue.setValueAt(tipoadd.getSelectedItem(),tablesangue.getSelectedRow(),2);
            tablesangue.setValueAt(quantadd.getText(),tablesangue.getSelectedRow(),3);
        }else{ 
            JOptionPane.showMessageDialog(null,"Selecione uma linha para ser excluida");
        }
    }//GEN-LAST:event_atualizatableActionPerformed

    private void tablesangueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablesangueKeyReleased
       
    }//GEN-LAST:event_tablesangueKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public void cadastrar(String bancoadd, String doadoradd, Object tipoadd, String quantadd){
        DefaultTableModel tabelaBanco = (DefaultTableModel) tablesangue.getModel();
        Object[] dados = new Object[]{
            bancoadd,doadoradd,tipoadd,quantadd
        };
        tabelaBanco.addRow(dados);
    }
    
    public void CadOutside(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addtable;
    private javax.swing.JMenu atttable;
    private javax.swing.JButton atualizatable;
    private javax.swing.JTextField bancoadd;
    private javax.swing.JButton cadtable;
    private javax.swing.JTextField doadoradd;
    private javax.swing.JMenuItem excluircampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantadd;
    private javax.swing.JTable tablesangue;
    private javax.swing.JComboBox<String> tipoadd;
    // End of variables declaration//GEN-END:variables
}
