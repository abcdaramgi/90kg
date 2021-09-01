
package component;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class UserItem extends javax.swing.JPanel {


    public UserItem(String name, String txt) {
        initComponents();
        who.setText(name);
        msg.setText(txt);
        init();
    }

    
    private void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(50, 54, 54));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(40, 46, 44));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new swing.ImageAvatar();
        who = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(40, 46, 44));
        setPreferredSize(new java.awt.Dimension(200, 60));

        imageAvatar1.setBorderColor(new java.awt.Color(159, 232, 202));
        imageAvatar1.setBorderSize(1);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/람쥐수정.png"))); // NOI18N
        imageAvatar1.setMinimumSize(new java.awt.Dimension(60, 60));
        imageAvatar1.setPreferredSize(new java.awt.Dimension(50, 50));

        who.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        who.setForeground(new java.awt.Color(140, 140, 140));
        who.setText("다람쥐");

        msg.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        msg.setForeground(new java.awt.Color(140, 140, 140));
        msg.setText("ㄱㄱ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msg)
                    .addComponent(who))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(who)
                        .addGap(0, 0, 0)
                        .addComponent(msg)))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel who;
    // End of variables declaration//GEN-END:variables
}
