
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
        pan_Menu = new javax.swing.JPanel();
        pan_Toolbar = new javax.swing.JPanel();
        lab_Friend = new javax.swing.JLabel();
        lab_Matching = new javax.swing.JLabel();
        lab_Comunity = new javax.swing.JLabel();
        lab_Chatting = new javax.swing.JLabel();
        lab_Setting = new javax.swing.JLabel();
        pan_Title = new javax.swing.JPanel();
        but_Exit = new javax.swing.JButton();
        but_Maximize = new javax.swing.JButton();
        but_Minimize = new javax.swing.JButton();
        pan_Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        pan_Base.setBackground(new java.awt.Color(17, 17, 17));

        pan_Menu.setBackground(new java.awt.Color(38, 38, 38));
        pan_Menu.setPreferredSize(new java.awt.Dimension(300, 700));

        pan_Toolbar.setBackground(new java.awt.Color(159, 232, 202));

        lab_Friend.setBackground(new java.awt.Color(38, 38, 38));
        lab_Friend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Friend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N

        lab_Matching.setBackground(new java.awt.Color(38, 38, 38));
        lab_Matching.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Matching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (2).png"))); // NOI18N

        lab_Comunity.setBackground(new java.awt.Color(38, 38, 38));
        lab_Comunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Comunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (3).png"))); // NOI18N

        lab_Chatting.setBackground(new java.awt.Color(38, 38, 38));
        lab_Chatting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Chatting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (4).png"))); // NOI18N

        lab_Setting.setBackground(new java.awt.Color(51, 255, 204));
        lab_Setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (5).png"))); // NOI18N

        javax.swing.GroupLayout pan_ToolbarLayout = new javax.swing.GroupLayout(pan_Toolbar);
        pan_Toolbar.setLayout(pan_ToolbarLayout);
        pan_ToolbarLayout.setHorizontalGroup(
            pan_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab_Matching, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Comunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Chatting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pan_ToolbarLayout.setVerticalGroup(
            pan_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ToolbarLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lab_Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Matching, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Comunity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Chatting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Setting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_MenuLayout = new javax.swing.GroupLayout(pan_Menu);
        pan_Menu.setLayout(pan_MenuLayout);
        pan_MenuLayout.setHorizontalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_MenuLayout.createSequentialGroup()
                .addComponent(pan_Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 200, Short.MAX_VALUE))
        );
        pan_MenuLayout.setVerticalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        but_Exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\New Piskel (12).png")); // NOI18N
        but_Exit.setBorder(null);
        but_Exit.setContentAreaFilled(false);
        but_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Exit.setPreferredSize(new java.awt.Dimension(20, 20));
        but_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ExitActionPerformed(evt);
            }
        });

        but_Maximize.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\New Piskel (11).png")); // NOI18N
        but_Maximize.setBorder(null);
        but_Maximize.setContentAreaFilled(false);
        but_Maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but_Maximize.setPreferredSize(new java.awt.Dimension(20, 20));
        but_Maximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MaximizeActionPerformed(evt);
            }
        });

        but_Minimize.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\New Piskel (10).png")); // NOI18N
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

        pan_Content.setBackground(new java.awt.Color(17, 17, 17));

        javax.swing.GroupLayout pan_ContentLayout = new javax.swing.GroupLayout(pan_Content);
        pan_Content.setLayout(pan_ContentLayout);
        pan_ContentLayout.setHorizontalGroup(
            pan_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        pan_ContentLayout.setVerticalGroup(
            pan_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pan_BaseLayout = new javax.swing.GroupLayout(pan_Base);
        pan_Base.setLayout(pan_BaseLayout);
        pan_BaseLayout.setHorizontalGroup(
            pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(pan_BaseLayout.createSequentialGroup()
                .addComponent(pan_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pan_Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan_BaseLayout.setVerticalGroup(
            pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_BaseLayout.createSequentialGroup()
                .addComponent(pan_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan_Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    private javax.swing.JLabel lab_Chatting;
    private javax.swing.JLabel lab_Comunity;
    private javax.swing.JLabel lab_Friend;
    private javax.swing.JLabel lab_Matching;
    private javax.swing.JLabel lab_Setting;
    private javax.swing.JPanel pan_Base;
    private javax.swing.JPanel pan_Content;
    private javax.swing.JPanel pan_Menu;
    private javax.swing.JPanel pan_Title;
    private javax.swing.JPanel pan_Toolbar;
    // End of variables declaration//GEN-END:variables
}
