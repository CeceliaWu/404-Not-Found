package javaEditor;

import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jgoodies.looks.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JavaEditorFrame jf = new JavaEditorFrame();
        jf.setVisible(true);
    }
}
