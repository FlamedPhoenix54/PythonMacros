package me.Mythical83.Macros;

import javax.swing.*;

public class Components {

    private static JButton mining;

    public static JButton mining() {
        mining = new JButton("Miner");
        mining.setBounds(10, 10, 100, 100);

        mining.addActionListener(new Events());

        return mining;
    }

}
