
package main;

import java.awt.Color;
import swing.ComponentResizer;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Main extends javax.swing.JFrame {

  
    public Main() {
        initComponents();
        init();
    }
    
    private void init() {
        ComponentResizer com = new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(800, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_Base = new javax.swing.JPanel();
        pan_Title = new javax.swing.JPanel();
        but_Exit = new javax.swing.JButton();
        but_Maximize = new javax.swing.JButton();
        but_Minimize = new javax.swing.JButton();
        pan_Body = new javax.swing.JPanel();
        lobby1 = new main.Lobby();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        pan_Base.setBackground(new java.awt.Color(17, 17, 17));
        pan_Base.setPreferredSize(new java.awt.Dimension(1280, 720));

        pan_Title.setBackground(new java.awt.Color(159, 232, 202));
        pan_Title.setPreferredSize(new java.awt.Dimension(57, 20));
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
        but_Exit.setPreferredSize(new java.awt.Dimension(20, 20));
        but_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ExitActionPerformed(evt);
            }
        });

        but_Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_max.png"))); // NOI18N
        but_Maximize.setBorder(null);
        but_Maximize.setContentAreaFilled(false);
        but_Maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Maximize.setPreferredSize(new java.awt.Dimension(20, 20));
        but_Maximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MaximizeActionPerformed(evt);
            }
        });

        but_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_min.png"))); // NOI18N
        but_Minimize.setBorder(null);
        but_Minimize.setContentAreaFilled(false);
        but_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Minimize.setPreferredSize(new java.awt.Dimension(20, 20));
        but_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_TitleLayout = new javax.swing.GroupLayout(pan_Title);
        pan_Title.setLayout(pan_TitleLayout);
        pan_TitleLayout.setHorizontalGroup(
            pan_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_Maximize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pan_TitleLayout.setVerticalGroup(
            pan_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_TitleLayout.createSequentialGroup()
                .addGroup(pan_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_Maximize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pan_Body.setBackground(new java.awt.Color(17, 17, 17));
        pan_Body.setPreferredSize(new java.awt.Dimension(1280, 705));
        pan_Body.setLayout(new java.awt.BorderLayout());
        pan_Body.add(lobby1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pan_BaseLayout = new javax.swing.GroupLayout(pan_Base);
        pan_Base.setLayout(pan_BaseLayout);
        pan_BaseLayout.setHorizontalGroup(
            pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(pan_Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan_BaseLayout.setVerticalGroup(
            pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_BaseLayout.createSequentialGroup()
                .addComponent(pan_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pan_Body, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private int pX, pY;
    private void pan_TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pan_TitleMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_pan_TitleMouseDragged

    private void pan_TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pan_TitleMousePressed
                    pX = evt.getX();
                    pY = evt.getY();
    }//GEN-LAST:event_pan_TitleMousePressed

    private void but_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_MinimizeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_but_MinimizeActionPerformed

    private void but_MaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_MaximizeActionPerformed
       
    }//GEN-LAST:event_but_MaximizeActionPerformed

    private void but_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_but_ExitActionPerformed

  
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
    private javax.swing.JButton but_Exit;
    private javax.swing.JButton but_Maximize;
    private javax.swing.JButton but_Minimize;
    private main.Lobby lobby1;
    private javax.swing.JPanel pan_Base;
    private javax.swing.JPanel pan_Body;
    private javax.swing.JPanel pan_Title;
    // End of variables declaration//GEN-END:variables
}
