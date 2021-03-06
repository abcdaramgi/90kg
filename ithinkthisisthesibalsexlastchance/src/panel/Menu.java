
package panel;

import chatcomponent.UserItem;
import java.awt.Color;
import static java.awt.SystemColor.menu;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;


public class Menu extends javax.swing.JPanel {


    public Menu() {
        initComponents();
        init();
    }

    private void init() {
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getViewport().setBackground(new Color(40,46,44));        //이렇게 안하면 스크롤 배경색깔 안바뀜
        friend.setLayout(new MigLayout("fillx", "0[fill]0", "0[fill]0"));
    }
    

    
    public void showMatching() {
        friend.removeAll();
        refreshList();
        
    }
    
    public void showChatting() {
        friend.removeAll();
        for(int i = 0 ; i < 25 ; i++ ) {
            friend.add(new UserItem("노랑통닭" + i, "ㅎㅇ"), "wrap");
        }
        refreshList();
        
    }

    private void refreshList() {
        friend.repaint();
        friend.revalidate();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        matchbutton = new chatcomponent.Menubutton();
        chatbutton = new chatcomponent.Menubutton();
        scroll = new javax.swing.JScrollPane();
        friend = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(40, 46, 44));

        menu.setMinimumSize(new java.awt.Dimension(200, 82));
        menu.setLayout(new java.awt.GridLayout(2, 1));

        matchbutton.setBorder(null);
        matchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu0.png"))); // NOI18N
        matchbutton.setIconNormal(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu0.png"))); // NOI18N
        matchbutton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu2.png"))); // NOI18N
        matchbutton.setMaximumSize(new java.awt.Dimension(200, 41));
        matchbutton.setMinimumSize(new java.awt.Dimension(200, 41));
        matchbutton.setPreferredSize(new java.awt.Dimension(200, 41));
        matchbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                matchbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                matchbuttonMouseExited(evt);
            }
        });
        matchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchbuttonActionPerformed(evt);
            }
        });
        menu.add(matchbutton);

        chatbutton.setBorder(null);
        chatbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu3.png"))); // NOI18N
        chatbutton.setIconNormal(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu3.png"))); // NOI18N
        chatbutton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu5.png"))); // NOI18N
        chatbutton.setMaximumSize(new java.awt.Dimension(200, 41));
        chatbutton.setMinimumSize(new java.awt.Dimension(200, 41));
        chatbutton.setPreferredSize(new java.awt.Dimension(200, 41));
        chatbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chatbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chatbuttonMouseExited(evt);
            }
        });
        chatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatbuttonActionPerformed(evt);
            }
        });
        menu.add(chatbutton);

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        friend.setOpaque(true);

        javax.swing.GroupLayout friendLayout = new javax.swing.GroupLayout(friend);
        friend.setLayout(friendLayout);
        friendLayout.setHorizontalGroup(
            friendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        friendLayout.setVerticalGroup(
            friendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        scroll.setViewportView(friend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scroll)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchbuttonActionPerformed
        if(!matchbutton.isSelected()) {
            matchbutton.setSelected(true);
            chatbutton.setSelected(false);
            showMatching();
        }
    }//GEN-LAST:event_matchbuttonActionPerformed

    private void chatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatbuttonActionPerformed
        if(!chatbutton.isSelected()) {
            matchbutton.setSelected(false);
            chatbutton.setSelected(true);
            showChatting();
        }
    }//GEN-LAST:event_chatbuttonActionPerformed

    private void matchbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matchbuttonMouseEntered
        if(!matchbutton.isSelected()) {
            matchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu1.png")));
        }
    }//GEN-LAST:event_matchbuttonMouseEntered

    private void matchbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matchbuttonMouseExited
        if(!matchbutton.isSelected()) {
            matchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu0.png")));
        }
    }//GEN-LAST:event_matchbuttonMouseExited

    private void chatbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatbuttonMouseEntered
        if(!chatbutton.isSelected()) {
            chatbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu4.png")));
        }
    }//GEN-LAST:event_chatbuttonMouseEntered

    private void chatbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatbuttonMouseExited
        if(!chatbutton.isSelected()) {
            chatbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100x menu3.png")));
        }
    }//GEN-LAST:event_chatbuttonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chatcomponent.Menubutton chatbutton;
    private javax.swing.JLayeredPane friend;
    private chatcomponent.Menubutton matchbutton;
    private javax.swing.JLayeredPane menu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
