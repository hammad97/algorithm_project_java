/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;

/**
 *
 * @author Dell
 */
public class dsGui extends javax.swing.JFrame {

    /**
     * Creates new form dsGui
     */
    public dsGui() {
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

        jLabel1 = new javax.swing.JLabel();
        quickSort = new javax.swing.JButton();
        bucketSort = new javax.swing.JButton();
        bubbleSort = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoproject/Business-Tree-Structure-icon.png"))); // NOI18N
        jLabel1.setText(" Data Structures");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 60));

        quickSort.setText("Binary Search Tree");
        quickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortActionPerformed(evt);
            }
        });
        getContentPane().add(quickSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 40));

        bucketSort.setText("Red Black Tree");
        bucketSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bucketSortActionPerformed(evt);
            }
        });
        getContentPane().add(bucketSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, 40));

        bubbleSort.setText("KD Tree");
        bubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleSortActionPerformed(evt);
            }
        });
        getContentPane().add(bubbleSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 40));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoproject/back-icon.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoproject/image.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickSortActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        bstreeGui obj=new bstreeGui();
        obj.setVisible(true);        

    }//GEN-LAST:event_quickSortActionPerformed

    private void bucketSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bucketSortActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        redblacktreeGui obj=new redblacktreeGui();
        obj.setVisible(true);
    }//GEN-LAST:event_bucketSortActionPerformed

    private void bubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubbleSortActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        kdtreeGui obj=new kdtreeGui();
        obj.setVisible(true);
    }//GEN-LAST:event_bubbleSortActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mainGUI obj=new mainGUI();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(dsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dsGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bubbleSort;
    private javax.swing.JButton bucketSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton quickSort;
    // End of variables declaration//GEN-END:variables
}
