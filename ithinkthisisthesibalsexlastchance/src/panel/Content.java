
package panel;

import matchcomponent.Match_Body_Random;
import matchcomponent.Match_Bottom;
import matchcomponent.Match_Title;
import net.miginfocom.swing.MigLayout;


public class Content extends javax.swing.JPanel {


    public Content() {
        initComponents();
        init();
    }
    
    public void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[fill, 100%]0[shrink 0]0"));
        Match_Title matchTitle = new Match_Title();
        test matchBody = new test();
        Match_Bottom matchBottom = new Match_Bottom();        
        
        add(matchTitle, "wrap, h 82!");
        add(matchBody, "wrap");
        add(matchBottom);
    }

    public void setRandom() {
        
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
            .addGap(0, 615, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
