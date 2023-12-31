/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author EVARISTO
 */
public class EntradaCliente extends javax.swing.JFrame {
     Connection conn;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form EntradaCliente
     */
    public EntradaCliente() {
        initComponents();
        SimpleDateFormat ob=new SimpleDateFormat("yyyy-MM-dd");
        Date data=new Date();
        txtdata.setText(ob.format(data));
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel?user=root&password=");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexao em: "+e.getMessage());
        }
        sudhir();
    }
    public void sudhir(){
        try {
            ps=conn.prepareStatement("select numquarto from quartos where cama=? and tipoq=? and estado=?");
            ps.setString(1, cmbtc.getItemAt(cmbtc.getSelectedIndex()));
            ps.setString(2, cmbtq.getItemAt(cmbtq.getSelectedIndex()));
            ps.setString(3, "NAO RESERVADO");
            rs=ps.executeQuery();
            cmbnq.removeAllItems();
            while(rs.next()){
                cmbnq.addItem(rs.getString("numquarto"));
                
            }
            ps=conn.prepareStatement("select preco from quartos where numquarto=?");
            ps.setString(1, cmbnq.getItemAt(cmbnq.getSelectedIndex()));
            rs=ps.executeQuery();
            if(rs.next()){
                txtpreco.setText(rs.getString("preco"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void limpar(){
        txtnacionalidade.setText("");
        txtnome.setText("");
        txtnumadhar.setText("");
        txtnumtelefone.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtnumtelefone = new javax.swing.JTextField();
        txtnacionalidade = new javax.swing.JTextField();
        cmbg = new javax.swing.JComboBox<>();
        txtnumadhar = new javax.swing.JTextField();
        txtdata = new javax.swing.JTextField();
        cmbtc = new javax.swing.JComboBox<>();
        cmbtq = new javax.swing.JComboBox<>();
        cmbnq = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btregistar = new javax.swing.JButton();
        txtpreco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_customs_officer_40px.png"))); // NOI18N
        jLabel1.setText("Registar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 35, 224, 55));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 48, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Numero de Telefone");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Registo de Data");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 96, -1, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Genero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 265, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nacionalidade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de cama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tipo de quarto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Numero de Quarto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Preco");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Bilhete de Identificacao");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        txtnome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 289, 30));

        txtnumtelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumtelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumtelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumtelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 211, 289, 30));

        txtnacionalidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnacionalidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 290, 30));

        cmbg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cmbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgActionPerformed(evt);
            }
        });
        getContentPane().add(cmbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 290, 30));

        txtnumadhar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumadharActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 290, 30));

        txtdata.setEditable(false);
        txtdata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataActionPerformed(evt);
            }
        });
        getContentPane().add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 130, 266, 30));

        cmbtc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbtc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casal" }));
        cmbtc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbtcItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 210, 270, 30));

        cmbtq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbtq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Com AC", "Sem AC" }));
        cmbtq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbtqItemStateChanged(evt);
            }
        });
        cmbtq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtqActionPerformed(evt);
            }
        });
        getContentPane().add(cmbtq, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 266, 30));

        cmbnq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbnq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnqActionPerformed(evt);
            }
        });
        getContentPane().add(cmbnq, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 280, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_cancel_48px_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 0, 55, 42));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Voltar a Pagina inicial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 617, 210, 40));

        btlimpar.setBackground(new java.awt.Color(255, 51, 51));
        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 100, 40));

        btregistar.setBackground(new java.awt.Color(0, 0, 255));
        btregistar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btregistar.setText("Gegistar");
        btregistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistarActionPerformed(evt);
            }
        });
        getContentPane().add(btregistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 613, 110, 40));

        txtpreco.setEditable(false);
        txtpreco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 280, 30));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbgActionPerformed

    private void txtnacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnacionalidadeActionPerformed

    private void txtnumadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumadharActionPerformed

    private void txtnumtelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumtelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumtelefoneActionPerformed

    private void txtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataActionPerformed

    private void cmbnqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbnqActionPerformed

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void cmbtqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sim=JOptionPane.showConfirmDialog(this, "Tem certeza que quer sair desta pagina?","SAIR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(sim==JOptionPane.YES_OPTION)
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new PaginaInicial().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btregistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistarActionPerformed
        if(txtnome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "E Obrigatorio preencher todos os Campos");
            txtnome.requestFocus();
        }
         else   if(txtnacionalidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "E Obrigatorio preencher todos os Campos");
            txtnacionalidade.requestFocus();
            }
        else    if(txtnumtelefone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "E Obrigatorio preencher todos os Campos");
            txtnumtelefone.requestFocus();
        }
         else   if(txtnumadhar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "E Obrigatorio preencher todos os Campos");
            txtnumadhar.requestFocus();
            }else{
             try {
                 ps=conn.prepareStatement("insert into clientes(nome,telefone,genero,id,nacionalidade,dataentrada,numquarto,tipoq,cama,preco,estado) values (?,?,?,?,?,?,?,?,?,?,?)");
                 ps.setString(1, txtnome.getText());
                 ps.setString(2, txtnumtelefone.getText());
                 ps.setString(3, cmbg.getItemAt(cmbg.getSelectedIndex()));
                 ps.setString(4, txtnumadhar.getText());
                 ps.setString(5, txtnacionalidade.getText());
                 ps.setString(6, txtdata.getText());
                 ps.setString(7, cmbnq.getItemAt(cmbnq.getSelectedIndex()));
                 ps.setString(8, cmbtq.getItemAt(cmbtq.getSelectedIndex()));
                 ps.setString(9, cmbtc.getItemAt(cmbtc.getSelectedIndex()));
                 ps.setString(10, txtpreco.getText());
                 ps.setString(11, "NULL");
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Cliente Registado com Sucesso");
                 limpar();
                 ps=conn.prepareStatement("update quartos set estado=? where numquarto=?");
                 ps.setString(1, "Reservado");
                 ps.setString(2, cmbnq.getItemAt(cmbnq.getSelectedIndex()));
                 ps.executeUpdate();
                 sudhir();
                 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
         }
    }//GEN-LAST:event_btregistarActionPerformed

    private void cmbtcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbtcItemStateChanged
    sudhir();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtcItemStateChanged

    private void cmbtqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbtqItemStateChanged
        sudhir();// TODO add your handling code here:
    }//GEN-LAST:event_cmbtqItemStateChanged

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        limpar();
        
    }//GEN-LAST:event_btlimparActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btregistar;
    private javax.swing.JComboBox<String> cmbg;
    private javax.swing.JComboBox<String> cmbnq;
    private javax.swing.JComboBox<String> cmbtc;
    private javax.swing.JComboBox<String> cmbtq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtnacionalidade;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumadhar;
    private javax.swing.JTextField txtnumtelefone;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
