
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JLabel;

public class Button extends javax.swing.JPanel {

    boolean buttonClicked = false;
    private Icon icon;
    
    public Button() {
        initComponents();
        init();
    }
    

    public void cancelButton(boolean clicked) {
        if(!clicked){
            buttonClicked = false;
            setBackground(new Color(32, 38, 35));
        }
    }
    
    public void setIcon(String path){
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
    }
    
    public void init(){
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        
        addMouseListener(new MouseAdapter(){
            @Override  
            public void mouseEntered(MouseEvent e) {
                if(!buttonClicked){
                    setBackground(new Color(36, 42, 39));
                }
                else {

                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if(!buttonClicked){
                    setBackground(new Color(32, 38, 35));
                }
                else {
                    setBackground(new Color(40, 46, 44));
                }
            }
        });
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!buttonClicked) {
                    setBackground(new Color(38, 44, 42));
                    buttonClicked = true;
                }
                else {
                    buttonClicked = false;
                }
            }
        });
        
        
    }
    
    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        if(buttonClicked) {
            grphcs.setColor(new Color(159, 232, 202));
            grphcs.fillRect(4 - getWidth(), 0 , getWidth(), getHeight());
        }

    }
 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new javax.swing.JLabel();

        setBackground(new java.awt.Color(20, 24, 20));
        setPreferredSize(new java.awt.Dimension(100, 100));

        button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon64 (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button;
    // End of variables declaration//GEN-END:variables


}
