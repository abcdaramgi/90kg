
package panel;

import component.MenuBigItem;
import component.MenuSmallItem;
import java.awt.Color;
import static java.awt.SystemColor.menu;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;


public class Menu extends javax.swing.JPanel {


    public Menu() {
        initComponents();
        init();
    }

    private void init() {
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getViewport().setBackground(new Color(40,46,44));        //이렇게 안하면 스크롤 배경색깔 안바뀜
        menu.setLayout(new MigLayout("fillx", "0[fill]0", "0[fill]0"));
        showMatchingMenu();
    }
    
    public void showNothing() {
        menu.removeAll();
        menu.repaint();
        menu.revalidate();
    }
    
    public void showFriendMenu() {
        
    }
    
    public void showMatchingMenu() {
        for(int i = 0 ; i < 20 ; i++ ) {
            menu.add(new MenuBigItem("노랑통닭" + i), "wrap");
        }
    }
    
    public void showComunityMenu() {
        for(int i = 0 ; i < 20 ; i++ ) {
            menu.add(new MenuBigItem("빨강통닭" + i), "wrap");
        }
    }
    
    public void showSettingMenu() {
        for(int i = 0 ; i < 20 ; i++ ) {
            menu.add(new MenuBigItem("파랑통닭" + i), "wrap");
        }
    }
    
    public void showChatMenu() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        menu = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(40, 46, 44));

        scroll.setBackground(new java.awt.Color(40, 46, 44));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menu.setBackground(new java.awt.Color(40, 46, 44));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        scroll.setViewportView(menu);

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
    private javax.swing.JLayeredPane menu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
