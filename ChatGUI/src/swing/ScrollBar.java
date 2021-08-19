/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JScrollBar;

/**
 *
 * @author Admin
 */
public class ScrollBar extends JScrollBar{
    
    public ScrollBar() {
        setUI(new ModernScrollBarUI());
    }
}
