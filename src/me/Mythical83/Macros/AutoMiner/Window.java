package me.Mythical83.Macros.AutoMiner;

import javax.swing.*;
import java.awt.*;
import me.Mythical83.Macros.AutoMiner.Components;

public class Window extends JFrame {

    public Window() {
        super("AutoMiner");
        setSize(500, 400);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Container content = getContentPane();
        content.setLayout(null);

        add(Components.mineCoal());
    }

}
