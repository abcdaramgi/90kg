
package chat;

import java.awt.Color;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;


public class Chat_Body extends javax.swing.JPanel {


    public Chat_Body() {
        initComponents();
        init();
        addItemMy("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    private void init() {
        pan_body.setLayout(new MigLayout("fillx"));
        scr_body.setVerticalScrollBar(new JScrollBar());
        scr_body.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    public void addItemMy(String text) {
        Chat_My item = new Chat_My();
        item.setText(text);
        pan_body.add(item, "wrap, w ::80%");
        pan_body.repaint();
        pan_body.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scr_body = new javax.swing.JScrollPane();
        pan_body = new javax.swing.JPanel();

        scr_body.setBorder(null);
        scr_body.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pan_body.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pan_bodyLayout = new javax.swing.GroupLayout(pan_body);
        pan_body.setLayout(pan_bodyLayout);
        pan_bodyLayout.setHorizontalGroup(
            pan_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pan_bodyLayout.setVerticalGroup(
            pan_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        scr_body.setViewportView(pan_body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_body)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_body)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pan_body;
    private javax.swing.JScrollPane scr_body;
    // End of variables declaration//GEN-END:variables
}
