/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.LogInController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class IngredientImportView extends javax.swing.JPanel {

    /**
     * Creates new form IngredientImportViewHaTQ
     */
    public IngredientImportView() {
        initComponents();
    }

    public JComboBox<String> getCbIngredientList() {
        return cbIngredientList;
    }

    public void setCbIngredientList(JComboBox<String> cbIngredientList) {
        this.cbIngredientList = cbIngredientList;
    }

    public JLabel getLabelUnit() {
        return LabelUnit;
    }

    public void setLabelUnit(JLabel LabelUnit) {
        this.LabelUnit = LabelUnit;
    }

    public JTextField getTxtAmount() {
        return TxtAmount;
    }

    public void setTxtAmount(JTextField TxtAmount) {
        this.TxtAmount = TxtAmount;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JButton getNhapnlButton() {
        return nhapnlButton;
    }

    public void setNhapnlButton(JButton nhapnlButton) {
        this.nhapnlButton = nhapnlButton;
    }

    public JLabel getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(JLabel txtMessage) {
        this.txtMessage = txtMessage;
    }

    public JLabel getLblUnit() {
        return lblUnit;
    }

    public void setLblUnit(JLabel lblUnit) {
        this.lblUnit = lblUnit;
    }

    public JLabel getLblCost() {
        return lblCost;
    }

    public void setLblCost(JLabel lblCost) {
        this.lblCost = lblCost;
    }

    public JTextField getTxtCost() {
        return txtCost;
    }

    public void setTxtCost(JTextField txtCost) {
        this.txtCost = txtCost;
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
        nhapnlButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtAmount = new javax.swing.JTextField();
        txtMessage = new javax.swing.JLabel();
        LabelUnit = new javax.swing.JLabel();
        cbIngredientList = new javax.swing.JComboBox<>();
        lblUnit = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();

        jLabel1.setText("Select Ingredient");

        nhapnlButton.setText("Import");

        jLabel2.setText("Quantity");

        TxtAmount.setText("0");
        TxtAmount.setToolTipText("");
        TxtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAmountActionPerformed(evt);
            }
        });

        LabelUnit.setText("Unit:");

        cbIngredientList.setModel(cbIngredientList.getModel());
        cbIngredientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIngredientListActionPerformed(evt);
            }
        });

        lblCost.setText("Total Cost:");

        txtCost.setText("0");
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbIngredientList, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(nhapnlButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCost)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelUnit))
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(439, 439, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 418, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIngredientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelUnit)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCost)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAmountActionPerformed

    private void cbIngredientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIngredientListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIngredientListActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelUnit;
    private javax.swing.JTextField TxtAmount;
    private javax.swing.JComboBox<String> cbIngredientList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblUnit;
    private javax.swing.JButton nhapnlButton;
    private javax.swing.JTextField txtCost;
    private javax.swing.JLabel txtMessage;
    // End of variables declaration//GEN-END:variables

    

}