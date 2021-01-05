package me.Mythical83.Macros;

import javax.swing.*;
import java.awt.*;
import static me.Mythical83.Macros.Components.mining;

public class Window extends JFrame {

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    public Window() {
        super("Macros");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setVisible(true);

        Container content = getContentPane();
        content.setLayout(null);

        add(mining());
    }

}
