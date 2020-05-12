
package restaurantsystem.component.labour;

import restaurantsystem.MainMenu;


public class LabourManagement extends javax.swing.JFrame {

    
    public LabourManagement() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addLabour = new javax.swing.JButton();
        viewLabour = new javax.swing.JButton();
        deleteLabour = new javax.swing.JButton();
        updateLabour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setBackground(new java.awt.Color(0, 225, 0));
        jButton6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(225, 225, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        addLabour.setBackground(new java.awt.Color(0, 225, 0));
        addLabour.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        addLabour.setText("Add Labour");
        addLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLabourActionPerformed(evt);
            }
        });

        viewLabour.setBackground(new java.awt.Color(0, 225, 0));
        viewLabour.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        viewLabour.setText("View Labour");
        viewLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLabourActionPerformed(evt);
            }
        });

        deleteLabour.setBackground(new java.awt.Color(0, 225, 0));
        deleteLabour.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        deleteLabour.setText("Delete Labour");
        deleteLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLabourActionPerformed(evt);
            }
        });

        updateLabour.setBackground(new java.awt.Color(0, 225, 0));
        updateLabour.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        updateLabour.setText("Update Labour");
        updateLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLabourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewLabour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addLabour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteLabour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateLabour, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addLabour, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewLabour, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteLabour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateLabour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLabourActionPerformed
        
        AddLabour i = new AddLabour();
        i.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_addLabourActionPerformed

    private void viewLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLabourActionPerformed
        
        ViewLabour vl = new ViewLabour();
        vl.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_viewLabourActionPerformed

    private void deleteLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLabourActionPerformed
        
        DeleteLabour dl = new DeleteLabour();
        dl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteLabourActionPerformed

    private void updateLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLabourActionPerformed
        
        UpdateLabour ml = new UpdateLabour();
        ml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateLabourActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        MainMenu rm = new MainMenu();
        rm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new LabourManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLabour;
    private javax.swing.JButton deleteLabour;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton updateLabour;
    private javax.swing.JButton viewLabour;
    // End of variables declaration//GEN-END:variables
}
