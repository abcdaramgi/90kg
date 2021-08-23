
package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

        
public class Test_Button extends JToggleButton{
    int i = 0;
    private Icon buttonNormal;
    private Icon buttonEntered;
    private Icon buttonClicked;
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

    public Icon getClicked() {
        return buttonSelected;
    }

    public void setClicked(Icon click) {
        this.buttonSelected = click;
    }
    
    public Icon getSelected() {
        return buttonSelected;
    }

    public void setSelected(Icon select) {
        this.buttonSelected = select;
    }
    
    public Test_Button(){
        setContentAreaFilled(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        addMouseListener(new MouseAdapter(){
            @Override  
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(0,255,0));
                setIcon(buttonEntered);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(0,0,255));
                setIcon(buttonNormal);
            }
        });
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setBackground(new Color(255,0,0));
                setIcon(buttonClicked);
            }
        });
    

        
    }
}
