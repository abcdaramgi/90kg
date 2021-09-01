
package chatcomponent;

import event.PublicEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_SHIFT;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIDefaults;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import net.miginfocom.swing.MigLayout;
import swing.JIMSendTextPane;
import swing.ScrollBar;


public class Chat_Bottom extends javax.swing.JPanel {


    public Chat_Bottom() {
        initComponents();
        init();
    }

    public void init() {
        setLayout(new MigLayout("fillx, filly", "20[]20", "20[fill]20"));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        
        txt.addKeyListener(new KeyAdapter() {
        @Override
            public void keyTyped(KeyEvent e) {
                    
                    if(e.getKeyChar() == '\n'){
                        String text = txt.getText().trim();
                        
                        if (!text.equals("")) {
                            PublicEvent.getInstance().getEventChat().sendMessage(text);
                            txt.setText("");
                            txt.grabFocus();
                            refresh();
                        } else {
                            txt.grabFocus();
                        }   
                    }
                    
                    else{
                        revalidate();
                    }
                        
            }
        });
        
        txt.setHintText("메세지 보내기");
        txt.setFont(new Font("SB 어그로 Light", Font.PLAIN, 16));
        scroll.setBackground(new Color(170, 180, 180));
        scroll.getViewport().setBackground(new Color(40,46,44));
        
        ScrollBar sb = new ScrollBar();
        scroll.setVerticalScrollBar(sb);
        scroll.setViewportView(txt);
        add(scroll, "w 100%");
    }
    
    public void refresh() {
        revalidate();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(88, 127, 107));
        grphcs.fillRect(50 , 1 - getHeight() , getWidth() - 100, getHeight());

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(43, 44, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
