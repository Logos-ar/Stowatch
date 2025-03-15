package program;

import javax.swing.*;
import javax.swing.JComponent;

public class Stopwatch {
    JFrame frame;
    JTabbedPane panes;
    Stopwatch(){
        frame = new JFrame("Stopwatch");
        panes = new JTabbedPane();

        ImageIcon icon = new ImageIcon("src/images/watchIcon.png");

        for (int i = 0; i < 4; i++){
            panes.addTab("Tab 1", icon, new JComponent() {
            }, "Does Nothing");
        }

        panes.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        panes.setFocusable(false);

        frame.add(panes);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
