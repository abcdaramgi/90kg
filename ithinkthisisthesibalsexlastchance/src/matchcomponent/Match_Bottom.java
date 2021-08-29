
package matchcomponent;

import java.awt.Color;
import java.awt.Graphics;


public class Match_Bottom extends javax.swing.JPanel {


    public Match_Bottom() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lp = new javax.swing.JLayeredPane();
        start = new matchcomponent.MatchStbutton();

        setBackground(new java.awt.Color(37, 41, 39));

        lp.setMaximumSize(new java.awt.Dimension(500, 70));
        lp.setMinimumSize(new java.awt.Dimension(250, 70));
        lp.setPreferredSize(new java.awt.Dimension(250, 70));

        start.setBackground(new java.awt.Color(159, 232, 202));
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setText("매칭시작");
        start.setFont(new java.awt.Font("SB 어그로 Bold", 0, 48)); // NOI18N
        start.setMaximumSize(new java.awt.Dimension(500, 70));
        start.setMinimumSize(new java.awt.Dimension(250, 70));
        start.setPreferredSize(new java.awt.Dimension(250, 70));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        lp.setLayer(start, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(lp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        
    }//GEN-LAST:event_startActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane lp;
    private matchcomponent.MatchStbutton start;
    // End of variables declaration//GEN-END:variables
}
