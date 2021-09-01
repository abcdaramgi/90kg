
package chatcomponent;

import java.awt.Color;
import java.awt.Graphics;


public class Chat_Title extends javax.swing.JPanel {


    public Chat_Title() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(159, 232, 202));
        grphcs.fillRect(0, getHeight() - 1 , getWidth(), getHeight());

    }
    
    public void setUserName(String userName) {
        name.setText(userName);
    }
    
    public void setUserStatus( ) {
        status.setText("현재 활동중");
        status.setForeground(new Color(0, 204, 102));
    }
    
    public void setStatusText(String text) {
        status.setText(text);
        status.setForeground(new Color(0, 204, 102));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lp = new javax.swing.JLayeredPane();
        name = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(new java.awt.Color(37, 41, 39));

        lp.setLayout(new java.awt.GridLayout(0, 1));

        name.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("다람쥐");
        lp.add(name);

        status.setForeground(new java.awt.Color(0, 204, 102));
        status.setText("지금 활동중");
        lp.add(status);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane lp;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
