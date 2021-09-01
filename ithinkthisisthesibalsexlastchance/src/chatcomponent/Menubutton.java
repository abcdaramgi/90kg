
package chatcomponent;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;


public class Menubutton extends JButton{

    public Menubutton() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        init();
    }
    
    private Icon iconNormal;
    private Icon iconSelected;
    
    public Icon getIconNormal() {
        return iconNormal;
    }

    public void setIconNormal(Icon iconNormal) {
        this.iconNormal = iconNormal;
    }

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
            setIcon(iconSelected);
            swap();
        } else {
            setIcon(iconNormal);
        }   
    }
    
    public void swap() {
        
    }
    
    private void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(50, 54, 54));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(40, 46, 44));
            }
        });
    }
    
}
