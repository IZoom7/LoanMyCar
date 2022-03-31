
package LoanMyCar;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LFrame extends javax.swing.JFrame {

    public LFrame() 
    {        
        DefaultComboBoxModel loanterm_payment = new DefaultComboBoxModel();
        
        initComponents();        
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() 
        {
           public void windowClosing(WindowEvent e) 
           {
               int confirmed = JOptionPane.showConfirmDialog(null, 
                  "Do you want to exit?", "Exit Program",
                  JOptionPane.YES_NO_OPTION);

                  if (confirmed == JOptionPane.YES_OPTION) 
                 {
                        dispose();
                 }
           }
      });
        
        loanterm_payment.addElement("1 Year (12 Months)");
        loanterm_payment.addElement("2 Years (24 Months)");
        loanterm_payment.addElement("3 Years (36 Months)");
        loanterm_payment.addElement("4 Years (48 Months)");
        loanterm_payment.addElement("5 Years (60 Months)");
        loanterm_payment.addElement("6 Years (72 Months)");
        
        cmbLoanTerm.setModel(loanterm_payment);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCarprice = new javax.swing.JLabel();
        txtCarprice = new javax.swing.JTextField();
        lblDownpayment = new javax.swing.JLabel();
        txtDownPayment = new javax.swing.JTextField();
        lblLoaninterestrate = new javax.swing.JLabel();
        txtLoaninterestrate = new javax.swing.JTextField();
        lblLoaniTerm = new javax.swing.JLabel();
        btnHomeloanOK = new javax.swing.JButton();
        cmbLoanTerm = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan My Car");

        lblCarprice.setText("Car Price (THB)");

        txtCarprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarpriceActionPerformed(evt);
            }
        });

        lblDownpayment.setText("Down Payment (%)");

        lblLoaninterestrate.setText("Loan Interest Rate (%)");

        lblLoaniTerm.setText("Loan Term");

        btnHomeloanOK.setText("OK");
        btnHomeloanOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeloanOKMouseClicked(evt);
            }
        });
        btnHomeloanOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeloanOKActionPerformed(evt);
            }
        });

        cmbLoanTerm.setEditable(true);
        cmbLoanTerm.setToolTipText("");

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblLoaniTerm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCarprice)
                                        .addComponent(lblDownpayment))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDownPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCarprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLoaninterestrate)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLoaninterestrate)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHomeloanOK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarprice)
                    .addComponent(txtCarprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDownpayment)
                    .addComponent(txtDownPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaninterestrate)
                    .addComponent(txtLoaninterestrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(lblLoaniTerm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHomeloanOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarpriceActionPerformed
        
    }//GEN-LAST:event_txtCarpriceActionPerformed

    private void btnHomeloanOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeloanOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeloanOKActionPerformed

    private void btnHomeloanOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeloanOKMouseClicked

        String Message;
        float Payment;
        float Total_InterestRate;
        float Float_Downpayment = Float.parseFloat(txtDownPayment.getText());
        float Float_Interestrate = Float.parseFloat(txtLoaninterestrate.getText());
        float Float_Carprice = Float.parseFloat(txtCarprice.getText());
        float Float_Loaninterestrate = Float.parseFloat(txtLoaninterestrate.getText());

        float Total_Downpayment = (Float_Downpayment/100)*Float_Carprice;
        float Total_Financing = Float_Carprice - Total_Downpayment;
        float InterestRate = Total_Financing*(Float_Loaninterestrate * (float)0.01) ;
        float Total_Payment = Total_Financing + InterestRate ;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        Message = "\nCar Price : "+decimalFormat.format(Float_Carprice)+" THB";
        Message += "\n\nDown Payment : "+decimalFormat.format(Total_Downpayment)+" THB";
        Message +="\n\nTotal Financing : "+decimalFormat.format(Total_Financing)+" THB";
        Message += "\n\nInterest Rate : "+decimalFormat.format(InterestRate)+" THB";
        Message += "\n\nTotal Payment :"+decimalFormat.format(Total_Payment)+" THB";

        if(cmbLoanTerm.getSelectedIndex()==0)
        {    
            Total_InterestRate = InterestRate * 1;
            Payment = (Total_Financing + Total_InterestRate)/12;
            
            Message += "\n\n Payment : "+decimalFormat.format(Payment)+" THB/Month";
        }
        else if(cmbLoanTerm.getSelectedIndex()==1)
        {
            Total_InterestRate = InterestRate * 2;
            Payment = (Total_Financing + Total_InterestRate)/24;
            
            Message += "\n\n Payment : "+decimalFormat.format(Payment)+" THB/Month";
        }
        else if(cmbLoanTerm.getSelectedIndex()==2)
        {
            Total_InterestRate = InterestRate * 3;
            Payment = (Total_Financing + Total_InterestRate)/36;
            
            Message += "\n\n Payment : "+decimalFormat.format(Payment)+" THB/Month";
        }
        else if(cmbLoanTerm.getSelectedIndex()==3)
        {
            Total_InterestRate = InterestRate * 4;
            Payment = (Total_Financing + Total_InterestRate)/48;
            
            Message += "\n\n Payment : "+decimalFormat.format(Payment)+" THB/Month";
        }
        else if(cmbLoanTerm.getSelectedIndex()==4)
        {
            Total_InterestRate = InterestRate * 5;
            Payment = (Total_Financing + Total_InterestRate)/60;
            
            Message += "\n\n Payment : "+decimalFormat.format(Payment)+" THB/Month";
        }
        else if(cmbLoanTerm.getSelectedIndex()==5)
        {
            Total_InterestRate = InterestRate * 6;
            Payment = (Total_Financing + Total_InterestRate)/72;
            
            Message += "\n\n Payment : "+decimalFormat.format(Payment)+" THB/Month";
        }

        JOptionPane.showMessageDialog(this, Message);
    }//GEN-LAST:event_btnHomeloanOKMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        
        txtCarprice.setText("");
        txtDownPayment.setText("");
        txtLoaninterestrate.setText("");
        
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(this,"Do you want to exit? ","Exit Program"
                ,JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }   
    }//GEN-LAST:event_btnExitActionPerformed


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
            java.util.logging.Logger.getLogger(LFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHomeloanOK;
    private javax.swing.JComboBox<String> cmbLoanTerm;
    private javax.swing.JLabel lblCarprice;
    private javax.swing.JLabel lblDownpayment;
    private javax.swing.JLabel lblLoaniTerm;
    private javax.swing.JLabel lblLoaninterestrate;
    private javax.swing.JTextField txtCarprice;
    private javax.swing.JTextField txtDownPayment;
    private javax.swing.JTextField txtLoaninterestrate;
    // End of variables declaration//GEN-END:variables
}
