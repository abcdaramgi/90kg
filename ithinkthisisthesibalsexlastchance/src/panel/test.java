
package panel;

import java.awt.CardLayout;
import java.text.Normalizer.Form;
import matchcomponent.Match_Body_Choose;
import matchcomponent.Match_Body_Random;


public class test extends javax.swing.JPanel {

    int card = 0;
    
    
    public test() {
        initComponents();
                    choosematch.setVisible(false);
            randommatch.setVisible(false);
        init();
        

    }

    public void init(){
//        CardLayout cl = (CardLayout) pan_body.getLayout();
//        pan_body.add(randommatch, "rand");
//        pan_body.add(choosematch, "choo");
//        if(card == 0){
//            cl.show(pan_body, "rand");
//        }
//        else{
//            cl.show(pan_body, "choo");
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_title = new javax.swing.JPanel();
        random = new matchcomponent.Matchbutton();
        choose = new matchcomponent.Matchbutton();
        pan_body = new javax.swing.JPanel();
        choosematch = new matchcomponent.Match_Body_Choose();
        randommatch = new matchcomponent.Match_Body_Random();

        setBackground(new java.awt.Color(37, 41, 39));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        pan_title.setBackground(new java.awt.Color(37, 41, 39));
        pan_title.setMaximumSize(new java.awt.Dimension(800, 82));
        pan_title.setMinimumSize(new java.awt.Dimension(33, 82));
        pan_title.setPreferredSize(new java.awt.Dimension(601, 82));
        pan_title.setLayout(new javax.swing.BoxLayout(pan_title, javax.swing.BoxLayout.X_AXIS));

        random.setForeground(new java.awt.Color(153, 153, 153));
        random.setText("랜덤매칭");
        random.setFont(new java.awt.Font("SB 어그로 Bold", 0, 18)); // NOI18N
        random.setMaximumSize(new java.awt.Dimension(800, 82));
        random.setMinimumSize(new java.awt.Dimension(105, 82));
        random.setPreferredSize(new java.awt.Dimension(400, 82));
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });
        pan_title.add(random);

        choose.setForeground(new java.awt.Color(153, 153, 153));
        choose.setText("선택매칭");
        choose.setFont(new java.awt.Font("SB 어그로 Bold", 0, 18)); // NOI18N
        choose.setMaximumSize(new java.awt.Dimension(800, 82));
        choose.setMinimumSize(new java.awt.Dimension(105, 82));
        choose.setPreferredSize(new java.awt.Dimension(400, 82));
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        pan_title.add(choose);

        add(pan_title);

        pan_body.setLayout(new java.awt.CardLayout());
        pan_body.add(choosematch, "card2");
        pan_body.add(randommatch, "card3");

        add(pan_body);
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        if(!random.isSelected()) {
            random.setSelected(true);
            choose.setSelected(false);  
            card = 0;
            choosematch.setVisible(false);
            randommatch.setVisible(true);
        }
    }//GEN-LAST:event_randomActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        if(!choose.isSelected()) {
            choose.setSelected(true);
            random.setSelected(false);
            card = 1;
            choosematch.setVisible(true);
            randommatch.setVisible(false);
        }
    }//GEN-LAST:event_chooseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private matchcomponent.Matchbutton choose;
    private matchcomponent.Match_Body_Choose choosematch;
    private javax.swing.JPanel pan_body;
    private javax.swing.JPanel pan_title;
    private matchcomponent.Matchbutton random;
    private matchcomponent.Match_Body_Random randommatch;
    // End of variables declaration//GEN-END:variables
}
