/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author TuEch
 */
public class Maytinh extends javax.swing.JFrame {
    private long a=0;
    private String pheptoan="";
    /**
     * Creates new form Lab2Bai12
     */
    public Maytinh() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSo1 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnSo4 = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnPhantram = new javax.swing.JButton();
        btnSo7 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btn1x = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        btnCongTru = new javax.swing.JButton();
        btnSoC = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        txtSo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSo.setForeground(new java.awt.Color(51, 51, 255));
        txtSo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSo.setText("0");
        txtSo.setToolTipText("");
        txtSo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setLayout(new java.awt.GridLayout(4, 5));

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo1);

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo2);

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo3);

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnChia);

        btnSqrt.setText("sqrt");
        jPanel1.add(btnSqrt);

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo4);

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo5);

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo6);

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnNhan);

        btnPhantram.setText("%");
        jPanel1.add(btnPhantram);

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo7);

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo8);

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo9);

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });
        jPanel1.add(btnTru);

        btn1x.setText("1/x");
        jPanel1.add(btn1x);

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSo0);

        btnCongTru.setText("+/-");
        jPanel1.add(btnCongTru);

        btnSoC.setText("C");
        jPanel1.add(btnSoC);

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel1.add(btnCong);

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel1.add(btnBang);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CASIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
       // TODO add your handling code here:
        a=Long.parseLong(txtSo.getText());
        if(a !=0){
            pheptoan="/";
            txtSo.setText("0");
        }
    }//GEN-LAST:event_btnChiaActionPerformed
    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
        a=Long.parseLong(txtSo.getText());
        pheptoan = "*";
        txtSo.setText("0");
    }//GEN-LAST:event_btnNhanActionPerformed
    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
        a=Long.parseLong(txtSo.getText());
        pheptoan = "-";
        txtSo.setText("0");
    }//GEN-LAST:event_btnTruActionPerformed
    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
        a=Long.parseLong(txtSo.getText());
        pheptoan = "+";
        txtSo.setText("0");
    }//GEN-LAST:event_btnCongActionPerformed
    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        // TODO add your handling code here:
        long kq=0;
        long b=Long.parseLong(txtSo.getText());
        if(pheptoan.length()>0){            
            if(pheptoan.equals("+")){
                kq = a + b;
                txtSo.setText(String.valueOf(kq));
            }
            else if(pheptoan.equals("-")){
                kq = a - b;
                txtSo.setText(String.valueOf(kq));
            }
            else if(pheptoan.equals("*")){
                kq = a * b;
                txtSo.setText(String.valueOf(kq));
            }else{
                kq = a / b;
                txtSo.setText(String.valueOf(kq));
            }
            pheptoan = "";
            a=0;
        }
    }//GEN-LAST:event_btnBangActionPerformed

    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo1ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo1.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo1ActionPerformed
    private void btnSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo2ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo2.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo2ActionPerformed
    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        // TODO add your handling code here:
         String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo3.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo3ActionPerformed
    private void btnSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo4ActionPerformed
        // TODO add your handling code here:
         String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo4.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo4ActionPerformed
    private void btnSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo5ActionPerformed
        // TODO add your handling code here:
         String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo5.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo5ActionPerformed

    private void btnSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo6ActionPerformed
        // TODO add your handling code here:
         String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo6.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo6ActionPerformed
    private void btnSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo7ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo7.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo7ActionPerformed
    private void btnSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo8ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo8.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo8ActionPerformed
    private void btnSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo9ActionPerformed
        // TODO add your handling code here:
         String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo9.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo9ActionPerformed

    private void btnSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo0ActionPerformed
        // TODO add your handling code here:
         String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt="";
            long so = Long.parseLong(gt + btnSo0.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo0ActionPerformed

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
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maytinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1x;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnCongTru;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPhantram;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnSoC;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtSo;
    // End of variables declaration//GEN-END:variables
}
