
package component;

import javax.swing.Icon;
import javax.swing.JButton;

        
public class Button extends JButton{
    
    private Icon buttonNormal;
    private Icon buttonEntered;
    private Icon buttonSelected;
    
    public Icon getNormal() {
        return buttonNormal;
    }

    public void setNormal(Icon normal) {
        this.buttonNormal = normal;
    }
    
    public Icon getEntered() {
        return buttonEntered;
    }
    
    public void setEntered(Icon enter) {
        this.buttonEntered = enter;
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

    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if(bln) {
            setIcon(buttonSelected);
        } else  {
            setIcon(buttonNormal);
        }
    }
    
//    @Override
//    public void setEntered(boolean bln) {
//        super.
//    }

}

