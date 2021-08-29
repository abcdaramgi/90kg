package chatcomponent;

import java.awt.Color;
import javax.swing.Icon;

public class Chat_My extends javax.swing.JLayeredPane {

    public Chat_My() {
        initComponents();
        txt.setBackground(new Color(159, 232, 202));
    }

    public void setText(String text) {
        txt.setText(text);
        rtime.setText("10:30 PM");
    }

    public void setTime(String time) {
        rtime.setText(time);
    }
    
    public void setImage(Icon... image) {
        txt.setImage(false, image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lp2 = new javax.swing.JLayeredPane();
        rtime = new javax.swing.JLabel();
        txt = new chatcomponent.Chat_Cloud();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        rtime.setForeground(new java.awt.Color(204, 204, 204));
        rtime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtime.setText("time");

        lp2.setLayer(rtime, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lp2Layout = new javax.swing.GroupLayout(lp2);
        lp2.setLayout(lp2Layout);
        lp2Layout.setHorizontalGroup(
            lp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rtime)
                .addGap(5, 5, 5))
        );
        lp2Layout.setVerticalGroup(
            lp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(rtime)
                .addGap(5, 5, 5))
        );

        add(lp2);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane lp2;
    private javax.swing.JLabel rtime;
    private chatcomponent.Chat_Cloud txt;
    // End of variables declaration//GEN-END:variables
}
