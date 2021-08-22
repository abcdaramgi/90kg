
package chat;

import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import swing.JIMSendTextPane;


public class Chat_Bottom extends javax.swing.JPanel {


    public Chat_Bottom() {
        initComponents();
        init();
    }

    public void init() {
        setLayout(new MigLayout("fillx, filly", "", ""));
        JScrollPane scroll = new JScrollPane();
        JIMSendTextPane txt = new JIMSendTextPane();
        scroll.setViewportView(txt);
        add(scroll, "w 100%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
