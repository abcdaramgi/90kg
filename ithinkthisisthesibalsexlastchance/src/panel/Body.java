
package panel;

import net.miginfocom.swing.MigLayout;


public class Body extends javax.swing.JLayeredPane {


    public Body() {
        initComponents();
        init();
    }
    
    public void init() {
        setLayout(new MigLayout("fillx, filly", "0[fill]00[fill, 100%]0", "0[fill]0"));
        add(new Menu(), "w 200:200:200, h 500:615:");
        //add(new Chat(), "w 300:800: , h 500:615:");                                               //채팅버튼눌렸을때는 이색기
        add(new Match(), "w 300:800: , h 500:615:");                                                //매칭버튼눌렸을때는 이색기
                                                                                                    //근데 버튼은 저기 있는데 이색기들을 어떻게 불러오냐
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(40, 46, 44));

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
