
package panel;

import net.miginfocom.swing.MigLayout;


public class Body extends javax.swing.JPanel {


    public Body() {
        initComponents();
        init();
    }
    
    public void init() {
        setLayout(new MigLayout("fillx, filly", "0[fill,0!]0[fill,100!]0[fill, 100%]0", "0[fill]0"));
        add(new Toolbar(), "w 100:100:100, h 320:695:");
        add(new Menu(), "w 300:300:300, h 320:695:");
        add(new Content(), "w 880:880: , h 320:695:");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
