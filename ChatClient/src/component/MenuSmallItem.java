
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuSmallItem extends javax.swing.JPanel {

    boolean menuClicked = false;

    public MenuSmallItem() {
        initComponents();
        init();
    }

    public void init(){
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        
        addMouseListener(new MouseAdapter(){
            @Override  
            public void mouseEntered(MouseEvent e) {
                if(!menuClicked){
                    setBackground(new Color(44, 50, 48));
                }
                else {
                    //필요없성~ 
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if(!menuClicked){
                setBackground(new Color(40, 46, 44));
                }
                else {
                    setBackground(new Color(50, 54, 54));
                }
            }
        });
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!menuClicked) {
                    setBackground(new Color(48, 52, 52));
                    menuClicked = true;
                }
                else {
                    menuClicked = false;
                }
            }
        });
        
        
    }
    
    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        if(menuClicked) {
            grphcs.setColor(new Color(255, 255, 255));
            grphcs.fillRect(4 - getWidth(), 0 , getWidth(), getHeight());
        }

    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(40, 46, 44));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 140, 140));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("랜덤매칭");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
