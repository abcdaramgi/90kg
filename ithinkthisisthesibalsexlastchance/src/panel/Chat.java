
package panel;

import chatcomponent.Chat_Body;
import chatcomponent.Chat_Bottom;
import chatcomponent.Chat_Title;
import event.EventChat;
import event.PublicEvent;
import net.miginfocom.swing.MigLayout;


public class Chat extends javax.swing.JPanel {


    public Chat() {
        initComponents();
        init();
    }
    
    public void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%, bottom]0[shrink 0]0"));
        Chat_Title chatTitle = new Chat_Title();
        Chat_Body chatBody = new Chat_Body();
        Chat_Bottom chatBottom = new Chat_Bottom();
        PublicEvent.getInstance().addEventChat(new EventChat(){
        @Override
            public void sendMessage(String text) {
                chatBody.addMyChat(text);
            }
        
        });
        add(chatTitle, "wrap");
        add(chatBody, "wrap");
        add(chatBottom, "h ::30%");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(50, 54, 54));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
