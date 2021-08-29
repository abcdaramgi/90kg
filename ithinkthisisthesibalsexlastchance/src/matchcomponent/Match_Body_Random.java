
package matchcomponent;


public class Match_Body_Random extends javax.swing.JPanel {


    public Match_Body_Random() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();
        lp = new javax.swing.JLayeredPane();
        image = new swing.ImageAvatar();
        pic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(50, 54, 54));

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(50, 54, 54));

        lp.setMaximumSize(new java.awt.Dimension(500, 500));

        image.setBorderColor(new java.awt.Color(159, 232, 202));
        image.setBorderSize(2);
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/다람쥐.jpg"))); // NOI18N
        image.setMaximumSize(new java.awt.Dimension(200, 200));
        image.setMinimumSize(new java.awt.Dimension(200, 200));
        image.setPreferredSize(new java.awt.Dimension(200, 200));

        pic.setFont(new java.awt.Font("SB 어그로 Bold", 0, 108)); // NOI18N
        pic.setForeground(new java.awt.Color(255, 255, 255));
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setText("?");
        pic.setMaximumSize(new java.awt.Dimension(200, 200));
        pic.setMinimumSize(new java.awt.Dimension(200, 200));
        pic.setPreferredSize(new java.awt.Dimension(200, 200));
        image.add(pic);
        pic.setBounds(0, 0, 200, 200);

        lp.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        scroll.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private swing.ImageAvatar image;
    private javax.swing.JLayeredPane lp;
    private javax.swing.JLabel pic;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
