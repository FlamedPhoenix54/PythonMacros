package me.Mythical83.Macros;

import me.Mythical83.Macros.AutoMiner.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events implements ActionListener {

    private final String[] args = new String[1];
    private static final me.Mythical83.Macros.AutoMiner.Window w = new Window();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Miner")) {
            if (w.isVisible()){

            } else if (!w.isVisible()) {
                w.setVisible(true);
            }
        }
    }
}
