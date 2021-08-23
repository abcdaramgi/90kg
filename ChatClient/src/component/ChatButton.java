
package component;

import javax.swing.Icon;
import javax.swing.ImageIcon;




public class ChatButton extends Button {
    public ChatButton() {
        super();
        setIcon("/image/icon64 (4).png");
        startChat();
        
        
        //button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon100_gray (1).png"))); // NOI18N
    }
    
    
    public void startChat() {
        System.out.println("gggggggggggggggg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
