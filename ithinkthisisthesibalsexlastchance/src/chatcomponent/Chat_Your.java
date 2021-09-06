package chatcomponent;

import java.awt.Color;
import java.time.LocalTime;
import javax.swing.Icon;

public class Chat_Your extends javax.swing.JLayeredPane {

    public Chat_Your() {
        initComponents();
        txt.setBackground(new Color(255, 255, 255));
    }

    public void setText(String text) {
        if(text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }
    }

    public void setTime() {
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
        String noon;
        
        if(h <= 12) {
            noon = "AM";
        }
        else {
            h -= 12;
            noon = "PM";
        }
            
        rtime.setText(h + ":" + m + " " + noon);
    }
    
    public void setImage(Icon... image) {
        txt.setImage(false, image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blank = new javax.swing.JPanel();
        txt = new chatcomponent.Chat_Cloud();
        lp2 = new javax.swing.JLayeredPane();
        rtime = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        blank.setBackground(new java.awt.Color(50, 54, 54));
        blank.setMaximumSize(new java.awt.Dimension(50, 36));
        blank.setMinimumSize(new java.awt.Dimension(50, 36));
        blank.setOpaque(false);
        blank.setPreferredSize(new java.awt.Dimension(50, 36));

        javax.swing.GroupLayout blankLayout = new javax.swing.GroupLayout(blank);
        blank.setLayout(blankLayout);
        blankLayout.setHorizontalGroup(
            blankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        blankLayout.setVerticalGroup(
            blankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        add(blank);
        add(txt);

        rtime.setForeground(new java.awt.Color(204, 204, 204));
        rtime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtime.setText("time");

        lp2.setLayer(rtime, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lp2Layout = new javax.swing.GroupLayout(lp2);
        lp2.setLayout(lp2Layout);
        lp2Layout.setHorizontalGroup(
            lp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(rtime)
                .addGap(0, 0, 0))
        );
        lp2Layout.setVerticalGroup(
            lp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(rtime)
                .addGap(5, 5, 5))
        );

        add(lp2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blank;
    private javax.swing.JLayeredPane lp2;
    private javax.swing.JLabel rtime;
    private chatcomponent.Chat_Cloud txt;
    // End of variables declaration//GEN-END:variables
}
