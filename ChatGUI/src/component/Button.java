
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;

        
public class Button extends JButton{
    
    private Icon buttonNormal;
    private Icon buttonSelected;
    
    public Icon getNormal() {
        return buttonNormal;
    }

    public void setNormal(Icon normal) {
        this.buttonNormal = normal;
    }

    public Icon getSelected() {
        return buttonSelected;
    }

    public void setSelected(Icon select) {
        this.buttonSelected = select;
    }

    
    public Button() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
    }
    
    ActionListener listener = new ActionListener() {            
        
        @Override
        public void actionPerformed(ActionEvent ev) {
            setBackground(Color.RED);
        }
    };
    
    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
            if(bln) {
                setIcon(buttonSelected);
            } else  {
                setIcon(buttonNormal);
            }
    }
    
    @Override
    protected void paintComponent(Graphics grphcs)  {
        super.paintComponent(grphcs);
        if(isSelected()) {
            grphcs.setColor(new Color(134, 204, 185));
            grphcs.fillRect(4 - getWidth(), 0 , getWidth(), getHeight());
        }
    }
    
    
}
