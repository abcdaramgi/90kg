
package component;

import java.awt.Color;
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
    
    
    public void setIcon(String path){
        System.out.println("set Icon");
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
    }
    
    public void init(){
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        addMouseListener(new MouseAdapter(){
            @Override  
            public void mouseEntered(MouseEvent e) {
                if(!buttonClicked){
                    setBackground(new Color(28,32,28));
                }
                else {
                    setBackground(new Color(144,144,144));
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if(!buttonClicked){
                setBackground(new Color(20,24,20));
                }
                else {
                    setBackground(new Color(98,98,98));
                }
            }
        });
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!buttonClicked) {
                    setBackground(new Color(111,111,111));
                    buttonClicked = true;
                }
                else {
                    buttonClicked = false;
                }
            }
        });
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(100, 100));

        button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_gray (1).png"))); // NOI18N

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
