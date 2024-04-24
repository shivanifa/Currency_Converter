/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Currency_Converater;

import javax.swing.JOptionPane;

/**
 *
 * @author shiva
 */
public class MyCurrencyConverater extends javax.swing.JFrame {

    String[] currencyUnits={
    "units",
    "US Dollar",
    "Nigerian Naira",
    "Brazilian Real",
    "Canadian Dollar",
    "Kenyan Shilling",
    "Indonesian Rupiah",
    "Indian Rupee",
    "Philippine Pisco",
    "Pakistani Rupee"
    };
    
    double US_Dollar=1.31;
    double Nigerian_Naira=476.57;
    double Brazilian_Real=5.47;
    double Canadian_Dollar=1.71;
    double Kenyan_Shilling=132.53;
    double Indonesian_Rupiah=19554.94;
    double Indian_Rupee=95.21;
    double Philippine_Pisco=71.17;
    double Pakistani_Rupee=162.74;
    
    
    /**
     * Creates new form MyCurrencyConverator
     */
    public MyCurrencyConverater() {
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
        secondCountry = new javax.swing.JComboBox<>();
        firstCountry = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Currency Converter");

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one....", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one....", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("from Currency Of");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("To Currency Of");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("convert currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton3ItemStateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondCountry, 0, 271, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2))
                .addGap(164, 164, 164))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1)
                        .addGap(141, 141, 141)
                        .addComponent(jButton2)
                        .addGap(300, 300, 300)
                        .addComponent(jButton3)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(secondCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondCurrencyUnit)
                    .addComponent(firstCurrencyUnit))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //convert currency
        
        if(firstCountry.getSelectedIndex()==0 || secondCountry.getSelectedIndex()==0 || t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,
                    "You must select  both Countries and must input the amount.","Error Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        double amountToChange=Double.parseDouble(t1.getText());
        
        double amountInPounds=0.0;
        
       
        double amountChanged=0.0;
        
        switch(firstCountry.getSelectedItem().toString())
        {
            case "USA":amountInPounds=amountToChange/US_Dollar;
                       break;
            case "Nigeria":amountInPounds=amountToChange/Nigerian_Naira;
                       break;
            case "Brazil":amountInPounds=amountToChange/Brazilian_Real;
                       break;       
            case "Canada":amountInPounds=amountToChange/Canadian_Dollar;
                       break;
            case "Kenyan":amountInPounds=amountToChange/Kenyan_Shilling;
                       break;
            case "Indonesia":amountInPounds=amountToChange/Indonesian_Rupiah;
                       break;
            case "India":amountInPounds=amountToChange/Indian_Rupee;
                       break; 
            case "Philippine":amountInPounds=amountToChange/Philippine_Pisco;
                       break;
            case "Pakistan":amountInPounds=amountToChange/Pakistani_Rupee;
                       break;           
            default:amountInPounds=0.0;
        } 
        
        //amount is changed in pounds
        switch(secondCountry.getSelectedItem().toString())
        {
            case "USA":amountChanged=amountInPounds*US_Dollar;
                       break;
            case "Nigeria":amountChanged=amountInPounds*Nigerian_Naira;
                       break;            
            case "Brazil":amountChanged=amountInPounds*Brazilian_Real;
                       break;
            case "Canada":amountChanged=amountInPounds*Canadian_Dollar;
                       break;
            case "Kenyan":amountChanged=amountInPounds*Kenyan_Shilling;
                       break;
            case "Indonesia":amountChanged=amountInPounds*Indonesian_Rupiah;
                       break;
            case "India":amountChanged=amountInPounds*Indian_Rupee;
                       break;
            case "Philippine":amountChanged=amountInPounds*Philippine_Pisco;
                       break;
           case "Pakistan":amountChanged=amountInPounds*Pakistani_Rupee;
                       break;
        }
      String value=String.format("%.2f",amountChanged);
        t2.setText(value);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
       
        
        int position=firstCountry.getSelectedIndex();
        
        firstCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        
        int position=secondCountry.getSelectedIndex();
        
        secondCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void jButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton3ItemStateChanged
      
    }//GEN-LAST:event_jButton3ItemStateChanged

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
            java.util.logging.Logger.getLogger(MyCurrencyConverater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConverater().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
