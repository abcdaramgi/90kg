/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author USER-PC
 */
public class TextAreal implements ActionListener{

    JPanel text;
    JFrame frame;
    JPanel panel;
    
    public static void main (String[] args) {
        TextAreal gui = new TextAreal();
        gui.go();
    }
    
    public void go() {
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("zebal sibal");
        button.addActionListener(this);
        text = new JPanel();
        text.setPreferedSize.(new Dimension(200, 150));
        
        
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel.add(scroller);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        Test_Item item = new Test_Item();
        text.add(item);
        text.repaint();
        text.revalidate();
    }
    
}
