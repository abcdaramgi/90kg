
package chat;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Chat_Cloud extends javax.swing.JLayeredPane {


    public Chat_Cloud() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0, 0, 0 ,0));
        txt.setOpaque(false);
    }

    public void setText(String text) {
        txt.setText(text);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5 );
        super.paintComponent(grphcs);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt.setFont(new java.awt.Font("굴림", 0, 12)); // NOI18N
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables
}
