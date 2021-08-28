
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuBigItem extends javax.swing.JPanel {

    boolean menuClicked = false;

    public MenuBigItem(String txt) {
        initComponents();
        Text.setText(txt);
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

        Text = new javax.swing.JLabel();

        setBackground(new java.awt.Color(40, 46, 44));

        Text.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        Text.setForeground(new java.awt.Color(140, 140, 140));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("랜덤매칭");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Text, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text;
    // End of variables declaration//GEN-END:variables
}
