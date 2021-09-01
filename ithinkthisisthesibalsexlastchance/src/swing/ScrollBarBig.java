
package swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;


public class ScrollBarBig extends JScrollBar{
    
    public ScrollBarBig() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(10, 0));
        setBackground(new Color(40, 46, 44));
        setForeground(new Color(255, 255, 255));
        
        setUnitIncrement(22);
    }
}
