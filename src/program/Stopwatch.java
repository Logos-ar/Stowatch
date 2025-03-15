package program;

import javax.swing.*;

public class Stopwatch {
    JFrame frame;
    JTabbedPane panes;
    Stopwatch(){
        frame = new JFrame("Stopwatch");
        panes = new JTabbedPane();




        frame.setLocationRelativeTo(null);
        frame.setSize(400, 500);
        frame.pack();

    }
}
