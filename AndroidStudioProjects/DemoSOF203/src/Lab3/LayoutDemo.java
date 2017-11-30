package Lab3;

import java.awt.Color;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Tu Ech
 */
public class LayoutDemo extends javax.swing.JFrame {
int [] mine=new int[4];
    /** Creates new form LayoutDemo */
    public LayoutDemo() {
        initComponents();
        Random ra = new Random();
        int i=0;
        do{
          int r = ra.nextInt(10);
          if(Arrays.binarySearch(mine, r)<0){
            mine[i++]=r;
          }
        }while (i<mine.length);
        Arrays.sort(mine);

        for (int j : mine) {
          System.out.printf("%d ",j);
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRed = new javax.swing.JButton();
        btnGreen = new javax.swing.JButton();
        btnYellow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNorth = new javax.swing.JButton();
        btnCenter = new javax.swing.JButton();
        btnSouth = new javax.swing.JButton();
        btnEast = new javax.swing.JButton();
        btnWest = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtComment = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo Layout");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 10));

        btnRed.setText("Red");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });
        jPanel1.add(btnRed);

        btnGreen.setText("Green");
        btnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreenActionPerformed(evt);
            }
        });
        jPanel1.add(btnGreen);

        btnYellow.setText("Yellow");
        btnYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowActionPerformed(evt);
            }
        });
        jPanel1.add(btnYellow);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnNorth.setText("North");
        btnNorth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNorthActionPerformed(evt);
            }
        });
        jPanel2.add(btnNorth, java.awt.BorderLayout.PAGE_START);

        btnCenter.setText("Center");
        btnCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenterActionPerformed(evt);
            }
        });
        jPanel2.add(btnCenter, java.awt.BorderLayout.CENTER);

        btnSouth.setText("South");
        btnSouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSouthActionPerformed(evt);
            }
        });
        jPanel2.add(btnSouth, java.awt.BorderLayout.PAGE_END);

        btnEast.setText("East");
        btnEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEastActionPerformed(evt);
            }
        });
        jPanel2.add(btnEast, java.awt.BorderLayout.LINE_END);

        btnWest.setText("West");
        btnWest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWestActionPerformed(evt);
            }
        });
        jPanel2.add(btnWest, java.awt.BorderLayout.LINE_START);

        txtComment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtComment.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtComment, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setLayout(new java.awt.GridLayout(2, 5, 5, 5));

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1);

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2);

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3);

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn4);

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5);

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(btn6);

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(btn7);

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(btn8);

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(btn9);

        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(btn0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
      jPanel3.setBackground(Color.red);
      //this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_btnRedActionPerformed

    private void btnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGreenActionPerformed
      jPanel3.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGreenActionPerformed

    private void btnYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowActionPerformed
     jPanel3.setBackground(Color.yellow);
    }//GEN-LAST:event_btnYellowActionPerformed

    private void btnNorthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNorthActionPerformed
      txtComment.setText("North here !");
    }//GEN-LAST:event_btnNorthActionPerformed

    private void btnSouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSouthActionPerformed
      txtComment.setText("Return South !");
    }//GEN-LAST:event_btnSouthActionPerformed

    private void btnWestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWestActionPerformed
      txtComment.setText("Shift to left !");
    }//GEN-LAST:event_btnWestActionPerformed

    private void btnEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEastActionPerformed
      txtComment.setText("Change to right !");
    }//GEN-LAST:event_btnEastActionPerformed

    private void btnCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenterActionPerformed
      txtComment.setText("Oh yeah, center here !");
    }//GEN-LAST:event_btnCenterActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
      isMine(1,btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
      isMine(2, btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      isMine(3, btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
      isMine(4, btn4);
}//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
      isMine(5, btn5);
}//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      isMine(6, btn6);
}//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
      isMine(7, btn7);
}//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
      isMine(8, btn8);
}//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
      isMine(9, btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
      isMine(0, btn0);
    }//GEN-LAST:event_btn0ActionPerformed

    public void isMine(int i, JButton btn){
      if(Arrays.binarySearch(mine, i)<0){
        btn.setBackground(Color.BLUE);
      }
      else{
        JOptionPane.showMessageDialog(null, "Chit tui rui !");
        btn.setText("x");
        btn.setBackground(Color.red);
        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn9.setEnabled(false);

      }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCenter;
    private javax.swing.JButton btnEast;
    private javax.swing.JButton btnGreen;
    private javax.swing.JButton btnNorth;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnSouth;
    private javax.swing.JButton btnWest;
    private javax.swing.JButton btnYellow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtComment;
    // End of variables declaration//GEN-END:variables

}