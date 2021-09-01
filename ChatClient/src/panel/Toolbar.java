
package panel;

import component.MenuBigItem;
import java.awt.Color;
import static java.awt.SystemColor.menu;


public class Toolbar extends javax.swing.JPanel {
    
    boolean buttonClicked = false;

    public Toolbar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        friendButton = new component.FriendButton();
        matchingButton = new component.MatchingButton();
        comunityButton = new component.ComunityButton();
        settingButton = new component.SettingButton();
        chatButton = new component.ChatButton();

        setBackground(new java.awt.Color(32, 38, 35));

        friendButton.setBackground(new java.awt.Color(32, 38, 35));
        friendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendButtonMouseClicked(evt);
            }
        });

        matchingButton.setBackground(new java.awt.Color(32, 38, 35));
        matchingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matchingButtonMouseClicked(evt);
            }
        });

        comunityButton.setBackground(new java.awt.Color(32, 38, 35));
        comunityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comunityButtonMouseClicked(evt);
            }
        });

        settingButton.setBackground(new java.awt.Color(32, 38, 35));
        settingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingButtonMouseClicked(evt);
            }
        });

        chatButton.setBackground(new java.awt.Color(32, 38, 35));
        chatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(friendButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(matchingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(comunityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(settingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(chatButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(friendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(matchingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comunityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(settingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(chatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void friendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendButtonMouseClicked
        matchingButton.cancelButton(false);
        comunityButton.cancelButton(false);
        settingButton.cancelButton(false);
        chatButton.cancelButton(false);
    }//GEN-LAST:event_friendButtonMouseClicked

    private void matchingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matchingButtonMouseClicked
        friendButton.cancelButton(false);
        comunityButton.cancelButton(false);
        settingButton.cancelButton(false);
        chatButton.cancelButton(false);
    }//GEN-LAST:event_matchingButtonMouseClicked

    private void comunityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comunityButtonMouseClicked
        friendButton.cancelButton(false);
        matchingButton.cancelButton(false);
        settingButton.cancelButton(false);
        chatButton.cancelButton(false);
    }//GEN-LAST:event_comunityButtonMouseClicked

    private void settingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButtonMouseClicked
        friendButton.cancelButton(false);
        matchingButton.cancelButton(false);
        comunityButton.cancelButton(false);
        chatButton.cancelButton(false);
    }//GEN-LAST:event_settingButtonMouseClicked

    private void chatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatButtonMouseClicked
        friendButton.cancelButton(false);
        matchingButton.cancelButton(false);
        comunityButton.cancelButton(false);
        settingButton.cancelButton(false);
    }//GEN-LAST:event_chatButtonMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ChatButton chatButton;
    private component.ComunityButton comunityButton;
    private component.FriendButton friendButton;
    private component.MatchingButton matchingButton;
    private component.SettingButton settingButton;
    // End of variables declaration//GEN-END:variables
}
