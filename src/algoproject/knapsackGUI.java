/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Dell
 */
public class knapsackGUI extends javax.swing.JFrame {

    /**
     * Creates new form knapsackGUI
     */
    public knapsackGUI() {
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
        jLabel2 = new javax.swing.JLabel();
        wValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        iValue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vArray = new javax.swing.JTextField();
        wArray = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        table2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        table1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        filePath = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoproject/binary-icon.png"))); // NOI18N
        jLabel1.setText(" 0/1 Knapsack");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, 44));

        jLabel2.setText("Value of W:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(wValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 66, -1));

        jLabel3.setText("Value of i:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));
        getContentPane().add(iValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 66, -1));

        jLabel4.setText("Values for v[] :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        vArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vArrayActionPerformed(evt);
            }
        });
        getContentPane().add(vArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 426, -1));

        wArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wArrayActionPerformed(evt);
            }
        });
        getContentPane().add(wArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 426, -1));

        jLabel5.setText("Values for w[] :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setText("Table:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Output :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 80, 20));
        getContentPane().add(table2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 210, 240));

        jLabel8.setText("Keep Table:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));
        getContentPane().add(table1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, 240));

        jLabel9.setText("File path:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        filePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathActionPerformed(evt);
            }
        });
        filePath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filePathKeyReleased(evt);
            }
        });
        getContentPane().add(filePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 426, -1));

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(generateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, 32));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoproject/back-icon.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoproject/image.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:

        try{
                int tW = Integer.parseInt(wValue.getText());
                int tmyI = Integer.parseInt(iValue.getText());        
                knapsack obj=new knapsack(tW,tmyI);
                
                String vArray = this.vArray.getText();
                StringBuilder sbb=new StringBuilder(vArray);
                sbb.append(',');
                vArray=sbb.toString();
                
                String wArray = this.wArray.getText();
                StringBuilder sbbb=new StringBuilder(wArray);
                sbbb.append(',');
                wArray=sbbb.toString();
                
                int k=1; //10,20,50
                int last=0;
                for(int i=0;i<vArray.length();i++){
                    if(vArray.charAt(i)==','){     
                        String temp=vArray.substring(last, i);
                        obj.v[k]=Integer.parseInt(temp);
                        last=i+1;
                        k++; 
                    }
                }
                k=1;
                last=0;
                for(int i=0;i<wArray.length();i++){
                    if(wArray.charAt(i)==','){
                        String temp=wArray.substring(last, i);
                        obj.w[k]=Integer.parseInt(temp);
                        last=i+1;
                        k++; 
                    }
                }
                obj.calculate();
                this.table1.setText(obj.table1);
                this.table2.setText(obj.table2);
                JOptionPane.showMessageDialog(null, obj.finalResult);                
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void vArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vArrayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vArrayActionPerformed

    private void wArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wArrayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wArrayActionPerformed

    private void filePathKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filePathKeyReleased
        // TODO add your handling code here:
        File f = new File(filePath.getText());    
        if(f.exists()){
            String fPath=filePath.getText();
            int count=0;

		try (BufferedReader br = new BufferedReader(new FileReader(fPath))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
                            if(count==0){
                                wValue.setText(sCurrentLine);
                            }
                            else if (count==1){
                                iValue.setText(sCurrentLine);
                            }
                            else if (count==2){
                                vArray.setText(sCurrentLine);
                            }
                            else if (count==3){
                                wArray.setText(sCurrentLine);
                            }
                            count++;
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    }//GEN-LAST:event_filePathKeyReleased

    private void filePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filePathActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mainGUI obj=new mainGUI();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(knapsackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(knapsackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(knapsackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(knapsackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new knapsackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filePath;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField iValue;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel table1;
    private javax.swing.JLabel table2;
    private javax.swing.JTextField vArray;
    private javax.swing.JTextField wArray;
    private javax.swing.JTextField wValue;
    // End of variables declaration//GEN-END:variables
}
