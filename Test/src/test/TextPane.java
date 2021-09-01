

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.*;
import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Field;

public class TextPane {
    private JPanel panelMain;
    private JPanel panelButtons;
    private JButton buttonLoad;
    private JScrollPane scrollPane;
    private JTextPane textPane;
    private JButton buttonSave;
    private JButton buttonBackgroundColor;
    private JComboBox comboBoxBackgroundColor;
    private JButton buttonBackgroundColorColorChooser;
    private static String[] BACKGROUND_COLORS = new String[]{"WHITE", "BLACK", "RED", "GREEN", "BLUE", "CYAN", "MAGENTA", "YELLOW", "GRAY"};

    public TextPane() {

        textPane.setContentType("text/rtf");
        textPane.setEditorKit(new RTFEditorKit());

        // background color
        for (String str : BACKGROUND_COLORS) {
            comboBoxBackgroundColor.addItem(str);
        }

        buttonLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                loadRtf("textpane_rtf.rtf");
            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                saveRtf("textpane_rtf.rtf");
            }
        });

        buttonBackgroundColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                changeBackgroundColor();
            }
        });

        buttonBackgroundColorColorChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                changeBackgroundColorColorChooser();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new TextPane().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("TextPane Background Color");
        frame.setSize(550, 300);
        frame.setVisible(true);
    }

    public void loadRtf(String filename) {
        RTFEditorKit RTF_KIT = new RTFEditorKit();
        textPane.setContentType("text/rtf");
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(filename);
            final DefaultStyledDocument styledDocument = new DefaultStyledDocument(new StyleContext());
            RTF_KIT.read(inputStream, styledDocument, 0);
            textPane.setDocument(styledDocument);
            // delete added last line
            String content = textPane.getDocument().getText(0, textPane.getDocument().getLength());
            int lastLineBreak = content.lastIndexOf('\n');
            textPane.getDocument().remove(lastLineBreak, textPane.getDocument().getLength() - lastLineBreak);
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
        textPane.requestFocus();
    }

    public void saveRtf(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            RTFEditorKit kit = (RTFEditorKit) textPane.getEditorKit();
            StyledDocument doc = textPane.getStyledDocument();
            int len = doc.getLength();
            kit.write(fos, doc, 0, len);
            fos.close();
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
        textPane.requestFocus();
    }

    private void changeBackgroundColor() {
        String backgroundColor = String.valueOf(comboBoxBackgroundColor.getSelectedItem());
        Color color = null;
        try {
            Class cobj = ClassLoader.getSystemClassLoader().loadClass("java.awt.Color");
            Field field = cobj.getField(backgroundColor);
            color = (Color) field.get(cobj);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        textPane.setBackground(color);
        textPane.requestFocus();
    }

    private void changeBackgroundColorColorChooser() {
        Color color = JColorChooser.showDialog(null,
                "Farbauswahl", null);
        textPane.setBackground(color);
        textPane.requestFocus();
    }

}
