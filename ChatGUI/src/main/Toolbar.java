
package main;

public class Toolbar extends javax.swing.JPanel {


    public Toolbar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        make_name_sibal_so_hard = new javax.swing.JLayeredPane();
        but_Friend = new component.Button();
        but_Matching = new component.Button();
        but_Comunity = new component.Button();
        but_Setting = new component.Button();
        chatButton1 = new component.ChatButton();

        setBackground(new java.awt.Color(20, 24, 20));
        setPreferredSize(new java.awt.Dimension(100, 705));

        make_name_sibal_so_hard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        make_name_sibal_so_hard.setLayout(new javax.swing.BoxLayout(make_name_sibal_so_hard, javax.swing.BoxLayout.Y_AXIS));

        but_Friend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N
        but_Friend.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Friend.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Friend.setNormal(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N
        but_Friend.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Friend.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_moregray (1).png"))); // NOI18N
        but_Friend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_FriendActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Friend);

        but_Matching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (2).png"))); // NOI18N
        but_Matching.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Matching.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Matching.setNormal(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (2).png"))); // NOI18N
        but_Matching.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Matching.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_moregray (2).png"))); // NOI18N
        but_Matching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MatchingActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Matching);

        but_Comunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (3).png"))); // NOI18N
        but_Comunity.setMargin(new java.awt.Insets(0, 0, 0, 0));
        but_Comunity.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Comunity.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Comunity.setNormal(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (3).png"))); // NOI18N
        but_Comunity.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Comunity.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_moregray (3).png"))); // NOI18N
        but_Comunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ComunityActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Comunity);

        but_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (5).png"))); // NOI18N
        but_Setting.setMargin(new java.awt.Insets(0, 0, 0, 0));
        but_Setting.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Setting.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Setting.setNormal(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (5).png"))); // NOI18N
        but_Setting.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Setting.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_moregray (5).png"))); // NOI18N
        but_Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_SettingActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Setting);

        chatButton1.setBackground(new java.awt.Color(20, 24, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(make_name_sibal_so_hard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(make_name_sibal_so_hard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(chatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but_FriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_FriendActionPerformed
        but_Friend.setSelected(true);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(false);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_FriendActionPerformed

    private void but_MatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_MatchingActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(true);
        but_Comunity.setSelected(false);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_MatchingActionPerformed

    private void but_ComunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ComunityActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(true);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_ComunityActionPerformed

    private void but_SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_SettingActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(false);
        but_Setting.setSelected(true);
    }//GEN-LAST:event_but_SettingActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button but_Comunity;
    private component.Button but_Friend;
    private component.Button but_Matching;
    private component.Button but_Setting;
    private component.ChatButton chatButton1;
    private javax.swing.JLayeredPane make_name_sibal_so_hard;
    // End of variables declaration//GEN-END:variables
}
