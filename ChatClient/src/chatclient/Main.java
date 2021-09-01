
package chatclient;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import swing.ComponentResizer;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        init();
    }

    public void init() {      
        ComponentResizer com = new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(600, 525));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
    }
           


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_Border = new javax.swing.JPanel();
        pan_Body = new javax.swing.JPanel();
        pan_Title = new javax.swing.JPanel();
        but_Exit = new javax.swing.JButton();
        but_Max = new javax.swing.JButton();
        but_Min = new javax.swing.JButton();
        body = new panel.Body();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pan_Border.setBackground(new java.awt.Color(40, 46, 44));

        pan_Body.setBackground(new java.awt.Color(40, 46, 44));

        pan_Title.setBackground(new java.awt.Color(159, 232, 202));
        pan_Title.setMinimumSize(new java.awt.Dimension(75, 100));
        pan_Title.setPreferredSize(new java.awt.Dimension(1280, 25));
        pan_Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pan_TitleMouseDragged(evt);
            }
        });
        pan_Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pan_TitleMousePressed(evt);
            }
        });

        but_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_exit.png"))); // NOI18N
        but_Exit.setBorder(null);
        but_Exit.setContentAreaFilled(false);
        but_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Exit.setMaximumSize(new java.awt.Dimension(25, 25));
        but_Exit.setMinimumSize(new java.awt.Dimension(25, 25));
        but_Exit.setPreferredSize(new java.awt.Dimension(25, 25));
        but_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ExitActionPerformed(evt);
            }
        });

        but_Max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_max.png"))); // NOI18N
        but_Max.setBorder(null);
        but_Max.setContentAreaFilled(false);
        but_Max.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Max.setMaximumSize(new java.awt.Dimension(25, 25));
        but_Max.setMinimumSize(new java.awt.Dimension(25, 25));
        but_Max.setPreferredSize(new java.awt.Dimension(25, 25));
        but_Max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MaxActionPerformed(evt);
            }
        });

        but_Min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_min.png"))); // NOI18N
        but_Min.setBorder(null);
        but_Min.setContentAreaFilled(false);
        but_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Min.setMaximumSize(new java.awt.Dimension(25, 25));
        but_Min.setMinimumSize(new java.awt.Dimension(25, 25));
        but_Min.setPreferredSize(new java.awt.Dimension(25, 25));
        but_Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_TitleLayout = new javax.swing.GroupLayout(pan_Title);
        pan_Title.setLayout(pan_TitleLayout);
        pan_TitleLayout.setHorizontalGroup(
            pan_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_TitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(but_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(but_Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(but_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pan_TitleLayout.setVerticalGroup(
            pan_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(but_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(but_Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(but_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pan_BodyLayout = new javax.swing.GroupLayout(pan_Body);
        pan_Body.setLayout(pan_BodyLayout);
        pan_BodyLayout.setHorizontalGroup(
            pan_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pan_BodyLayout.setVerticalGroup(
            pan_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_BodyLayout.createSequentialGroup()
                .addComponent(pan_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pan_BorderLayout = new javax.swing.GroupLayout(pan_Border);
        pan_Border.setLayout(pan_BorderLayout);
        pan_BorderLayout.setHorizontalGroup(
            pan_BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan_BorderLayout.setVerticalGroup(
            pan_BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void but_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_but_ExitActionPerformed

    private void but_MaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_MaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_MaxActionPerformed

    private void but_MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_MinActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_but_MinActionPerformed

    private int pX, pY;
    private void pan_TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pan_TitleMousePressed
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_pan_TitleMousePressed

    private void pan_TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pan_TitleMouseDragged
       this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_pan_TitleMouseDragged


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panel.Body body;
    private javax.swing.JButton but_Exit;
    private javax.swing.JButton but_Max;
    private javax.swing.JButton but_Min;
    private javax.swing.JPanel pan_Body;
    private javax.swing.JPanel pan_Border;
    private javax.swing.JPanel pan_Title;
    // End of variables declaration//GEN-END:variables
}
