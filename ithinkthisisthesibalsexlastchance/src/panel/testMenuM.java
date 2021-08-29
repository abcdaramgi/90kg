
package panel;

import chatcomponent.UserItem;
import java.awt.Color;
import static java.awt.SystemColor.menu;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;


public class testMenuM extends javax.swing.JPanel {


    public testMenuM() {
        initComponents();
        init();
    }

    private void init() {
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getViewport().setBackground(new Color(40,46,44));        //이렇게 안하면 스크롤 배경색깔 안바뀜
        friend.setLayout(new MigLayout("fillx", "0[fill]0", "0[fill]0"));
    }
    

    
    public void showMatching() {
        friend.removeAll();
        refreshList();
        
    }
    
    public void showChatting() {
        friend.removeAll();
        for(int i = 0 ; i < 25 ; i++ ) {
            friend.add(new UserItem("노랑통닭" + i, "ㅎㅇ"), "wrap");
        }
        refreshList();
        
    }

    private void refreshList() {
        friend.repaint();
        friend.revalidate();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        friend = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(40, 46, 44));

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        friend.setOpaque(true);

        javax.swing.GroupLayout friendLayout = new javax.swing.GroupLayout(friend);
        friend.setLayout(friendLayout);
        friendLayout.setHorizontalGroup(
            friendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        friendLayout.setVerticalGroup(
            friendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        scroll.setViewportView(friend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scroll)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane friend;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
