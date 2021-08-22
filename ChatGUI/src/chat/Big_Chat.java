
package chat;

import static java.awt.SystemColor.text;
import main.*;
import net.miginfocom.swing.MigLayout;

public class Big_Chat extends javax.swing.JPanel {


    public Big_Chat() {
        initComponents();
        init();
    }
    
    private void init() {
//        setLayout(new MigLayout("debug, fillx", "0[fill]0", "[]0[100%, bottom]0[]"));
//        Chat_Title chatTitle = new Chat_Title();
//        Chat_Body chatBody = new Chat_Body();
//        Chat_Bottom chatBottom = new Chat_Bottom();
//        add(chatTitle, "wrap");
//        add(chatBody, "wrap");
//        add(chatBottom);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat_Body1 = new chat.Chat_Body();

        setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chat_Body1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(chat_Body1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.Chat_Body chat_Body1;
    // End of variables declaration//GEN-END:variables
}
