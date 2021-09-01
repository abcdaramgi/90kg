
package matchcomponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Match_Title extends javax.swing.JPanel {


    public Match_Title() {
        initComponents();
        
    }
    
    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(115, 116, 112));
        grphcs.fillRect(50, getHeight() - 1 , getWidth() - 100, getHeight());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        random = new matchcomponent.Matchbutton();
        choose = new matchcomponent.Matchbutton();

        setBackground(new java.awt.Color(37, 41, 39));
        setLayout(new java.awt.GridLayout(1, 0));

        random.setForeground(new java.awt.Color(153, 153, 153));
        random.setText("랜덤매칭");
        random.setFont(new java.awt.Font("SB 어그로 Bold", 0, 18)); // NOI18N
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });
        add(random);

        choose.setForeground(new java.awt.Color(153, 153, 153));
        choose.setText("선택매칭");
        choose.setFont(new java.awt.Font("SB 어그로 Bold", 0, 18)); // NOI18N
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        add(choose);
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        if(!random.isSelected()) {
            random.setSelected(true);
            choose.setSelected(false);
        }
    }//GEN-LAST:event_randomActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        if(!choose.isSelected()) {
            choose.setSelected(true);
            random.setSelected(false);
        }
    }//GEN-LAST:event_chooseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private matchcomponent.Matchbutton choose;
    private matchcomponent.Matchbutton random;
    // End of variables declaration//GEN-END:variables
}
