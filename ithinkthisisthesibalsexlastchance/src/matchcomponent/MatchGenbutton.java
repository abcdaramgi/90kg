
package matchcomponent;

import chatcomponent.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;


public class MatchGenbutton extends JButton{

    public MatchGenbutton() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        init();
    }
    
    private Icon iconSelected;
    

    public Icon getIconSelected() {
        return iconSelected;
    }

    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
    
    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if (bln) {
            setForeground(new Color(240, 240, 240));
        } else {            
            setForeground(new Color(153, 153, 153));
        }   
    }


    
    private void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if(!isSelected()){
                    setForeground(new Color(170, 170, 170));
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if(!isSelected()){
                    setForeground(new Color(153, 153, 153));
                }
            }
        });
    }
   
    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        if(isSelected()) {
            grphcs.setColor(new Color(144, 144, 144));
            grphcs.fillRect(0, 0 , getWidth(), getHeight());
        }
        else{
        //    grphcs.setColor(new Color(115, 116, 112));
        //    grphcs.fillRect(0, getHeight() - 1 , getWidth(), getHeight());
         //   grphcs.clearRect(TOP, TOP, WIDTH, HEIGHT);
        }
    }
}
