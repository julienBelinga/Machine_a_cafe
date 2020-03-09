/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julien.belinga
 */
public class DistribFrame extends javax.swing.JFrame {

    private CDistributeur distrib;
    /**
     * Creates new form DistribFrame
     */
    public DistribFrame() {
        initComponents();
        CBoisson cafeCourt = new CBoisson("café court", 35, false, 5);
        CBoisson cafeCourtSansSucre = new CBoisson("café court", 35, true, 5);
        CBoisson cafeLong = new CBoisson("café long", 35, false, 10);
        CBoisson cafeLongSansSucre = new CBoisson("café long", 35, true, 10);
        CBoisson chocolat = new CBoisson("chocolat chaud", 40, false, 10);
        CBoisson cappuccino = new CBoisson("cappuccino", 40, false, 10);
        CBoisson potageTomate = new CBoisson("potage tomate", 40, false, 10);
        
        distrib = new CDistributeur();
        
        distrib.ajouterBoisson(cafeCourt);
        distrib.ajouterBoisson(cafeCourtSansSucre);
        distrib.ajouterBoisson(cafeLong);
        distrib.ajouterBoisson(cafeLongSansSucre);
        distrib.ajouterBoisson(chocolat);
        distrib.ajouterBoisson(cappuccino);
        distrib.ajouterBoisson(potageTomate);
        
        jLabelAfficheur.setText("sucre :" + MAJaff());
        jListLsBoisson = distrib.boissons;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSucreA = new javax.swing.JButton();
        jButtonSucreD = new javax.swing.JButton();
        jLabelAfficheur = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLsBoisson = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSucreA.setText("sucre +");
        jButtonSucreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSucreAActionPerformed(evt);
            }
        });

        jButtonSucreD.setText("sucre -");
        jButtonSucreD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSucreDActionPerformed(evt);
            }
        });

        jLabelAfficheur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAfficheur.setText("---");

        jListLsBoisson.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListLsBoisson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSucreD)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonSucreA)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelAfficheur)
                        .addGap(91, 91, 91))))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAfficheur)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSucreA)
                    .addComponent(jButtonSucreD))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSucreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSucreAActionPerformed
        // TODO add your handling code here:
        distrib.augmenterSucre();
        jLabelAfficheur.setText("sucre :" + MAJaff());
    }//GEN-LAST:event_jButtonSucreAActionPerformed

    private void jButtonSucreDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSucreDActionPerformed
        // TODO add your handling code here:
        distrib.diminuerSucre();
        jLabelAfficheur.setText("sucre :" + MAJaff());
    }//GEN-LAST:event_jButtonSucreDActionPerformed

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
            java.util.logging.Logger.getLogger(DistribFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistribFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistribFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistribFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistribFrame().setVisible(true);
            }
        });
    }
    
    private int MAJaff(){
        distrib.getSucre();
        
        return distrib.getSucre();
    }
    
    private void affListeBoisson(){
        for(int i = 0; i < 6; i++) {   
    System.out.print(distrib.boissons.get(i));
}  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSucreA;
    private javax.swing.JButton jButtonSucreD;
    private javax.swing.JLabel jLabelAfficheur;
    private javax.swing.JList<String> jListLsBoisson;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
