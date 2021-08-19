
package main;

import java.awt.Color;

public class Lobby_sibal extends javax.swing.JFrame {


    public Lobby_sibal() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        pan_Content = new javax.swing.JPanel();
        opaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pan_Base.setBackground(new java.awt.Color(17, 17, 17));

        pan_Menu.setBackground(new java.awt.Color(38, 38, 38));

        pan_Toolbar.setBackground(new java.awt.Color(159, 232, 202));

        lab_Friend.setBackground(new java.awt.Color(111, 200, 111));
        lab_Friend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Friend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N
        lab_Friend.setOpaque(true);
        lab_Friend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_FriendMouseClicked(evt);
            }
        });

        lab_Matching.setBackground(new java.awt.Color(38, 38, 38));
        lab_Matching.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Matching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (2).png"))); // NOI18N
        lab_Matching.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_MatchingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_MatchingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_MatchingMouseExited(evt);
            }
        });

        lab_Comunity.setBackground(new java.awt.Color(38, 38, 38));
        lab_Comunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Comunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (3).png"))); // NOI18N
        lab_Comunity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_ComunityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_ComunityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_ComunityMouseExited(evt);
            }
        });

        lab_Chatting.setBackground(new java.awt.Color(38, 38, 38));
        lab_Chatting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Chatting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (4).png"))); // NOI18N
        lab_Chatting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_ChattingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_ChattingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_ChattingMouseExited(evt);
            }
        });

        lab_Setting.setBackground(new java.awt.Color(51, 255, 204));
        lab_Setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (5).png"))); // NOI18N
        lab_Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_SettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_SettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_SettingMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pan_ToolbarLayout = new javax.swing.GroupLayout(pan_Toolbar);
        pan_Toolbar.setLayout(pan_ToolbarLayout);
        pan_ToolbarLayout.setHorizontalGroup(
            pan_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab_Matching, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Comunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Chatting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab_Setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pan_ToolbarLayout.createSequentialGroup()
                .addComponent(lab_Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        pan_ToolbarLayout.setVerticalGroup(
            pan_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ToolbarLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lab_Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Matching, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Comunity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Chatting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lab_Setting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_MenuLayout = new javax.swing.GroupLayout(pan_Menu);
        pan_Menu.setLayout(pan_MenuLayout);
        pan_MenuLayout.setHorizontalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_MenuLayout.createSequentialGroup()
                .addComponent(pan_Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pan_MenuLayout.setVerticalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pan_MenuLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pan_Content.setBackground(new java.awt.Color(38, 38, 38));

        opaque.setText("opaque");
        opaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_ContentLayout = new javax.swing.GroupLayout(pan_Content);
        pan_Content.setLayout(pan_ContentLayout);
        pan_ContentLayout.setHorizontalGroup(
            pan_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ContentLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(opaque)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        pan_ContentLayout.setVerticalGroup(
            pan_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ContentLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(opaque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_BaseLayout = new javax.swing.GroupLayout(pan_Base);
        pan_Base.setLayout(pan_BaseLayout);
        pan_BaseLayout.setHorizontalGroup(
            pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_BaseLayout.createSequentialGroup()
                .addComponent(pan_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan_Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan_BaseLayout.setVerticalGroup(
            pan_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pan_Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lab_MatchingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_MatchingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lab_MatchingMouseClicked

    private void lab_MatchingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_MatchingMouseEntered
        lab_Matching.setOpaque(true);
        lab_Matching.setBackground(new Color(137, 218, 182, 255));
    }//GEN-LAST:event_lab_MatchingMouseEntered

    private void lab_MatchingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_MatchingMouseExited
        lab_Matching.setBackground(new Color(159, 232, 202, 255));
    }//GEN-LAST:event_lab_MatchingMouseExited

    private void lab_ComunityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_ComunityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lab_ComunityMouseClicked

    private void lab_ComunityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_ComunityMouseEntered
        lab_Comunity.setOpaque(true);
        lab_Comunity.setBackground(new Color(137, 218, 182, 255));
    }//GEN-LAST:event_lab_ComunityMouseEntered

    private void lab_ComunityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_ComunityMouseExited
        lab_Comunity.setBackground(new Color(159, 232, 202, 255));
    }//GEN-LAST:event_lab_ComunityMouseExited

    private void lab_ChattingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_ChattingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lab_ChattingMouseClicked

    private void lab_ChattingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_ChattingMouseEntered
        lab_Chatting.setOpaque(true);
        lab_Chatting.setBackground(new Color(137, 218, 182, 255));    
    }//GEN-LAST:event_lab_ChattingMouseEntered

    private void lab_ChattingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_ChattingMouseExited
        lab_Chatting.setBackground(new Color(159, 232, 202, 255));
    }//GEN-LAST:event_lab_ChattingMouseExited

    private void lab_SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_SettingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lab_SettingMouseClicked

    private void lab_SettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_SettingMouseEntered
        lab_Setting.setOpaque(true);
        lab_Setting.setBackground(new Color(137, 218, 182, 255));
    }//GEN-LAST:event_lab_SettingMouseEntered

    private void lab_SettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_SettingMouseExited
        lab_Setting.setBackground(new Color(159, 232, 202, 255));
    }//GEN-LAST:event_lab_SettingMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lab_Matching.setOpaque(true);
        lab_Matching.setBackground(new Color(38, 38, 38, 255));
        lab_Matching.setOpaque(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void opaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opaqueActionPerformed
        lab_Friend.setOpaque(true);
        lab_Friend.setBackground(new Color(38,38,38,255));
        lab_Friend.setOpaque(false);
    }//GEN-LAST:event_opaqueActionPerformed

    private void lab_FriendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_FriendMouseClicked
        lab_Friend.setOpaque(true);
        lab_Friend.setBackground(new Color(38,38,38,255));
        lab_Friend.setOpaque(false);
    }//GEN-LAST:event_lab_FriendMouseClicked

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
            java.util.logging.Logger.getLogger(Lobby_sibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby_sibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby_sibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby_sibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby_sibal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lab_Chatting;
    private javax.swing.JLabel lab_Comunity;
    private javax.swing.JLabel lab_Friend;
    private javax.swing.JLabel lab_Matching;
    private javax.swing.JLabel lab_Setting;
    private javax.swing.JButton opaque;
    private javax.swing.JPanel pan_Base;
    private javax.swing.JPanel pan_Content;
    private javax.swing.JPanel pan_Menu;
    private javax.swing.JPanel pan_Toolbar;
    // End of variables declaration//GEN-END:variables
}
