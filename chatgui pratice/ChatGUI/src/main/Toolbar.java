
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
        but_Chatting = new component.Button();
        but_Setting = new component.Button();

        setBackground(new java.awt.Color(159, 232, 202));
        setPreferredSize(new java.awt.Dimension(100, 705));

        make_name_sibal_so_hard.setLayout(new javax.swing.BoxLayout(make_name_sibal_so_hard, javax.swing.BoxLayout.PAGE_AXIS));

        but_Friend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N
        but_Friend.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Friend.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Friend.setNormal(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N
        but_Friend.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Friend.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_gray (1).png"))); // NOI18N
        but_Friend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_FriendActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Friend);

        but_Matching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (2).png"))); // NOI18N
        but_Matching.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Matching.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Matching.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Matching.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_more (2).png"))); // NOI18N
        but_Matching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_MatchingActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Matching);

        but_Comunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (3).png"))); // NOI18N
        but_Comunity.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Comunity.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Comunity.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Comunity.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_more (3).png"))); // NOI18N
        but_Comunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ComunityActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Comunity);

        but_Chatting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (4).png"))); // NOI18N
        but_Chatting.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Chatting.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Chatting.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Chatting.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_more (4).png"))); // NOI18N
        but_Chatting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ChattingActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Chatting);

        but_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (5).png"))); // NOI18N
        but_Setting.setMaximumSize(new java.awt.Dimension(100, 100));
        but_Setting.setMinimumSize(new java.awt.Dimension(100, 100));
        but_Setting.setPreferredSize(new java.awt.Dimension(100, 100));
        but_Setting.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_more (5).png"))); // NOI18N
        but_Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_SettingActionPerformed(evt);
            }
        });
        make_name_sibal_so_hard.add(but_Setting);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(make_name_sibal_so_hard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(make_name_sibal_so_hard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but_FriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_FriendActionPerformed
        but_Friend.setSelected(true);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(false);
        but_Chatting.setSelected(false);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_FriendActionPerformed

    private void but_MatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_MatchingActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(true);
        but_Comunity.setSelected(false);
        but_Chatting.setSelected(false);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_MatchingActionPerformed

    private void but_ComunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ComunityActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(true);
        but_Chatting.setSelected(false);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_ComunityActionPerformed

    private void but_ChattingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ChattingActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(false);
        but_Chatting.setSelected(true);
        but_Setting.setSelected(false);
    }//GEN-LAST:event_but_ChattingActionPerformed

    private void but_SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_SettingActionPerformed
        but_Friend.setSelected(false);
        but_Matching.setSelected(false);
        but_Comunity.setSelected(false);
        but_Chatting.setSelected(false);
        but_Setting.setSelected(true);
    }//GEN-LAST:event_but_SettingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button but_Chatting;
    private component.Button but_Comunity;
    private component.Button but_Friend;
    private component.Button but_Matching;
    private component.Button but_Setting;
    private javax.swing.JLayeredPane make_name_sibal_so_hard;
    // End of variables declaration//GEN-END:variables
}
