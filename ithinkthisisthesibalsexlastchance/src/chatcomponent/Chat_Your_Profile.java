package chatcomponent;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;

public class Chat_Your_Profile extends javax.swing.JLayeredPane {

    public Chat_Your_Profile() {
        initComponents();
    }

    public void setImageProfile(Icon image) {
        pro_image.setImage(image);
    }
    
    public void setUserProfile(String user) {
        lab_name.setText(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lp2 = new javax.swing.JLayeredPane();
        lab_name = new javax.swing.JLabel();
        lp = new javax.swing.JLayeredPane();
        pro_image = new swing.ImageAvatar();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        lab_name.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lab_name.setForeground(new java.awt.Color(204, 204, 204));
        lab_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_name.setText("다람쥐");

        lp2.setLayer(lab_name, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lp2Layout = new javax.swing.GroupLayout(lp2);
        lp2.setLayout(lp2Layout);
        lp2Layout.setHorizontalGroup(
            lp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lp2Layout.setVerticalGroup(
            lp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lab_name))
        );

        add(lp2);

        pro_image.setBorderSize(1);
        pro_image.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/다람쥐.jpg"))); // NOI18N
        pro_image.setMaximumSize(new java.awt.Dimension(36, 36));
        pro_image.setMinimumSize(new java.awt.Dimension(36, 36));

        lp.setLayer(pro_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pro_image, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pro_image, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        add(lp);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lab_name;
    private javax.swing.JLayeredPane lp;
    private javax.swing.JLayeredPane lp2;
    private swing.ImageAvatar pro_image;
    // End of variables declaration//GEN-END:variables
}