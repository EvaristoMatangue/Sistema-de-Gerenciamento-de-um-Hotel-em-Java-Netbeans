
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVARISTO
 */
public class esqueci_me_senha extends javax.swing.JFrame {

        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
    /**
     * Creates new form esqueci_me_senha
     */
    public esqueci_me_senha() {
        initComponents();
        txtq.setEditable(false);
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel?user=root&password=");
          
            
        } catch (Exception e) {
        }
    }
    int flag=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        locultar = new javax.swing.JLabel();
        btsubmeter = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btvoltarlogin = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        txtq = new javax.swing.JTextField();
        txtr = new javax.swing.JTextField();
        txtnovapalavrapasse = new javax.swing.JPasswordField();
        btprocurar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Esqueci-me da senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Endereco email:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Questao de seguranca:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Resposta:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nova palavra passe");

        locultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_hide_24px.png"))); // NOI18N
        locultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locultarMouseClicked(evt);
            }
        });

        btsubmeter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btsubmeter.setText("Submeter");
        btsubmeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsubmeterActionPerformed(evt);
            }
        });

        btcancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        btvoltarlogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btvoltarlogin.setText("Voltar a  pag login");
        btvoltarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarloginActionPerformed(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnovapalavrapasse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btprocurar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btprocurar.setText("Procurar");
        btprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprocurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(btcancelar)
                                .addGap(46, 46, 46)
                                .addComponent(btvoltarlogin))
                            .addComponent(btsubmeter)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtq, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnovapalavrapasse)
                                .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(locultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btprocurar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btprocurar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(locultar)
                    .addComponent(txtnovapalavrapasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsubmeter)
                    .addComponent(btcancelar)
                    .addComponent(btvoltarlogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 470, 310));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_cancel_48px_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 0, 61, 44));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hotel.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void locultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locultarMouseClicked
        if(flag==0){
            locultar.setIcon(new ImageIcon("C:\\Users\\EVARISTO\\Documents\\NetBeansProjects\\Hotel\\src\\imagens\\icons8_hide_24px.png"));
            flag=1;
            txtnovapalavrapasse.setEchoChar('*');
        }
        else{
           locultar.setIcon(new ImageIcon("C:\\Users\\EVARISTO\\Documents\\NetBeansProjects\\Hotel\\src\\imagens\\ver.png"));
             flag=0;
             txtnovapalavrapasse.setEchoChar((char)0);
        }
    }//GEN-LAST:event_locultarMouseClicked

    private void btvoltarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarloginActionPerformed
       new Entrar().setVisible(true);
        dispose();
    }//GEN-LAST:event_btvoltarloginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sim=JOptionPane.showConfirmDialog(this, "Tem certeza que quer sair?","SAIR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(sim==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        txtemail.setText("");
        txtnovapalavrapasse.setText("");
        txtq.setText("");
        txtr.setText("");
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprocurarActionPerformed
        try {
            ps=conn.prepareStatement("select qs from entrars where email=?");
            ps.setString(1, txtemail.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                txtq.setText(rs.getString("qs"));
            }else{
                JOptionPane.showMessageDialog(null, "Desculpa, o Usuario nao encontrado");
            }
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_btprocurarActionPerformed

    private void btsubmeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsubmeterActionPerformed
        try {
            ps=conn.prepareStatement("select * from entrars where email=? and resposta=?");
            ps.setString(1, txtemail.getText());
            ps.setString(2, txtr.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                try {
            ps=conn.prepareStatement("update entrars set palavrapasse=? where email=? and resposta=?");
            ps.setString(1, txtnovapalavrapasse.getText());
            ps.setString(2, txtemail.getText());
            ps.setString(3, txtr.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "ACTUALIZADO COM SUCESSO!");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            }
            else{
                
            JOptionPane.showMessageDialog(null, "Resposta nao correspondida! Por favor tente novamente.");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na actualizacao em: "+e.getMessage());
        }
        
    }//GEN-LAST:event_btsubmeterActionPerformed

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
            java.util.logging.Logger.getLogger(esqueci_me_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(esqueci_me_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(esqueci_me_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(esqueci_me_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new esqueci_me_senha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btprocurar;
    private javax.swing.JButton btsubmeter;
    private javax.swing.JButton btvoltarlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locultar;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtnovapalavrapasse;
    private javax.swing.JTextField txtq;
    private javax.swing.JTextField txtr;
    // End of variables declaration//GEN-END:variables
}
