
import java.awt.Color;
import javax.swing.JFrame;
public class Science extends JFrame{
    Template k = new Template();
    public Science() {
        initComponents();
         jTextField1.setBackground(new Color(0 , 0 , 0,64));
         jTextField1.setOpaque(false);
        // jScrollPane2.setBackground(new Color(0,0,0,30));
         jTextArea2.setBackground(new Color(0,0,0,30));
        // jScrollPane2.getViewport().setOpaque(false);
         jTextArea2.setOpaque(false);
       //  jScrollPane2.setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        upload_img = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        spaceX = new javax.swing.JButton();
        technobyte = new javax.swing.JButton();
        thefact = new javax.swing.JButton();
        sciencedaily = new javax.swing.JButton();
        save_file = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setForeground(new java.awt.Color(204, 255, 204));

        upload_img.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        upload_img.setText("Upload Image");
        upload_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_imgActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Usefull Links");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        spaceX.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        spaceX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoyo.jpg"))); // NOI18N
        spaceX.setText("SpaceX");
        spaceX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceXActionPerformed(evt);
            }
        });

        technobyte.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        technobyte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/technobyte.jpg"))); // NOI18N
        technobyte.setText("TechnoByte");
        technobyte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technobyteActionPerformed(evt);
            }
        });

        thefact.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        thefact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefactsite-logo-yoast.jpg"))); // NOI18N
        thefact.setText("TheFact");
        thefact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thefactActionPerformed(evt);
            }
        });

        sciencedaily.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        sciencedaily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/science-daily-cover-495x400.jpg"))); // NOI18N
        sciencedaily.setText("ScienceDaily");
        sciencedaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sciencedailyActionPerformed(evt);
            }
        });

        save_file.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        save_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save.png"))); // NOI18N
        save_file.setText("Save File");
        save_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_fileActionPerformed(evt);
            }
        });

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Title...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(174, 26, 770, 59);

        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sc1.jpeg"))); // NOI18N
        jScrollPane2.setViewportView(jLabel1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 150, 980, 620);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 255));
        jTextArea2.setRows(5);
        jPanel1.add(jTextArea2);
        jTextArea2.setBounds(110, 180, 900, 540);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(technobyte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spaceX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(thefact, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sciencedaily, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(save_file, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upload_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                        .addGap(51, 51, 51))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(technobyte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaceX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thefact, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sciencedaily, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(upload_img, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_file)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void formComponentAdded(java.awt.event.ContainerEvent evt) {                                    
        // TODO add your handling code here:
    } 
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void upload_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_imgActionPerformed
        k.setImage(jLabel1);
    }//GEN-LAST:event_upload_imgActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void spaceXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceXActionPerformed

       k.hyperLink("https://www.spacex.com/");
    }//GEN-LAST:event_spaceXActionPerformed

    private void technobyteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technobyteActionPerformed
      k.hyperLink("https://www.technobyte.org/interesting-facts/");
    }//GEN-LAST:event_technobyteActionPerformed

    private void thefactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thefactActionPerformed
        k.hyperLink("https://www.thefactsite.com/top-100-technology-facts/");
       
    }//GEN-LAST:event_thefactActionPerformed

    private void sciencedailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sciencedailyActionPerformed
        k.hyperLink("https://www.sciencedaily.com/news/");
    }//GEN-LAST:event_sciencedailyActionPerformed

    private void save_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_fileActionPerformed
        String Title=jTextField1.getText();
        k.print(jPanel1,Title);
    }//GEN-LAST:event_save_fileActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Science.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Science().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton save_file;
    private javax.swing.JButton sciencedaily;
    private javax.swing.JButton spaceX;
    private javax.swing.JButton technobyte;
    private javax.swing.JButton thefact;
    private javax.swing.JButton upload_img;
    // End of variables declaration//GEN-END:variables
}
