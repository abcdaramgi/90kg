package chatcomponent;

import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBarBig;

public class Chat_Body extends javax.swing.JPanel {

    public Chat_Body() {
        initComponents();
        init();
        addDate("2021년 08월 28일 토요일");

    }

    private void init() {
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        scroll.setVerticalScrollBar(new ScrollBarBig());
        scroll.getVerticalScrollBar().setBackground(new Color(50, 54, 54));
    }

    public void addMyChat(String text) {
        Chat_My item = new Chat_My();
        item.setText(text);
        body.add(item, "wrap, al right, w ::80%");
        body.repaint();
        body.revalidate();
        scrollToBottom();
    }

    public void addYourChat(String text, String user, Icon ...image) {
        Chat_Your item = new Chat_Your();
        item.setText(text);
        body.add(item, "wrap, w ::80%");
        body.repaint();
        body.revalidate();
    }

    public void addDate(String date) {
        Chat_Date item = new Chat_Date();
        item.setDate(date);
        body.add(item, "wrap, al center");
        body.repaint();
        body.revalidate();
    }
    
    public void addTest(String user, Icon image) {
        Chat_Your_Profile item = new Chat_Your_Profile();
        item.setImageProfile(image);
        body.add(item, "wrap");
        body.repaint();
        body.revalidate();
    }
    
    private void scrollToBottom() {
        JScrollBar verticalBar = scroll.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(50, 54, 54));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        scroll.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
