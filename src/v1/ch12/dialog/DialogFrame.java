package v1.ch12.dialog;


import javax.swing.*;

/**
 * @program: Core_Java
 * @description: dialog
 * @author: Jun Wang
 * @create: 2019-01-23 14:18
 */
public class DialogFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    private AboutDialog dialog;

    public DialogFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(event ->{
            if (dialog == null) dialog = new AboutDialog(DialogFrame.this);
            dialog.setVisible(true);
        });
        fileMenu.add(aboutItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(event -> System.exit(0));
        fileMenu.add(exitItem);
    }
}
