
package panel;

import event.PublicEvent;
import matchcomponent.Match_Body_Choose;
import matchcomponent.Match_Body_Random;
import matchcomponent.Match_Bottom;
import matchcomponent.Match_Title;
import net.miginfocom.swing.MigLayout;


public class Match extends javax.swing.JPanel {


    public Match() {
        initComponents();
        init();
    }

    public void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[fill, 100%]0[shrink 0]0"));
//        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[fill, 100%]0[shrink 0]0"));
        Match_Title matchTitle = new Match_Title();
        Match_Body_Random matchBody = new Match_Body_Random();
        Match_Bottom matchBottom = new Match_Bottom();        
        
        test test = new test();
        add(test, "wrap");
//        add(matchTitle, "wrap, h 82!");
//        add(matchBody, "wrap");
        add(matchBottom);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 51, 51));

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
