
package test;

import net.miginfocom.swing.MigLayout;


public class Test_Form extends javax.swing.JPanel {

    public Test_Form() {
        initComponents();
        init();
    }
    
    private void init(){
        setLayout(new MigLayout("fillx, filly"));
//        this.add(new Test_Menu_Item(), "gapleft 0");
        for(int i = 0 ; i < 3 ; i++){
            this.add(new Test_Select(), "wrap");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
